package com.glc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.glc.Bean.WeatherBean;
import com.glc.adapter.ReAdapter;
import com.glc.adapter.ReAdapter2;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView tv_zhunagtai;
    String cityName = "泰安";
    private RecyclerView recyclerView;
    private RecyclerView recyclerView2;
    private TextView tv1, tv2, tv3, tv4, tv5, tv6, tv11, tv22, tv33, tv44, tv55, tv66;
    private TextView sheshidu;
    private TextView fengxiang;
    private ImageView img_zhungkuang;
    private SwipeRefreshLayout refreshLayout;
    private WeatherBean weatherBean;
    private TextView tv_cityName;
    private EditText editText;
    private Button btn_chaxun;
    private TextView qiehuan;
    private TextView lianxiwo;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_zhunagtai = findViewById(R.id.tv_zhuangtai);
        sheshidu = findViewById(R.id.tv_sheshidu);
        fengxiang = findViewById(R.id.tv_fengxiang);
        img_zhungkuang = findViewById(R.id.img_now_zhuangkuang);
        recyclerView = findViewById(R.id.ry_recycleView);
        recyclerView2 = findViewById(R.id.ry_recycleView2);
        refreshLayout = findViewById(R.id.srl_swipe);
        tv_cityName = findViewById(R.id.tv_cityName);
        qiehuan = findViewById(R.id.tv_qiehuan);
        lianxiwo = findViewById(R.id.tv_lianxiwo);

        lianxiwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                //intent 动作
                intent.setAction("android.intent.action.VIEW");
                //打开的网址
                intent.setData(Uri.parse("http://www.gaolicong.xyz"));
                startActivity(intent);
            }
        });

        tv_cityName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialog myDialog = new MyDialog(MainActivity.this);
                myDialog.show();
            }
        });
        qiehuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialog myDialog = new MyDialog(MainActivity.this);
                myDialog.show();
            }
        });

        //下拉刷新
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        selectWeather(tv_cityName.getText().toString());
                    }
                }, 3000);
            }
        });

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this);
        linearLayoutManager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView2.setLayoutManager(linearLayoutManager1);

        tv1 = findViewById(R.id.foot_tv1);
        tv2 = findViewById(R.id.foot_tv2);
        tv3 = findViewById(R.id.foot_tv3);
        tv4 = findViewById(R.id.foot_tv4);
        tv5 = findViewById(R.id.foot_tv5);
        tv6 = findViewById(R.id.foot_tv6);
        tv11 = findViewById(R.id.foot_tv11);
        tv22 = findViewById(R.id.foot_tv22);
        tv33 = findViewById(R.id.foot_tv33);
        tv44 = findViewById(R.id.foot_tv44);
        tv55 = findViewById(R.id.foot_tv55);
        tv66 = findViewById(R.id.foot_tv66);

        //得到sp存储的值
        sharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE);
        String s_chengshi = sharedPreferences.getString("chengshi", "");
        //判断sp的值时候为空 为空就执行默认城市
        if (s_chengshi.equals("")) {
            selectWeather(cityName);
        } else {//否则查询sp存储的值
            selectWeather(s_chengshi);
        }
    }

    /**
     * 请求
     *注意请将秘钥替换为：自己到京东万象申请秘钥
     * @param cityName 城市名称
     */
    private void selectWeather(String cityName) {
        JSONObject jsonObject = new JSONObject();
        String url = "https://way.jd.com/he/freeweather?city=" + cityName + "&appkey=秘钥";
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, jsonObject, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject jsonObject) {
                Gson gson = new Gson();
                weatherBean = gson.fromJson(jsonObject.toString(), WeatherBean.class);

                if(weatherBean.getResult().getHeWeather5().get(0).getStatus().equals("unknown location")){
                    Toast.makeText(MainActivity.this, "输入城市有误", Toast.LENGTH_SHORT).show();
                }else {
                    tv_zhunagtai.setText(weatherBean.getResult().getHeWeather5().get(0).getNow().getCond().getTxt());
                    sheshidu.setText(weatherBean.getResult().getHeWeather5().get(0).getNow().getTmp() + "℃");
                    fengxiang.setText(weatherBean.getResult().getHeWeather5().get(0).getNow().getWind().getDir());
                    //根据天气状况 来判断图片
                    if (weatherBean.getResult().getHeWeather5().get(0).getNow().getCond().getTxt().equals("多云") || weatherBean.getResult().getHeWeather5().get(0).getNow().getCond().getTxt().equals("阴")) {
                        img_zhungkuang.setImageResource(R.mipmap.yin);
                    } else if (weatherBean.getResult().getHeWeather5().get(0).getNow().getCond().getTxt().equals("晴")) {
                        img_zhungkuang.setImageResource(R.mipmap.qinglang);
                    } else if (weatherBean.getResult().getHeWeather5().get(0).getNow().getCond().getTxt().equals("雨夹雪") || weatherBean.getResult().getHeWeather5().get(0).getNow().getCond().getTxt().equals("小雪")) {
                        img_zhungkuang.setImageResource(R.mipmap.xiaoxue);
                    } else if (weatherBean.getResult().getHeWeather5().get(0).getNow().getCond().getTxt().equals("小雨")) {
                        img_zhungkuang.setImageResource(R.mipmap.xiaoyu);
                    } else if (weatherBean.getResult().getHeWeather5().get(0).getNow().getCond().getTxt().equals("中雨") || weatherBean.getResult().getHeWeather5().get(0).getNow().getCond().getTxt().equals("大雨")) {
                        img_zhungkuang.setImageResource(R.mipmap.dayu);
                    } else if (weatherBean.getResult().getHeWeather5().get(0).getNow().getCond().getTxt().equals("雷阵雨")) {
                        img_zhungkuang.setImageResource(R.mipmap.leizhenyu);
                    }else if (weatherBean.getResult().getHeWeather5().get(0).getNow().getCond().getTxt().equals("雾")) {
                        img_zhungkuang.setImageResource(R.mipmap.wu);
                    }
                    //3小时 recyclerView滑动适配
                    ReAdapter reAdapter = new ReAdapter(weatherBean.getResult().getHeWeather5().get(0).getHourly_forecast());
                    recyclerView.setAdapter(reAdapter);
                    //未来七天  recyclerView滑动适配
                    ReAdapter2 reAdapter2 = new ReAdapter2(weatherBean.getResult().getHeWeather5().get(0).getDaily_forecast());
                    recyclerView2.setAdapter(reAdapter2);
                    tv_cityName.setText(weatherBean.getResult().getHeWeather5().get(0).getBasic().getCity());
                    //生活指数部分
                    tv1.setText("舒适度指数：" + weatherBean.getResult().getHeWeather5().get(0).getSuggestion().getComf().getBrf());
                    tv2.setText("洗车指数：" + weatherBean.getResult().getHeWeather5().get(0).getSuggestion().getCw().getBrf());
                    tv3.setText("穿衣指数：" + weatherBean.getResult().getHeWeather5().get(0).getSuggestion().getDrsg().getBrf());
                    tv4.setText("感冒指数：" + weatherBean.getResult().getHeWeather5().get(0).getSuggestion().getFlu().getBrf());
                    tv5.setText("运动指数：" + weatherBean.getResult().getHeWeather5().get(0).getSuggestion().getSport().getBrf());
                    tv6.setText("旅游指数：" + weatherBean.getResult().getHeWeather5().get(0).getSuggestion().getTrav().getBrf());

                    tv11.setText("      " + weatherBean.getResult().getHeWeather5().get(0).getSuggestion().getComf().getTxt());
                    tv22.setText("      " + weatherBean.getResult().getHeWeather5().get(0).getSuggestion().getCw().getTxt());
                    tv33.setText("      " + weatherBean.getResult().getHeWeather5().get(0).getSuggestion().getDrsg().getTxt());
                    tv44.setText("      " + weatherBean.getResult().getHeWeather5().get(0).getSuggestion().getFlu().getTxt());
                    tv55.setText("      " + weatherBean.getResult().getHeWeather5().get(0).getSuggestion().getSport().getTxt());
                    tv66.setText("      " + weatherBean.getResult().getHeWeather5().get(0).getSuggestion().getTrav().getTxt());
                    refreshLayout.setRefreshing(false);
                    Toast.makeText(MainActivity.this, "更新时间" + weatherBean.getResult().getHeWeather5().get(0).getBasic().getUpdate().getLoc(), Toast.LENGTH_SHORT).show();

                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Toast.makeText(MainActivity.this, "网络有误", Toast.LENGTH_SHORT).show();
                refreshLayout.setRefreshing(false);
            }
        });
        requestQueue.add(jsonObjectRequest);
    }

    /**
     * Dialog对话框
     */
    class MyDialog extends Dialog {

        public MyDialog(Context context) {
            super(context);
        }
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            setContentView(R.layout.dialog);
            editText = findViewById(R.id.edit_chengshi);
            btn_chaxun = findViewById(R.id.btn_quding);
            btn_chaxun.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("dddddddd", "dfgagfagdfg");
                    if (editText.getText().toString().equals("")) {
                        Toast.makeText(MainActivity.this, "输入为空,重新输入", Toast.LENGTH_SHORT).show();
                    } else {
                        selectWeather(editText.getText().toString());
                        //sp存储
                        sharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("chengshi", editText.getText().toString().trim());
                        editor.commit();
                        dismiss();
                    }
                }
            });
        }
    }
}




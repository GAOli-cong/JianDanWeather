package com.glc.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.glc.Bean.WeatherBean;
import com.glc.R;

import java.util.List;

public class ReAdapter2 extends RecyclerView.Adapter<ReAdapter2.ViewHoloder> {
    public ReAdapter2(List<WeatherBean.ResultBean.HeWeather5Bean.DailyForecastBean> dayList) {
        this.dayList = dayList;
    }

    private List<WeatherBean.ResultBean.HeWeather5Bean.DailyForecastBean> dayList;
    @NonNull
    @Override
    public ReAdapter2.ViewHoloder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list2,parent,false);
        ViewHoloder holoder=new ViewHoloder(view);
        return holoder;
    }

    @Override
    public void onBindViewHolder(@NonNull ReAdapter2.ViewHoloder holder, int position) {
        WeatherBean.ResultBean.HeWeather5Bean.DailyForecastBean dailyForecastBean = dayList.get(position);
        holder.re2_tv1.setText(dailyForecastBean.getDate().substring(5)+"");
        holder.re2_tv2.setText(dailyForecastBean.getCond().getTxt_d());
        holder.re2_tv3.setText(dailyForecastBean.getTmp().getMax()+"℃");
        holder.re2_tv4.setText(dailyForecastBean.getTmp().getMin()+"℃");
        if(dailyForecastBean.getCond().getTxt_d().equals("多云")||dailyForecastBean.getCond().getTxt_d().equals("阴")){
            holder.re2_img.setImageResource(R.mipmap.yin);
        }else if (dailyForecastBean.getCond().getTxt_d().equals("晴")){
            holder.re2_img.setImageResource(R.mipmap.qinglang);
        }else if(dailyForecastBean.getCond().getTxt_d().equals("雨夹雪")||dailyForecastBean.getCond().getTxt_d().equals("小雪")){
            holder.re2_img.setImageResource(R.mipmap.xiaoxue);
        }else if(dailyForecastBean.getCond().getTxt_d().equals("小雨")){
            holder.re2_img.setImageResource(R.mipmap.xiaoyu);
        }else if(dailyForecastBean.getCond().getTxt_d().equals("中雨")||dailyForecastBean.getCond().getTxt_d().equals("大雨")){
            holder.re2_img.setImageResource(R.mipmap.dayu);
        }else if(dailyForecastBean.getCond().getTxt_d().equals("雷阵雨")){
            holder.re2_img.setImageResource(R.mipmap.leizhenyu);
        }else if(dailyForecastBean.getCond().getTxt_d().equals("雾")){
            holder.re2_img.setImageResource(R.mipmap.wu);
        }
    }

    @Override
    public int getItemCount() {
        return dayList.size();
    }

    public class ViewHoloder extends RecyclerView.ViewHolder {
        TextView re2_tv1;
        TextView re2_tv2;
        TextView re2_tv3;
        TextView re2_tv4;
        ImageView re2_img;
        public ViewHoloder(@NonNull View itemView) {
            super(itemView);
            re2_tv1=itemView.findViewById(R.id.re2_tv1);
            re2_tv2=itemView.findViewById(R.id.re2_tv2);
            re2_tv3=itemView.findViewById(R.id.re2_tv3);
            re2_tv4=itemView.findViewById(R.id.re2_tv4);
            re2_img=itemView.findViewById(R.id.re2_img_zhuangtai);
        }
    }
}

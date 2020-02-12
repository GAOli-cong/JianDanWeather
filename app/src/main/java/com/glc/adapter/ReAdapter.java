package com.glc.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.glc.Bean.WeatherBean;
import com.glc.R;

import java.util.List;

public class ReAdapter extends RecyclerView.Adapter<ReAdapter.ViewHolder> {
    private List<WeatherBean.ResultBean.HeWeather5Bean.HourlyForecastBean> mlist;

    public ReAdapter(List<WeatherBean.ResultBean.HeWeather5Bean.HourlyForecastBean> mlist) {
        this.mlist = mlist;
    }

    @NonNull
    @Override
    public ReAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ReAdapter.ViewHolder holder, int position) {
        WeatherBean.ResultBean.HeWeather5Bean.HourlyForecastBean hourlyForecastBean = mlist.get(position);
        holder.re_tv1.setText(hourlyForecastBean.getDate().substring(11) + "");
        holder.re_tv2.setText(hourlyForecastBean.getCond().getTxt() + "");
        holder.re_tv3.setText(hourlyForecastBean.getTmp() + "℃");

    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView re_tv1;
        TextView re_tv2;
        TextView re_tv3;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            re_tv1=itemView.findViewById(R.id.re_tv1);
            re_tv2=itemView.findViewById(R.id.re_tv2);
            re_tv3=itemView.findViewById(R.id.re_tv3);

        }
    }
}

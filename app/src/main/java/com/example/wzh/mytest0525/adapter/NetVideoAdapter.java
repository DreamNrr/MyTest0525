package com.example.wzh.mytest0525.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wzh.mytest0525.R;
import com.example.wzh.mytest0525.domain.MoveInfo;
import com.example.wzh.mytest0525.utils.Utils;
import com.squareup.picasso.Picasso;

import org.xutils.image.ImageOptions;

import java.util.List;

/**
 * Created by WZH on 2017/5/25.
 */

public class NetVideoAdapter extends BaseAdapter {
    private final Context context;
    private final List<MoveInfo.TrailersBean> data;
    private Utils utils;
    private ImageOptions imageOptions;


    public NetVideoAdapter(Context context,  List<MoveInfo.TrailersBean> data) {
        this.context = context;
        this.data = data;
        utils = new Utils();
        imageOptions = new ImageOptions.Builder()
                .setIgnoreGif(false)
                .setImageScaleType(ImageView.ScaleType.CENTER_CROP)
                .setFailureDrawableId(R.drawable.video_default)
                .setLoadingDrawableId(R.drawable.video_default)
                .build();
    }

    @Override
    public int getCount() {
        return data == null ? 0 : data.size();
    }

    @Override
    public MoveInfo.TrailersBean getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            convertView = View.inflate(context, R.layout.item_net_video,null);
            viewHolder = new ViewHolder();
            viewHolder.tv_duration = (TextView) convertView.findViewById(R.id.tv_duration);
            viewHolder.tv_name = (TextView) convertView.findViewById(R.id.tv_name);
            viewHolder.iv_icon = (ImageView) convertView.findViewById(R.id.iv_icon);
            viewHolder.tv_size = (TextView) convertView.findViewById(R.id.tv_size);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        MoveInfo.TrailersBean moveInfo= data.get(position);
        viewHolder.tv_name.setText(moveInfo.getMovieName());
        viewHolder.tv_size.setText(moveInfo.getVideoLength()+"秒");

        viewHolder.tv_duration.setText(moveInfo.getVideoTitle());

        Picasso.with(context)
                .load(moveInfo.getCoverImg())
                .placeholder(R.drawable.video_default)
                .error(R.drawable.video_default)
                .into(viewHolder.iv_icon);
        return convertView;
    }

    static class ViewHolder{
        TextView tv_name;
        TextView tv_duration;
        ImageView iv_icon;
        TextView tv_size;
    }
}

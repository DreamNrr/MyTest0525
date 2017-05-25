package com.example.wzh.mytest0525.pager;

import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.wzh.mytest0525.R;
import com.example.wzh.mytest0525.adapter.NetVideoAdapter;
import com.example.wzh.mytest0525.domain.MediaItem;
import com.example.wzh.mytest0525.fragment.BaseFragment;

import java.util.ArrayList;

/**
 * Created by WZH on 2017/5/25.
 */

public class NetVideoPager extends BaseFragment {
    private ListView lv;
    private TextView tv_nodata;
    private ArrayList<MediaItem> mediaItems;
    private NetVideoAdapter adapter;
    @Override
    public View initView() {
        View view = View.inflate(context, R.layout.fragment_net_video_pager,null);
        lv = (ListView) view.findViewById(R.id.lv);
        tv_nodata = (TextView) view.findViewById(R.id.tv_nodata);


        return view;
    }
    @Override
    public void initData() {
        super.initData();
    }


}

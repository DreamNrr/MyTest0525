package com.example.wzh.mytest0525.pager;

import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.example.wzh.mytest0525.fragment.BaseFragment;

/**
 * Created by WZH on 2017/5/25.
 */

public class NetVideoPager extends BaseFragment {
    private TextView textView;
    @Override
    public View initView() {
        textView = new TextView(context);
        textView.setTextSize(30);
        textView.setGravity(Gravity.CENTER);
        return textView;
    }
    @Override
    public void initData() {
        super.initData();
        textView.setText("网络视频");
    }
}

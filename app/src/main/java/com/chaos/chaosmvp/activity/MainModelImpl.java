package com.chaos.chaosmvp.activity;

import com.chaos.chaosmvp.contract.AppContracts;
import com.chaos.chaosmvp.contract.IDownLoadListener;

/**
 * Created by yc.Zhao on 2017/9/13 0013.
 */

public class MainModelImpl implements AppContracts.IMainModel {
    private IDownLoadListener<String> iDownLoadListener;
    public MainModelImpl(IDownLoadListener<String> iDownLoadListener) {
        this.iDownLoadListener = iDownLoadListener;
    }
    @Override
    public void getData() {
        //进行网络操作等获取数据操作，在此由于请求的是String类型，就直接当str是请求后的数据吧
        String str = "ChaosAlaska";
        iDownLoadListener.downloadSuccess(str);
    }
}

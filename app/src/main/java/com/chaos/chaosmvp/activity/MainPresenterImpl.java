package com.chaos.chaosmvp.activity;

import com.chaos.chaosmvp.contract.AppContracts;
import com.chaos.chaosmvp.contract.IDownLoadListener;

/**
 * Created by yc.Zhao on 2017/9/13 0013.
 */

public class MainPresenterImpl implements AppContracts.IMainPresenter,IDownLoadListener<String> {
    private AppContracts.IMainModel iMainModel;
    private AppContracts.IMainView iMainView;
    public MainPresenterImpl( AppContracts.IMainView iMainView) {
        this.iMainView = iMainView;
        iMainModel = new MainModelImpl(this);
    }
    @Override
    public void getData() {
        iMainModel.getData();
    }
    @Override
    public void downloadFail(String msg) {
        iMainView.loadFail(msg);
    }
    @Override
    public void downloadSuccess(String s) {
        iMainView.loadSuccess(s);
    }
}

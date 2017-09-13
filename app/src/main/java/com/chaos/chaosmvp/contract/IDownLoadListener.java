package com.chaos.chaosmvp.contract;

/**
 * Created by yc.Zhao on 2017/9/13 0013.
 */

public interface IDownLoadListener<T> {
    void downloadFail(String msg);
    void downloadSuccess(T t);
}

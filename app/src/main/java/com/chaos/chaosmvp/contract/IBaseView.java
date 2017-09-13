package com.chaos.chaosmvp.contract;

/**
 * Created by yc.Zhao on 2017/9/13 0013.
 */

public interface IBaseView<T> {
    void loadSuccess(T t);
    void loadFail(String error);
}

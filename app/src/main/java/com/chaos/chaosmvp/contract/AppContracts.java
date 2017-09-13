package com.chaos.chaosmvp.contract;

/**
 * Created by yc.Zhao on 2017/9/13 0013.
 * 每一个请求数据的模块都要定义好M层 V层 P层接口
 * 其中V层中的泛型为你请求数据的类型
 */

public interface AppContracts {
    /**
     * MainActivity定义的M层、V层、P层
     */
    interface IMainView extends IBaseView<String>{}
    interface IMainModel extends IBaseModel{}
    interface IMainPresenter extends IBasePresenter{}
}

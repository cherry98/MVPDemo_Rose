package com.example.silas.mvpdemo.Presenter;

import com.example.silas.mvpdemo.View.BaseActivity;

/**
 * Created by Silas on 2016/10/7.
 * Presenter的基类
 */
public abstract class BasePresenter<T extends BaseActivity> {

    abstract void initData();
}

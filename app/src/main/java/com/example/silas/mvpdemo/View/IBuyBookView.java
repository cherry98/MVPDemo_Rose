package com.example.silas.mvpdemo.View;

/**
 * Created by Silas on 2016/10/7.
 * BuyBooActivity的接口
 */
public interface IBuyBookView {
    /**
     * 提示toast
     */
    void showToast(String msg);

    /**
     * 刷新adapter
     */
    void refreshAdapter();

    void onEmpty();
}

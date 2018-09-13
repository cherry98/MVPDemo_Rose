package com.example.silas.mvpdemo.Model;

import com.example.silas.mvpdemo.ValueCallBack;

import java.util.List;

/**
 * Created by Silas on 2016/10/7.
 * BuyBookModel的接口
 * 在接口里面定义加载数据的方法和返回的数据
 */
public interface IBuyBookModel {
    /**
     * 获取模拟数据
     */
    void getTestData(ValueCallBack<List<DingTestBean>> callBack);


    /**
     * 返回本地adapter数据
     * @return
     */
    List<DingTestBean> getAdapterData();
}

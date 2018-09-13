package com.example.silas.mvpdemo.Presenter;

import com.example.silas.mvpdemo.Model.BuyBookModel;
import com.example.silas.mvpdemo.Model.DingTestBean;
import com.example.silas.mvpdemo.Model.IBuyBookModel;
import com.example.silas.mvpdemo.ValueCallBack;
import com.example.silas.mvpdemo.View.BuyBookActivity;
import com.example.silas.mvpdemo.View.IBuyBookView;

import java.util.List;

/**
 * Created by Silas on 2016/10/7
 * Presenter.
 */
public class BuyBookPresenter extends BasePresenter<BuyBookActivity> implements IBuyBookPresenter {

    private IBuyBookView mView;
    private IBuyBookModel mModel;

    public BuyBookPresenter(IBuyBookView iBuyBookView) {
        this.mView = iBuyBookView;
        this.mModel = new BuyBookModel();
    }


    @Override
    public List<DingTestBean> getAdapterData() {
        return mModel.getAdapterData();
    }

    @Override
    public void initData() {
        //在这里弹出loading
        mModel.getTestData(new ValueCallBack<List<DingTestBean>>() {
            @Override
            public void onSuccess(List<DingTestBean> dingTestBeans) {
                //在这里取消loading
                //简单数据操作可以在presenter里完成
                mModel.getAdapterData().addAll(dingTestBeans);
                mView.refreshAdapter();
            }

            @Override
            public void onFail(String code) {
                //在这里取消loading
                mView.showToast(code);
                mView.onEmpty();
            }
        });
    }
}

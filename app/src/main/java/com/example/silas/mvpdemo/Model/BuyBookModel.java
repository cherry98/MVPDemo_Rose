package com.example.silas.mvpdemo.Model;

import android.os.Handler;

import com.example.silas.mvpdemo.ValueCallBack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Silas on 2016/10/7.
 * Activity的数据层 （M层）
 */
public class BuyBookModel implements IBuyBookModel {
    List<DingTestBean> listData;

    public BuyBookModel() {
        this.listData = new ArrayList<>();
    }

    @Override
    public void getTestData(final ValueCallBack<List<DingTestBean>> callBack) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                List<DingTestBean> list = new ArrayList<DingTestBean>();
                list.add(new DingTestBean("赵云", 1, "09-27 09:11"));
                list.add(new DingTestBean("赵云、隔壁老王、小王、典韦、貂蝉、林芳、曹操、刘备、关羽、黄忠、张飞、诸葛孔明", 10, "09-27 09:11"));
                list.add(new DingTestBean("黄忠、孙权、大乔", 50, "09-27 09:11"));
                list.add(new DingTestBean("大乔、小乔、貂蝉、孙尚香", 300, "09-27 09:11"));
                Random random = new Random();
                int flag = random.nextInt(10);
                if (flag > 5) {
                    callBack.onSuccess(list);
                } else {
                    callBack.onFail("请求失败");
                }
            }
        }, 1000);
    }

    @Override
    public List<DingTestBean> getAdapterData() {
        return listData;
    }
}

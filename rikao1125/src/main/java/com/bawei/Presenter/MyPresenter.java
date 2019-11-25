package com.bawei.Presenter;

import android.util.Log;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.bawei.Base.BasePresenter;
import com.bawei.Bean.Movece;
import com.bawei.Contract.Icontract;
import com.bawei.Model.Mymodel;
import com.bawei.View.MainActivity;
import com.google.gson.Gson;

/*
 *@auther:邓先超
 *@Date: 2019/11/25
 *@Time:8:44
 *@Description:${DESCRIPTION}
 **/
public class MyPresenter extends BasePresenter implements Icontract.toRequest {
    Mymodel mymodel;
    public MyPresenter(){
        mymodel=new Mymodel();
    }


    @Override
    public void toData(String url) {
        mymodel.toGit(url, new Icontract.CallBack() {
            @Override
            public void success(String json) {
                Gson gson = new Gson();
                Movece movece = gson.fromJson(json, Movece.class);

                MainActivity mainActivity= (MainActivity) v;
                mainActivity.success(movece);
                Log.e("aaa","p1"+json);
            }

            @Override
            public void error(String error) {

            }
        });
    }
}

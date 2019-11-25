package com.bawei.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.bawei.API.api;
import com.bawei.Adapter.MyAdapter;
import com.bawei.Base.BaseActivity;
import com.bawei.Base.BasePresenter;
import com.bawei.Bean.Movece;
import com.bawei.Contract.Icontract;
import com.bawei.Presenter.MyPresenter;
import com.bawei.rikao1125.R;

public class MainActivity extends BaseActivity implements Icontract.toRid {

    RecyclerView recyclerView;

    @Override
    protected void inidata() {
        api api = new api();
        MyPresenter myPresenter= (MyPresenter) p;
        myPresenter.toData(api.getUrl(1,5));
    }

    @Override
    protected void iniview() {


        recyclerView=findViewById(R.id.RecyclerView);
        LinearLayoutManager manager=new LinearLayoutManager(this);
        manager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(manager);
    }

    @Override
    protected int inilayout() {
        return R.layout.activity_main;
    }

    @Override
    protected BasePresenter IPresenter() {
        return new MyPresenter();
    }

    @Override
    public void success(Movece movece) {
        Log.e("aaa","m1"+movece);
        MyAdapter myAdapter = new MyAdapter(movece.getResult(),this);
        recyclerView.setAdapter(myAdapter);
    }
}

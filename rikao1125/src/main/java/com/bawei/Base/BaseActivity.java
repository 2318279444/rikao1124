package com.bawei.Base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/*
 *@auther:邓先超
 *@Date: 2019/11/25
 *@Time:8:44
 *@Description:${DESCRIPTION}
 **/
public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {
    public P p;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(inilayout());
        p=IPresenter();
        if(p!=null){
            p.attach(this);
        }

        iniview();

        inidata();
    }

    protected abstract void inidata();

    protected abstract void iniview();

    protected abstract int inilayout();
    protected abstract P IPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(p!=null){
            p.unattach();
            p=null;
        }
    }
}

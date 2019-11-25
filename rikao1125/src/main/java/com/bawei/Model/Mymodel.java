package com.bawei.Model;

import com.bawei.Contract.Icontract;
import com.bawei.util.Util;

/*
 *@auther:邓先超
 *@Date: 2019/11/25
 *@Time:8:45
 *@Description:${DESCRIPTION}
 **/
public class Mymodel {
    public void toGit(String url, Icontract.CallBack callBack){
        Util.getInstance().toGits(url,callBack);
    }
}

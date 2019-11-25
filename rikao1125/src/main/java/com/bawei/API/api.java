package com.bawei.API;

/*
 *@auther:邓先超
 *@Date: 2019/11/25
 *@Time:9:07
 *@Description:${DESCRIPTION}
 **/
public class api {
    public String getUrl(int page,int count){
        String url="http://172.17.8.100/movieApi/movie/v1/findReleaseMovieList"+"?page="+page+"&count="+count;
        return url;
    }

}

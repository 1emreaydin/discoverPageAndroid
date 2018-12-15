package com.anonim.myapplication.Retrofit;

import com.anonim.myapplication.Data.MyData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestInsterface {

    @GET("discover")
    Call<List<MyData>> getFeaturedList();
}



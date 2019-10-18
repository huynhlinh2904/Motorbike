package com.example.motorbike.webservice;

import com.example.motorbike.scheme.ListUserResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ListUserService {
    @GET("/api/users")
    Call<ListUserResponse> getUsers(@Query("page") int page);



}

package com.assignment.recyclerjsonparsing;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

    @GET("raw/8LrHLLrM")
    Call<JSONResponse> getJSON();
}

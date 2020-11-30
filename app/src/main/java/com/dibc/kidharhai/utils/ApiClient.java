package com.dibc.kidharhai.utils;

import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class ApiClient {
    public static APIService getAPIService() {
        return new Retrofit.Builder()
                .baseUrl("https://kidharhai.in")
                .addConverterFactory(MoshiConverterFactory.create())
                .build().create(APIService.class);
    }
}

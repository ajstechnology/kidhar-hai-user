package com.dibc.kidharhai.utils;

import com.dibc.kidharhai.models.MOTPRes;
import com.dibc.kidharhai.models.MResLocation;
import com.dibc.kidharhai.models.MResVerify;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface APIService {

    @FormUrlEncoded
    @POST("/backend/api/pub/send_otp")
    Call<MOTPRes> getOTP(@FieldMap Map<String, String> params);

    @FormUrlEncoded
    @POST("/backend/api/pub/verify_otp")
    Call<MResVerify> verifyOTP(@FieldMap Map<String, String> params);

    @FormUrlEncoded
    @POST("/backend/api/user/update_location")
    Call<MResLocation> sendLocationData(
            @Header("authkey") String strAuthKey,
            @Header("clientid") String strClientId,
            @Field("accuracy") double strAccuracy,
            @Field("altitude") double strAltitude,
            @Field("altitudeAccuracy") String strAltitudeAccuracy,
            @Field("heading") String strHeading,
            @Field("latitude") Double strLatitude,
            @Field("longitude") Double strLongitude,
            @Field("speed") String strSpeed,
            @Field("timestamp") String strTimestamp
    );

}

package com.dibc.kidharhai.models;

import com.squareup.moshi.Json;

public class MResVerify{

	@Json(name = "msg")
	private String msg;

	@Json(name = "authkey")
	private String authkey;

	@Json(name = "clientid")
	private String clientid;

	public String getMsg(){
		return msg;
	}

	public String getAuthkey(){
		return authkey;
	}

	public String getClientid(){
		return clientid;
	}

	@Override
 	public String toString(){
		return 
			"MResVerify{" + 
			"msg = '" + msg + '\'' + 
			",authkey = '" + authkey + '\'' + 
			",clientid = '" + clientid + '\'' + 
			"}";
		}
}
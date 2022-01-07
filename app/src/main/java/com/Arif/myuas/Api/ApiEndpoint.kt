package com.Arif.myuas.Api

import com.Arif.myuas.Model.CatatanModel
import com.Arif.myuas.Model.ResponseLogin
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiEndpoint {
    @GET("data.php")
    fun data() :Call<CatatanModel>

}
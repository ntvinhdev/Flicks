package com.coderschool.vinh.flicks.MovieApi;

import com.coderschool.vinh.flicks.model.NowPlaying;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Vinh on 10/12/2016.
 */

public interface MovieApi {

    @GET("now_playing")
    Call<NowPlaying> getNowPlaying();

    @POST("popular")
    Call<NowPlaying> getPopular();
}

package com.app.locationapp.api

import com.app.locationapp.helper.Constants
import com.app.locationapp.models.TvShowResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET(Constants.END_POINT)
    suspend fun getTvShows():Response<TvShowResponse>

}
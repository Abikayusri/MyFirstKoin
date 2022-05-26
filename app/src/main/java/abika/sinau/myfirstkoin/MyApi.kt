package abika.sinau.myfirstkoin

import retrofit2.http.GET


/**
 * @author by Abika Chairul Yusri on 5/26/2022
 */

interface MyApi {
    @GET("my/endpoint")
    fun callApi()
}
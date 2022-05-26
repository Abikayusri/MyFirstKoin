package abika.sinau.myfirstkoin.di

import abika.sinau.myfirstkoin.MyApi
import abika.sinau.myfirstkoin.MyRepositoryImpl
import abika.sinau.myfirstkoin.MyViewModel
import okhttp3.OkHttpClient
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit


/**
 * @author by Abika Chairul Yusri on 5/26/2022
 */

// TODO 4: Create new class module, and add some module for inject, after that add in class MyApplication
private const val BASE_URL = "https://google.com"

val networkModule = module {
    single { okHttpClient() }
    single { retrofit(get()) }
}

val viewModelModule = module {
    viewModel { MyViewModel(get()) }
}

fun retrofit(okHttpClient: OkHttpClient): MyApi {
    val retrofit = Retrofit.Builder().baseUrl(BASE_URL)
        .client(okHttpClient)
        .build()

    return retrofit.create(MyApi::class.java)
}

fun okHttpClient(): OkHttpClient {
    return OkHttpClient.Builder()
        .connectTimeout(60, TimeUnit.SECONDS)
        .readTimeout(60, TimeUnit.SECONDS)
        .build()
}

val repositoryModule = module {
    single { MyRepositoryImpl(get()) }
}

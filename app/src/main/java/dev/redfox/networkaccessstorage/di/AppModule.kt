package dev.redfox.networkaccessstorage.di

import dagger.Module
import dagger.Provides
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import dev.redfox.networkaccessstorage.networking.NasApiInterface
import dev.redfox.networkaccessstorage.utils.Constant
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

@Module
@InstallIn(ViewModelComponent::class)
object AppModule: Constant {

    private var mClient: OkHttpClient? = null
    private var baseUrl: String = ""

    @Provides
    fun provideBaseUrl(): String = baseUrl


    val client: OkHttpClient
        get() {
            if (mClient == null) {
                val interceptor = HttpLoggingInterceptor()
                interceptor.level = HttpLoggingInterceptor.Level.BODY

                val httpBuilder = OkHttpClient.Builder()
                httpBuilder
                    .connectTimeout(15, TimeUnit.SECONDS)
                    .readTimeout(20, TimeUnit.SECONDS)
                    .addInterceptor(interceptor)  /// show all JSON in logCat
                mClient = httpBuilder.build()

            }
            return mClient!!
        }

    @Provides
    fun getRetrofitService(retrofit: Retrofit): NasApiInterface {
        return retrofit.create(NasApiInterface::class.java)
    }

    @Provides
    fun getRetofitInstance(): Retrofit {

        return Retrofit.Builder()
            .baseUrl(provideBaseUrl())
            .addConverterFactory(MoshiConverterFactory.create().asLenient())
            .client(client)
            .build()
    }

    fun setBaseUrl(baseUrl: String) {
        this.baseUrl = baseUrl
    }
}
package cn.imtianx.common.net

import cn.imtianx.common.net.converter.RespTypeAdapterFactory
import cn.imtianx.common.net.interceptor.RetryInterceptor
import cn.imtianx.simple.ui.App
import com.google.gson.GsonBuilder
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * <pre>
 *     @desc: retrofit client
 * </pre>
 * @author 奚岩
 * @date 2018/5/30 11:45 PM
 */
class HttpRequestClient private constructor() {

    fun getRetrofit(): Retrofit {

        val okHttpClient = OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(15, TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
            .addInterceptor(RetryInterceptor())
            .sslSocketFactory(getSSLParams().sSLSocketFactory, getSSLParams().trustManager)
            .hostnameVerifier(HttpsUtils.getUnSafeHostnameVerifier())
            .build()

        val gson = GsonBuilder()
            .registerTypeAdapterFactory(RespTypeAdapterFactory())
            .create()

        return Retrofit.Builder()
            .baseUrl("https://192.168.0.236/")
//            .baseUrl("https://192.168.2.104/")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

    }

    fun getSSLParams(): HttpsUtils.SSLParams {
        return HttpsUtils.getSslSocketFactory(App.instance().getCertificates(), null, null)
    }


    companion object {
        fun get() = Inner.INSTANCE
    }

    private object Inner {
        val INSTANCE = HttpRequestClient()
    }
}
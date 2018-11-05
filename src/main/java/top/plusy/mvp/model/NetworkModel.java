package top.plusy.mvp.model;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.util.concurrent.TimeUnit;

public class NetworkModel implements INetworkModel {
    private HttpUrl baseUrl = HttpUrl.get("https://github.com");
    private OkHttpClient.Builder builder = new OkHttpClient.Builder();
    private  Retrofit retrofit;

    public NetworkModel() {
        builder.writeTimeout(60, TimeUnit.SECONDS);
        builder.readTimeout(45, TimeUnit.SECONDS);
        builder.connectTimeout(30, TimeUnit.SECONDS);

        retrofit = new Retrofit.Builder().baseUrl(baseUrl)
                .addConverterFactory(JacksonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(builder.build())
                .build();

    }

    @Override
    public void networkReq(String req, onNetworkRspListener listener) {
    }
}

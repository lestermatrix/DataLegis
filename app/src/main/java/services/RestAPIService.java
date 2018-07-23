package services;

import java.util.HashMap;
import java.util.List;

import io.reactivex.Single;
import models.ArticleModel;
import models.SearchModel;
import models.SectionModel;
import models.NewsModel;
import models.TokenModel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RestAPIService {


    @POST("Auth/")
    Single<TokenModel> postLoginInfo(@Body HashMap<String, Object> body);

    @POST("Auth/regdevice")
    void postRegDevice(@Body HashMap<String, Object> body);

    @GET("news/{news_number}")
    Call<List<NewsModel>> getNews(@Path("news_number") int number);

    @GET("documento/")
    String  getConstitution();

    @GET("documento/sections/{section_number}")
    Call<List<SectionModel>> getSection(@Path("section_number") int number);

    @GET("documento/item/{article_number}")
    Call<List<ArticleModel>> getArticle(@Path("article_number") int number);


    @GET("documento/itemsearch/{string_search}")
    Call<List<SearchModel>> getResults(@Path("string_search") String search);






}

package com.example.iit.androidnewsappspl2.CommonForNewsAPIOrg;

import com.example.iit.androidnewsappspl2.InterfaceForGETAnnotaion.IconBetterIdeaService;
import com.example.iit.androidnewsappspl2.InterfaceForGETAnnotaion.NewsService;
import com.example.iit.androidnewsappspl2.RemoteForConnectWithBaseNewsAPIOrg.IconBetterIdeaClient;
import com.example.iit.androidnewsappspl2.RemoteForConnectWithBaseNewsAPIOrg.RetrofitClient;



public class Common {
    private static final String BASE_URL="https://newsapi.org/";

    public  static final String API_KEY="30533a5a42d44467983a64322c159b50";

    public static NewsService getNewsService()
    {
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }

    public static IconBetterIdeaService getIconService()
    {
        return IconBetterIdeaClient.getClient().create(IconBetterIdeaService.class);
    }
   // https://newsapi.org/v2/everything?q=bitcoin&apiKey=API_KEY
    //https://newsapi.org/v1/articles?source=the-next-web&sortBy=latest&apiKey=a7072d9c2ad9495a8dd5cb58a7fd30df
    public static String getSourcesAPIUrl(String source)
    {
        StringBuilder apiUrl = new StringBuilder("https://newsapi.org/v2/sources?country=");
        return apiUrl.append(source)
                .append("&apiKey=")
                .append(API_KEY)
                .toString();
    }

    public static String getAPIUrl(String source,String sortBy,String apiKEY)
    {
        StringBuilder apiUrl = new StringBuilder("https://newsapi.org/v2/top-headlines?sources=");
        return apiUrl.append(source)
                .append("&apiKey=")
                .append(apiKEY)
                .toString();
    }

    public static String getAPIUrlll(String source,String sortBy,String apiKEY)
    {
        StringBuilder apiUrl = new StringBuilder("https://newsapi.org/v2/top-headlines?country=");
        return apiUrl.append(source)
                .append("&apiKey=")
                .append(apiKEY)
                .toString();
    }

    public static String getAPIUrll(String source,String sortBy,String apiKEY,String category)
    {
        StringBuilder apiUrl = new StringBuilder("https://newsapi.org/v2/top-headlines?country=");
        return apiUrl.append(source)
                .append("&category=")
                .append(category)
                .append("&apiKey=")
                .append(apiKEY)
                .toString();
    }

    public static String getInterestSearchUrl(String source,String sortBy,String apiKEY)
    {
        StringBuilder apiUrl = new StringBuilder("https://newsapi.org/v2/everything?q=");
        return apiUrl.append(source)
                .append("&apiKey=")
                .append(apiKEY)
                .toString();
    }


}

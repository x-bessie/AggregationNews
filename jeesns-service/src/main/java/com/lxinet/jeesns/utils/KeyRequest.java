package com.lxinet.jeesns.utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.HashMap;
import java.util.Map;


/**
 * 关键词http请求,包含获取Json数据
 */


public class KeyRequest {
    public static KeySearchDao keySearchDao = new KeySearchDao();

    /**
     * @param q 搜索的关键词
     * @throws Exception
     */
    public void getEveryP(String q) throws Exception {
        HttpRequestUtil httpRequestUtil = new HttpRequestUtil();
        JsonParser parser = new JsonParser();
        //请求参数
        String urlRequest = "https://newsapi.org/v2/everything";
        Map<String, String> map = new HashMap<String, String>();
//        map.put("language","zh");
        map.put("q", q);
        map.put("apikey", "2c2b3417e7584cb2abcf19564789864d");

//        StringBuffer sb = new StringBuffer();
//        for (String key : map.keySet()) {
//            sb.append(key + "=" + map.get(key));
//        }
//        System.out.println(urlRequest+sb.toString());
//        String result = httpRequestUtil.sendPost(urlRequest.trim(), sb.toString().trim());
//        System.out.println(result);
        //第二种
        httpRequestUtil.HttpsGetData(urlRequest.trim(), map);
        String result = httpRequestUtil.Do();
        System.out.println(result);
        //Json数据
        JsonObject jsonObject = parser.parse(result).getAsJsonObject();
        JsonArray articlearray = jsonObject.get("articles").getAsJsonArray();
//        //遍历数据，并存入数据库
        for (JsonElement articles : articlearray) {
//                JsonElement author = articles.getAsJsonObject().get("author");
            String title = String.valueOf(articles.getAsJsonObject().get("title"));
            String description = String.valueOf(articles.getAsJsonObject().get("description"));
            String url = String.valueOf(articles.getAsJsonObject().get("url"));
            String publishedAt = String.valueOf(articles.getAsJsonObject().get("publishedAt"));
            String content = String.valueOf(articles.getAsJsonObject().get("content"));
            System.out.println(title + " " + description + " " + url + " " + publishedAt + " " + content);

            KeyName keyName = new KeyName();
            keyName.setStatus(1);
            keyName.setTitle(title);
            keyName.setMemberId(1);
            keyName.setDescription(description);
            keyName.setContent(content);
            keyName.setUrl(url);
            keyName.setPublishedAt(publishedAt);
            keySearchDao.insert(keyName);
//        }
        }
    }

    public static void main(String[] args) {
        KeyRequest keyRequest = new KeyRequest();

        try {
            keyRequest.getEveryP("袭击");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

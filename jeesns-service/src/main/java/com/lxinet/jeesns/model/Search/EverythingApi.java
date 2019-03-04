package com.lxinet.jeesns.model.Search;

public class EverythingApi {
    //请求的主链接
    private String home = "https://newsapi.org/v2/everything";
    //国家
    private String language = "language";
    //查找关键词
    private String q = "q";
    //    relevancy  = articles more closely related to q come first.
//    popularity = articles from popular sources and publishers come first.
//    publishedAt = newest articles come first.
    private String sortBy = ""; //default=publishedAt
    //token=2c2b3417e7584cb2abcf19564789864d
    private String apiKey = "apiKey";
    //   business entertainment general health science sports technology
    private String category = "";
    //显示的条目,pageSize=100   最多显示100条
    private String pageSize = "pageSize";

    private String from = "";
    private String to = "";

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "EverythingApi{" +
                "home='" + home + '\'' +
                ", language='" + language + '\'' +
                ", q='" + q + '\'' +
                ", sortBy='" + sortBy + '\'' +
                ", apiKey='" + apiKey + '\'' +
                ", category='" + category + '\'' +
                ", pageSize='" + pageSize + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}

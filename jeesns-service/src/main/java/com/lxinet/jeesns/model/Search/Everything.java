package com.lxinet.jeesns.model.Search;

import java.util.Date;

/**
 * 新闻搜索类
 * author:Lina
 */
public class Everything {
    //    发布作者
    private String author;
    //    新闻标题
    private String title;
    //    新闻链接
    private String url;
    //    新闻发布时间
    private String publishedAt;
    //用户
    private int member_id;
    //添加时间
    private Date create_time;
    //添加描述
    private String description;
    //新闻内容
    private String content;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

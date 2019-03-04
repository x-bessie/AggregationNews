package com.lxinet.jeesns.utils;

import com.lxinet.jeesns.model.cms.ArticleCate;
import com.lxinet.jeesns.model.member.Member;

import java.util.Date;

public class KeyName {


    /**
     * 用户检索后的文章
     */

    private Integer id;
    private Date collectTime;
    private Integer cateId;
    private Integer status;
    private String title;
    private Integer memberId;
    private Member member;
    private Date createTime;
    private String description;
    private String keywords;
    private Integer viewRank;
    private Integer viewCount;
    private String writer;
    private String source;
    private Date pubTime;
    private Date updateTime;
    private String thumbnail;
    private Date lastReply;
    private Integer canReply;
    private Integer goodNum;
    private Integer badNum;
    private Integer checkAdmin;
    private String content;
    private String publishedAt;
    private String url;
    private String AddOn;
    private Integer favor;
    private Integer isFavor;
    private ArticleCate articleCate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Integer getViewRank() {
        return viewRank;
    }

    public void setViewRank(Integer viewRank) {
        this.viewRank = viewRank;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getPubTime() {
        return pubTime;
    }

    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Date getLastReply() {
        return lastReply;
    }

    public void setLastReply(Date lastReply) {
        this.lastReply = lastReply;
    }

    public Integer getCanReply() {
        return canReply;
    }

    public void setCanReply(Integer canReply) {
        this.canReply = canReply;
    }

    public Integer getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(Integer goodNum) {
        this.goodNum = goodNum;
    }

    public Integer getBadNum() {
        return badNum;
    }

    public void setBadNum(Integer badNum) {
        this.badNum = badNum;
    }

    public Integer getCheckAdmin() {
        return checkAdmin;
    }

    public void setCheckAdmin(Integer checkAdmin) {
        this.checkAdmin = checkAdmin;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAddOn() {
        return AddOn;
    }

    public void setAddOn(String addOn) {
        AddOn = addOn;
    }

    public Integer getFavor() {
        return favor;
    }

    public void setFavor(Integer favor) {
        this.favor = favor;
    }

    public Integer getIsFavor() {
        return isFavor;
    }

    public void setIsFavor(Integer isFavor) {
        this.isFavor = isFavor;
    }

    public ArticleCate getArticleCate() {
        return articleCate;
    }

    public void setArticleCate(ArticleCate articleCate) {
        this.articleCate = articleCate;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", collectTime=" + collectTime +
                ", cateId=" + cateId +
                ", status=" + status +
                ", title='" + title + '\'' +
                ", memberId=" + memberId +
                ", member=" + member +
                ", createTime=" + createTime +
                ", description='" + description + '\'' +
                ", keywords='" + keywords + '\'' +
                ", viewRank=" + viewRank +
                ", viewCount=" + viewCount +
                ", writer='" + writer + '\'' +
                ", source='" + source + '\'' +
                ", pubTime=" + pubTime +
                ", updateTime=" + updateTime +
                ", thumbnail='" + thumbnail + '\'' +
                ", lastReply=" + lastReply +
                ", canReply=" + canReply +
                ", goodNum=" + goodNum +
                ", badNum=" + badNum +
                ", checkAdmin=" + checkAdmin +
                ", content='" + content + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                ", url='" + url + '\'' +
                ", AddOn='" + AddOn + '\'' +
                ", favor=" + favor +
                ", isFavor=" + isFavor +
                ", articleCate=" + articleCate +
                '}';
    }
}


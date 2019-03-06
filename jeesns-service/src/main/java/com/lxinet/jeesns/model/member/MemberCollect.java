package com.lxinet.jeesns.model.member;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lxinet.jeesns.core.annotation.Column;
import com.lxinet.jeesns.core.annotation.Id;
import com.lxinet.jeesns.core.annotation.Table;
import com.lxinet.jeesns.core.enums.FillTime;
import com.lxinet.jeesns.core.enums.IdType;
import com.lxinet.jeesns.model.cms.Article;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liaolina on 19/1/12.
 */
@Table("tbl_member_collect")
public class MemberCollect implements Serializable {
    @Id(value = "id", type = IdType.AUTO)
    private Integer id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(value = "create_time", currTime = FillTime.INSERT)
    private Date createTime;
    @Column("collect_new")
    private Integer collectNew;

    //联表用
    private Article collectWhatNews;

    @Column("who_collect")
    private Integer whoCollect;
//    private Member whoFollowMember;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCollectNew() {
        return collectNew;
    }

    public void setCollectNew(Integer collectNew) {
        this.collectNew = collectNew;
    }

    public Article getCollectWhatNews() {
        return collectWhatNews;
    }

    public void setCollectWhatNews(Article collectWhatNews) {
        this.collectWhatNews = collectWhatNews;
    }

    public Integer getWhoCollect() {
        return whoCollect;
    }

    public void setWhoCollect(Integer whoCollect) {
        this.whoCollect = whoCollect;
    }
}
package com.lxinet.jeesns.utils;

import org.apache.ibatis.annotations.Insert;

public interface KeySearchMapper {


    //检索新闻插入
    @Insert("insert into tbl_article (status,title,member_id,description,content,url,publishedAt) values (#{status},#{title},#{memberId},#{description},#{content},#{url},#{publishedAt})")
    int KeyInsert(KeyName keyName);
}

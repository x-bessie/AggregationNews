package com.lxinet.jeesns.dao.member;

import com.lxinet.jeesns.core.dao.BaseMapper;
import com.lxinet.jeesns.core.model.Page;
import com.lxinet.jeesns.model.member.MemberCollect;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by liaolina on 2019/1/12.
 */
public interface IMemberCollectDao extends BaseMapper<MemberCollect> {

    List<MemberCollect> followsList(@Param("page") Page page, @Param("whoCollectId") Integer whoCollectId);

//    List<MemberFans> fansList(@Param("page") Page page, @Param("followWhoId") Integer followWhoId);

    MemberCollect find(@Param("whoCollectId") Integer whoCollectId, @Param("collectNewId") Integer collectNewId);

    Integer save(@Param("whoCollectId") Integer whoCollectId, @Param("collectNewId") Integer collectNewId);

    Integer delete(@Param("whoCollectId") Integer whoCollectId, @Param("collectNewId") Integer collectNewId);



}
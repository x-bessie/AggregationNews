package com.lxinet.jeesns.dao.member;

import com.lxinet.jeesns.core.dao.BaseMapper;
import com.lxinet.jeesns.core.model.Page;
import com.lxinet.jeesns.model.member.Member;
import com.lxinet.jeesns.model.member.MemberClassification;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IMemberClassificationDao extends BaseMapper<MemberClassification> {

//    MemberClassification find(@Param("mId") Integer mId);
//
//    Integer delete(@Param("mId") Integer mId);

    Integer save(@Param("mId") Integer mId, @Param("classification") Integer classification);

//    boolean update(@Param("Classification") String Classification, @Param("mId") Integer mId);

    List<MemberClassification> findByClassification(@Param("page") Page page, @Param("mID") Integer mId);
}

package com.lxinet.jeesns.service.member;

import com.lxinet.jeesns.core.service.IBaseService;
import com.lxinet.jeesns.model.member.MemberClassification;

/**
 * 用户选择喜欢的新闻的分类的接口
 * author:Lina
 */
public interface IMemberClassificationService extends IBaseService<MemberClassification> {

//    MemberClassification find(Integer mId);
//
//    Integer delete(Integer mId);

    Integer save(Integer mId, Integer classification);

//    boolean update(String Classification, Integer mId);
}

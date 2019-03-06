package com.lxinet.jeesns.service.member.impl;

import com.lxinet.jeesns.core.service.impl.BaseServiceImpl;
import com.lxinet.jeesns.dao.member.IMemberClassificationDao;
import com.lxinet.jeesns.model.member.Member;
import com.lxinet.jeesns.model.member.MemberClassification;
import com.lxinet.jeesns.service.member.IMemberClassificationService;
import com.lxinet.jeesns.utils.MemberUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户操作选取喜欢的新闻分类
 * author:Lina
 */
@Service("memberClassificationServiceImpl")
public class MemberClassificationServiceImpl extends BaseServiceImpl<MemberClassification> implements IMemberClassificationService {
    @Resource
    private IMemberClassificationDao memberClassificationDao;

    @Override
    public Integer save(Integer mId, String classification) {
        return memberClassificationDao.save(mId, classification);
    }

//    /**
//     * 用户查找
//     *
//     * @param mId
//     * @return
//     */
//    @Override
//    public MemberClassification find(Integer mId) {
//        return memberClassificationDao.find(mId);
//    }

//    /**
//     * 用户删除喜欢选取新闻分类
//     *
//     * @param mId
//     * @return
//     */
//    @Override
//    public Integer delete(Integer mId) {
//        return memberClassificationDao.delete(mId);
//    }


//    /**
//     * 用户更新喜欢的分类，重选？？
//     *
//     * @param Classification
//     * @param mId
//     * @return
//     */
//    @Override
//    public boolean update(String Classification, Integer mId) {
//        return memberClassificationDao.update(Classification, mId);
//    }
}

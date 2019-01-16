package com.lxinet.jeesns.service.member.impl;

import com.lxinet.jeesns.core.dto.ResultModel;
import com.lxinet.jeesns.core.exception.OpeErrorException;
import com.lxinet.jeesns.core.model.Page;
import com.lxinet.jeesns.core.service.impl.BaseServiceImpl;
import com.lxinet.jeesns.dao.member.IMemberCollectDao;
import com.lxinet.jeesns.model.member.MemberCollect;
import com.lxinet.jeesns.service.member.IMemberCollectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liaolina  on 2019/1/12.
 */
@Service("memberCollectServiceImpl")

public class MemberCollectServiceImpl extends BaseServiceImpl<MemberCollect> implements  IMemberCollectService {
    @Resource
    private IMemberCollectDao memberCollectDao;

    @Override
    public MemberCollect find(Integer whoCollectId, Integer collectNewId) {
        return memberCollectDao.find( whoCollectId, collectNewId);
    }

    /**
     * 收藏
     */
    @Override
    public boolean save(Integer whoCollectId, Integer collectNewId) {
        if (memberCollectDao.find(whoCollectId, collectNewId)!=null){
            throw new OpeErrorException("已经收藏");
        }
        return memberCollectDao.save(whoCollectId, collectNewId)==1;
    }

    /**
     * 取消收藏
     */
    @Override
    public boolean delete(Integer whoCollectId, Integer collectNewId) {
        return memberCollectDao.delete(whoCollectId, collectNewId)>0;
    }


    @Override
    public ResultModel followsList(Page page, Integer whoCollectId) {
        List<MemberCollect> list =memberCollectDao.followsList(page,whoCollectId);
        ResultModel model =new ResultModel(0,page);
        model.setData(list);
        return model;
    }
}

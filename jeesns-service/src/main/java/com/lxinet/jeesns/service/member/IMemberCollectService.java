package com.lxinet.jeesns.service.member;

import com.lxinet.jeesns.core.dto.ResultModel;
import com.lxinet.jeesns.core.model.Page;
import com.lxinet.jeesns.core.service.IBaseService;
import com.lxinet.jeesns.model.member.MemberCollect;
import com.lxinet.jeesns.model.member.MemberFans;


/**
 * Created by zchuanzhao on 17/2/21.
 */
public interface IMemberCollectService extends IBaseService<MemberCollect> {

    boolean save(Integer whoCollectId, Integer collectNewId);

    boolean delete(Integer whoCollectId, Integer collectNewId);

    ResultModel followsList(Page page, Integer whoCollectId);

//    ResultModel fansList(Page page, Integer followWhoId);

    MemberCollect find(Integer whoCollectId,Integer collectNewId);

}

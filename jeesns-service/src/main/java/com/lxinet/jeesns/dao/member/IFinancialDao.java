package com.lxinet.jeesns.dao.member;

import com.lxinet.jeesns.core.dao.BaseMapper;
import com.lxinet.jeesns.core.model.Page;
import com.lxinet.jeesns.model.member.Financial;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Lina.
 */
public interface IFinancialDao extends BaseMapper<Financial> {

    List<Financial> list(@Param("page") Page page, @Param("memberId") Integer memberId);

}
package com.lxinet.jeesns.dao.system;

import com.lxinet.jeesns.core.dao.BaseMapper;
import com.lxinet.jeesns.dao.common.IBaseDao;
import com.lxinet.jeesns.model.system.Action;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Lina.
 */
public interface IActionDao extends BaseMapper<Action> {
    int isenable(@Param("id") Integer id);
}

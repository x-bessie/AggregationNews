package com.lxinet.jeesns.dao.common;

import com.lxinet.jeesns.model.common.ArchiveFavor;
import org.apache.ibatis.annotations.Param;

/**
 * 文章点赞DAO接口
 * Created by Lina.
 */
public interface IArchiveFavorDao extends IBaseDao<ArchiveFavor> {

    ArchiveFavor find(@Param("archiveId") Integer archiveId, @Param("memberId") Integer memberId);

    Integer save(@Param("archiveId") Integer archiveId, @Param("memberId") Integer memberId);

    Integer delete(@Param("archiveId") Integer archiveId, @Param("memberId") Integer memberId);
}
package com.lxinet.jeesns.service.cms;

import com.lxinet.jeesns.core.dto.ResultModel;
import com.lxinet.jeesns.core.model.Page;
import com.lxinet.jeesns.core.service.IBaseService;
import com.lxinet.jeesns.model.cms.ArticleComment;
import com.lxinet.jeesns.model.member.Member;

import java.util.List;


/**
 * Created by zchuanzhao on 2016/10/14.
 */
public interface IArticleCommentService extends IBaseService<ArticleComment> {

    boolean save(Member loginMember, String content, Integer articleId);

    boolean delete(Member loginMember, int id);

    List<ArticleComment> listByPage(Page page, int articleId, String key);

    void deleteByArticle(Integer articleId);

    /**
     * 用户添加新闻评论
     *
     * @param page
     * @param memberId
     * @return
     */
    ResultModel commentList(Page page, Integer memberId);

}

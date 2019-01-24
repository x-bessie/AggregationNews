package com.lxinet.jeesns.service.cms;

import com.lxinet.jeesns.core.dto.ResultModel;
import com.lxinet.jeesns.core.model.Page;
import com.lxinet.jeesns.core.service.IBaseService;
import com.lxinet.jeesns.model.cms.Article;
import com.lxinet.jeesns.model.member.Member;

import java.util.List;


/**
 * Created by liaolina on 2019/01/20.
 */
public interface IArticleService extends IBaseService<Article> {


    Article findById(int id,Member loginMember);

    boolean save(Member member, Article article);

    boolean update(Member member, Article article);

    boolean delete(Member member, int id);

    ResultModel listByPage(Page page, String key, int cateid, int status, int memberId);

    void updateViewCount(int id);

    boolean audit(int id);

    ResultModel favor(Member loginMember, int articleId);

    List<Article> listByCustom(int cid,String sort,int num,int day,int thumbnail);

//    ResultModel collect(Member loginMember,int articleId);
}

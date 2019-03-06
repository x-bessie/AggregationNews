package com.lxinet.jeesns.model.member;


import com.lxinet.jeesns.core.annotation.Column;
import com.lxinet.jeesns.core.annotation.Id;
import com.lxinet.jeesns.core.annotation.Table;
import com.lxinet.jeesns.core.enums.IdType;

/**
 * 用户选择喜欢的新闻分类
 * author:Lina
 */
@Table("tbl_member_classification")
public class MemberClassification {
    @Id(value = "id", type = IdType.AUTO)
    private Integer id;
    @Column("m_id")
    private Integer mId;
    @Column("classification")
    private Integer classification;
    //暂时不用
    private Member member;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Integer getClassification() {
        return classification;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "MemberClassification{" +
                "id=" + id +
                ", mId=" + mId +
                ", classification='" + classification + '\'' +
                '}';
    }
}

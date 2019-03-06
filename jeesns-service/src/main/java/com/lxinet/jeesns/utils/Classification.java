package com.lxinet.jeesns.utils;


//用户选择分类后的新闻展示类
public class Classification {
    private Integer id;
    private Integer m_id;
    private String classification;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getM_id() {
        return m_id;
    }

    public void setM_id(Integer m_id) {
        this.m_id = m_id;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }
}

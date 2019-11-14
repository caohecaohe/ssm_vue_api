package com.ssm.gbq.model;


import java.util.Date;

/**
 * 面试总结类
 * @author tian
 */
public class Interviews {
    /**
     * 面试人ID
     */
    private Integer id;
    /**
     * 面试人姓名
     */
    private String iname;
    /**
     * 面试技术
     */
    private String iskill;
    /**
     * 面试地区
     */
    private String idistrict;
    /**
     * 面试时长
     */
    private String iduration;
    /**
     * 面试时间
     */
    private Date idatatime;
    /**
     * 面试情况
     */
    private String istatus;
    /**
     * 面试内容
     */
    private String icontent;
    /**
     * 备注
     */
    private String iremark;
    /**
     * 发布时间
     */
    private Date insertdate;
    /**
     * 修改时间
     */
    private Date modifydate;

    /**
     * 无参构造器
     */
    public Interviews() {
    }

    /**
     * 有参构造器
     */
    public Interviews(Integer id, String iname, String iskill, String idistrict, String iduration, Date idatatime, String istatus, String icontent, String iremark, Date insertdate, Date modifydate) {
        this.id = id;
        this.iname = iname;
        this.iskill = iskill;
        this.idistrict = idistrict;
        this.iduration = iduration;
        this.idatatime = idatatime;
        this.istatus = istatus;
        this.icontent = icontent;
        this.iremark = iremark;
        this.insertdate = insertdate;
        this.modifydate = modifydate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public String getIskill() {
        return iskill;
    }

    public void setIskill(String iskill) {
        this.iskill = iskill;
    }

    public String getIdistrict() {
        return idistrict;
    }

    public void setIdistrict(String idistrict) {
        this.idistrict = idistrict;
    }

    public String getIduration() {
        return iduration;
    }

    public void setIduration(String iduration) {
        this.iduration = iduration;
    }

    public Date getIdatatime() {
        return idatatime;
    }

    public void setIdatatime(Date idatatime) {
        this.idatatime = idatatime;
    }

    public String getIstatus() {
        return istatus;
    }

    public void setIstatus(String istatus) {
        this.istatus = istatus;
    }

    public String getIcontent() {
        return icontent;
    }

    public void setIcontent(String icontent) {
        this.icontent = icontent;
    }

    public String getIremark() {
        return iremark;
    }

    public void setIremark(String iremark) {
        this.iremark = iremark;
    }

    public Date getInsertdate() {
        return insertdate;
    }

    public void setInsertdate(Date insertdate) {
        this.insertdate = insertdate;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }
}

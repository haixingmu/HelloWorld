package com.yxe.application.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_CAFOS_VISITOR")
public class VisitorForm {
    /**
     * 主键
     */
    @Id
    @Column(name = "XH")
    private BigDecimal xh;

    /**
     * 工号，如果没有就为身份证号
     */
    @Column(name = "WORKERNO")
    private String workerno;

    /**
     * 姓名
     */
    @Column(name = "USERNAME")
    private String username;

    /**
     * 性别
     */
    @Column(name = "SEX")
    private String sex;

    /**
     * 身份证号
     */
    @Column(name = "ID")
    private String id;

    /**
     * 出生年月
     */
    @Column(name = "BIRTHDAY")
    private Date birthday;

    /**
     * 居住地址
     */
    @Column(name = "ADDRESS")
    private String address;

    /**
     * 电话
     */
    @Column(name = "TEL")
    private String tel;

    /**
     * 身份证照片
     */
    @Column(name = "PIC")
    private String pic;

    /**
     * 是否有效
     */
    @Column(name = "YXBZ")
    private String yxbz;

    /**
     * 操作人id
     */
    @Column(name = "OPRID")
    private String oprid;

    /**
     * 操作日期
     */
    @Column(name = "OPRDATE")
    private Date oprdate;

    /**
     * 最近照片，就为人脸照片
     */
    @Column(name = "PIC1")
    private String pic1;

    /**
     * 人脸照片
     */
    @Column(name = "USER_FERET")
    private String userFeret;

    /**
     * 获取主键
     *
     * @return XH - 主键
     */
    public BigDecimal getXh() {
        return xh;
    }

    /**
     * 设置主键
     *
     * @param xh 主键
     */
    public void setXh(BigDecimal xh) {
        this.xh = xh;
    }

    /**
     * 获取工号，如果没有就为身份证号
     *
     * @return WORKERNO - 工号，如果没有就为身份证号
     */
    public String getWorkerno() {
        return workerno;
    }

    /**
     * 设置工号，如果没有就为身份证号
     *
     * @param workerno 工号，如果没有就为身份证号
     */
    public void setWorkerno(String workerno) {
        this.workerno = workerno;
    }

    /**
     * 获取姓名
     *
     * @return USERNAME - 姓名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置姓名
     *
     * @param username 姓名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取性别
     *
     * @return SEX - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取身份证号
     *
     * @return ID - 身份证号
     */
    public String getId() {
        return id;
    }

    /**
     * 设置身份证号
     *
     * @param id 身份证号
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取出生年月
     *
     * @return BIRTHDAY - 出生年月
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置出生年月
     *
     * @param birthday 出生年月
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取居住地址
     *
     * @return ADDRESS - 居住地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置居住地址
     *
     * @param address 居住地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取电话
     *
     * @return TEL - 电话
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置电话
     *
     * @param tel 电话
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取身份证照片
     *
     * @return PIC - 身份证照片
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置身份证照片
     *
     * @param pic 身份证照片
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * 获取是否有效
     *
     * @return YXBZ - 是否有效
     */
    public String getYxbz() {
        return yxbz;
    }

    /**
     * 设置是否有效
     *
     * @param yxbz 是否有效
     */
    public void setYxbz(String yxbz) {
        this.yxbz = yxbz;
    }

    /**
     * 获取操作人id
     *
     * @return OPRID - 操作人id
     */
    public String getOprid() {
        return oprid;
    }

    /**
     * 设置操作人id
     *
     * @param oprid 操作人id
     */
    public void setOprid(String oprid) {
        this.oprid = oprid;
    }

    /**
     * 获取操作日期
     *
     * @return OPRDATE - 操作日期
     */
    public Date getOprdate() {
        return oprdate;
    }

    /**
     * 设置操作日期
     *
     * @param oprdate 操作日期
     */
    public void setOprdate(Date oprdate) {
        this.oprdate = oprdate;
    }

    /**
     * 获取最近照片，就为人脸照片
     *
     * @return PIC1 - 最近照片，就为人脸照片
     */
    public String getPic1() {
        return pic1;
    }

    /**
     * 设置最近照片，就为人脸照片
     *
     * @param pic1 最近照片，就为人脸照片
     */
    public void setPic1(String pic1) {
        this.pic1 = pic1;
    }

    /**
     * 获取人脸照片
     *
     * @return USER_FERET - 人脸照片
     */
    public String getUserFeret() {
        return userFeret;
    }

    /**
     * 设置人脸照片
     *
     * @param userFeret 人脸照片
     */
    public void setUserFeret(String userFeret) {
        this.userFeret = userFeret;
    }
}
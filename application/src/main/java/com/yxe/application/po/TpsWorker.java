package com.yxe.application.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_CAFOS_TPS_WORKER")
public class TpsWorker {
    @Id
    @Column(name = "XH")
    private BigDecimal xh;

    @Column(name = "CNTRCTXH")
    private BigDecimal cntrctxh;

    @Column(name = "WORKERNO")
    private String workerno;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "SEX")
    private String sex;

    @Column(name = "ID")
    private String id;

    @Column(name = "BIRTHDAY")
    private Date birthday;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "TEL")
    private String tel;

    @Column(name = "WORKTYPE")
    private String worktype;

    @Column(name = "PIC")
    private String pic;

    @Column(name = "SCORE_ALL")
    private BigDecimal scoreAll;

    @Column(name = "YXBZ")
    private String yxbz;

    @Column(name = "OPRID")
    private String oprid;

    @Column(name = "OPRDATE")
    private Date oprdate;

    @Column(name = "PIC1")
    private String pic1;

    @Column(name = "USER_FERET")
    private String userFeret;

    /**
     * @return XH
     */
    public BigDecimal getXh() {
        return xh;
    }

    /**
     * @param xh
     */
    public void setXh(BigDecimal xh) {
        this.xh = xh;
    }

    /**
     * @return CNTRCTXH
     */
    public BigDecimal getCntrctxh() {
        return cntrctxh;
    }

    /**
     * @param cntrctxh
     */
    public void setCntrctxh(BigDecimal cntrctxh) {
        this.cntrctxh = cntrctxh;
    }

    /**
     * @return WORKERNO
     */
    public String getWorkerno() {
        return workerno;
    }

    /**
     * @param workerno
     */
    public void setWorkerno(String workerno) {
        this.workerno = workerno;
    }

    /**
     * @return USERNAME
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return SEX
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return BIRTHDAY
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return ADDRESS
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return TEL
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return WORKTYPE
     */
    public String getWorktype() {
        return worktype;
    }

    /**
     * @param worktype
     */
    public void setWorktype(String worktype) {
        this.worktype = worktype;
    }

    /**
     * @return PIC
     */
    public String getPic() {
        return pic;
    }

    /**
     * @param pic
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * @return SCORE_ALL
     */
    public BigDecimal getScoreAll() {
        return scoreAll;
    }

    /**
     * @param scoreAll
     */
    public void setScoreAll(BigDecimal scoreAll) {
        this.scoreAll = scoreAll;
    }

    /**
     * @return YXBZ
     */
    public String getYxbz() {
        return yxbz;
    }

    /**
     * @param yxbz
     */
    public void setYxbz(String yxbz) {
        this.yxbz = yxbz;
    }

    /**
     * @return OPRID
     */
    public String getOprid() {
        return oprid;
    }

    /**
     * @param oprid
     */
    public void setOprid(String oprid) {
        this.oprid = oprid;
    }

    /**
     * @return OPRDATE
     */
    public Date getOprdate() {
        return oprdate;
    }

    /**
     * @param oprdate
     */
    public void setOprdate(Date oprdate) {
        this.oprdate = oprdate;
    }

    /**
     * @return PIC1
     */
    public String getPic1() {
        return pic1;
    }

    /**
     * @param pic1
     */
    public void setPic1(String pic1) {
        this.pic1 = pic1;
    }

    /**
     * @return USER_FERET
     */
    public String getUserFeret() {
        return userFeret;
    }

    /**
     * @param userFeret
     */
    public void setUserFeret(String userFeret) {
        this.userFeret = userFeret;
    }
}
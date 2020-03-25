package com.yxe.application.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "T_CAFOS_AC_CHANNELIN_WORKER")
public class AcChannelinWorker {
    @Id
    @Column(name = "XH")
    private String xh;

    @Column(name = "UPXH")
    private String upxh;

    @Column(name = "WORKER_TYPE")
    private String workerType;

    @Column(name = "USER_CODE")
    private String userCode;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "YXBZ")
    private String yxbz;

    @Column(name = "CARDTYPE")
    private String cardtype;

    @Column(name = "CARDNO")
    private String cardno;

    @Column(name = "OPRID")
    private String oprid;

    @Column(name = "OPRDATE")
    private Date oprdate;

    @Column(name = "ID_PIC")
    private String idPic;

    @Column(name = "USER_PIC")
    private String userPic;

    @Column(name = "USER_ADDRESS")
    private String userAddress;

    @Column(name = "USER_BIRTHDAY")
    private String userBirthday;

    @Column(name = "USER_SEX")
    private String userSex;

    @Column(name = "OVERFLAG")
    private String overflag;

    @Column(name = "EDU_FLAG")
    private String eduFlag;

    @Column(name = "EDU_DATE")
    private Date eduDate;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "USER_FERET")
    private String userFeret;

    @Column(name = "SN")
    private String sn;

    /**
     * @return XH
     */
    public String getXh() {
        return xh;
    }

    /**
     * @param xh
     */
    public void setXh(String xh) {
        this.xh = xh;
    }

    /**
     * @return UPXH
     */
    public String getUpxh() {
        return upxh;
    }

    /**
     * @param upxh
     */
    public void setUpxh(String upxh) {
        this.upxh = upxh;
    }

    /**
     * @return WORKER_TYPE
     */
    public String getWorkerType() {
        return workerType;
    }

    /**
     * @param workerType
     */
    public void setWorkerType(String workerType) {
        this.workerType = workerType;
    }

    /**
     * @return USER_CODE
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * @param userCode
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    /**
     * @return USER_NAME
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
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
     * @return CARDTYPE
     */
    public String getCardtype() {
        return cardtype;
    }

    /**
     * @param cardtype
     */
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    /**
     * @return CARDNO
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * @param cardno
     */
    public void setCardno(String cardno) {
        this.cardno = cardno;
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
     * @return ID_PIC
     */
    public String getIdPic() {
        return idPic;
    }

    /**
     * @param idPic
     */
    public void setIdPic(String idPic) {
        this.idPic = idPic;
    }

    /**
     * @return USER_PIC
     */
    public String getUserPic() {
        return userPic;
    }

    /**
     * @param userPic
     */
    public void setUserPic(String userPic) {
        this.userPic = userPic;
    }

    /**
     * @return USER_ADDRESS
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * @param userAddress
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    /**
     * @return USER_BIRTHDAY
     */
    public String getUserBirthday() {
        return userBirthday;
    }

    /**
     * @param userBirthday
     */
    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    /**
     * @return USER_SEX
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * @param userSex
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    /**
     * @return OVERFLAG
     */
    public String getOverflag() {
        return overflag;
    }

    /**
     * @param overflag
     */
    public void setOverflag(String overflag) {
        this.overflag = overflag;
    }

    /**
     * @return EDU_FLAG
     */
    public String getEduFlag() {
        return eduFlag;
    }

    /**
     * @param eduFlag
     */
    public void setEduFlag(String eduFlag) {
        this.eduFlag = eduFlag;
    }

    /**
     * @return EDU_DATE
     */
    public Date getEduDate() {
        return eduDate;
    }

    /**
     * @param eduDate
     */
    public void setEduDate(Date eduDate) {
        this.eduDate = eduDate;
    }

    /**
     * @return USER_ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
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

    /**
     * @return SN
     */
    public String getSn() {
        return sn;
    }

    /**
     * @param sn
     */
    public void setSn(String sn) {
        this.sn = sn;
    }
}
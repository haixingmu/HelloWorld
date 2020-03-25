package com.yxe.application.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "T_CAFOS_AC_CARD_HIS")
public class AcCardHis {
    @Id
    @Column(name = "XH")
    private String xh;

    @Column(name = "UPXH")
    private String upxh;

    @Column(name = "UNITNO")
    private String unitno;

    @Column(name = "CARD_NO")
    private String cardNo;

    @Column(name = "WORKER_TYPE")
    private String workerType;

    @Column(name = "CLIENT_CODE")
    private String clientCode;

    @Column(name = "CLIENT_NAME")
    private String clientName;

    @Column(name = "USER_CODE")
    private String userCode;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "SYN_CODE")
    private String synCode;

    @Column(name = "OPRID")
    private String oprid;

    @Column(name = "OPRDATE")
    private Date oprdate;

    @Column(name = "YXBZ")
    private String yxbz;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "USER_ID")
    private String userId;

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

    @Column(name = "REMARK")
    private String remark;

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
     * @return UNITNO
     */
    public String getUnitno() {
        return unitno;
    }

    /**
     * @param unitno
     */
    public void setUnitno(String unitno) {
        this.unitno = unitno;
    }

    /**
     * @return CARD_NO
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * @param cardNo
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
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
     * @return CLIENT_CODE
     */
    public String getClientCode() {
        return clientCode;
    }

    /**
     * @param clientCode
     */
    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    /**
     * @return CLIENT_NAME
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * @param clientName
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
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
     * @return SYN_CODE
     */
    public String getSynCode() {
        return synCode;
    }

    /**
     * @param synCode
     */
    public void setSynCode(String synCode) {
        this.synCode = synCode;
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
     * @return STATUS
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
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
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
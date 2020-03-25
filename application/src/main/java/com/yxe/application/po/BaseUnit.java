package com.yxe.application.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "T_BASE_UNIT")
public class BaseUnit {
    @Id
    @Column(name = "U_CODE")
    private String uCode;

    @Column(name = "U_NAME")
    private String uName;

    @Column(name = "U_BZ")
    private String uBz;

    @Column(name = "UP_U_CODE")
    private String upUCode;

    @Column(name = "U_ADDRESS")
    private String uAddress;

    @Column(name = "U_TEL")
    private String uTel;

    @Column(name = "U_FAX")
    private String uFax;

    @Column(name = "U_LEADER")
    private String uLeader;

    @Column(name = "U_EMAIL")
    private String uEmail;

    @Column(name = "U_BUILDDATE")
    private Date uBuilddate;

    @Column(name = "U_ORDER")
    private Long uOrder;

    @Column(name = "JC")
    private String jc;

    @Column(name = "JM")
    private String jm;

    @Column(name = "AREANO")
    private String areano;

    @Column(name = "BUKRS")
    private String bukrs;

    @Column(name = "U_NAME_ZH_CN")
    private String uNameZhCn;

    @Column(name = "U_NAME_ZH_TW")
    private String uNameZhTw;

    @Column(name = "U_NAME_EN_US")
    private String uNameEnUs;

    @Column(name = "JC_ZH_CN")
    private String jcZhCn;

    @Column(name = "JC_ZH_TW")
    private String jcZhTw;

    @Column(name = "JC_EN_US")
    private String jcEnUs;

    /**
     * @return U_CODE
     */
    public String getuCode() {
        return uCode;
    }

    /**
     * @param uCode
     */
    public void setuCode(String uCode) {
        this.uCode = uCode;
    }

    /**
     * @return U_NAME
     */
    public String getuName() {
        return uName;
    }

    /**
     * @param uName
     */
    public void setuName(String uName) {
        this.uName = uName;
    }

    /**
     * @return U_BZ
     */
    public String getuBz() {
        return uBz;
    }

    /**
     * @param uBz
     */
    public void setuBz(String uBz) {
        this.uBz = uBz;
    }

    /**
     * @return UP_U_CODE
     */
    public String getUpUCode() {
        return upUCode;
    }

    /**
     * @param upUCode
     */
    public void setUpUCode(String upUCode) {
        this.upUCode = upUCode;
    }

    /**
     * @return U_ADDRESS
     */
    public String getuAddress() {
        return uAddress;
    }

    /**
     * @param uAddress
     */
    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    /**
     * @return U_TEL
     */
    public String getuTel() {
        return uTel;
    }

    /**
     * @param uTel
     */
    public void setuTel(String uTel) {
        this.uTel = uTel;
    }

    /**
     * @return U_FAX
     */
    public String getuFax() {
        return uFax;
    }

    /**
     * @param uFax
     */
    public void setuFax(String uFax) {
        this.uFax = uFax;
    }

    /**
     * @return U_LEADER
     */
    public String getuLeader() {
        return uLeader;
    }

    /**
     * @param uLeader
     */
    public void setuLeader(String uLeader) {
        this.uLeader = uLeader;
    }

    /**
     * @return U_EMAIL
     */
    public String getuEmail() {
        return uEmail;
    }

    /**
     * @param uEmail
     */
    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    /**
     * @return U_BUILDDATE
     */
    public Date getuBuilddate() {
        return uBuilddate;
    }

    /**
     * @param uBuilddate
     */
    public void setuBuilddate(Date uBuilddate) {
        this.uBuilddate = uBuilddate;
    }

    /**
     * @return U_ORDER
     */
    public Long getuOrder() {
        return uOrder;
    }

    /**
     * @param uOrder
     */
    public void setuOrder(Long uOrder) {
        this.uOrder = uOrder;
    }

    /**
     * @return JC
     */
    public String getJc() {
        return jc;
    }

    /**
     * @param jc
     */
    public void setJc(String jc) {
        this.jc = jc;
    }

    /**
     * @return JM
     */
    public String getJm() {
        return jm;
    }

    /**
     * @param jm
     */
    public void setJm(String jm) {
        this.jm = jm;
    }

    /**
     * @return AREANO
     */
    public String getAreano() {
        return areano;
    }

    /**
     * @param areano
     */
    public void setAreano(String areano) {
        this.areano = areano;
    }

    /**
     * @return BUKRS
     */
    public String getBukrs() {
        return bukrs;
    }

    /**
     * @param bukrs
     */
    public void setBukrs(String bukrs) {
        this.bukrs = bukrs;
    }

    /**
     * @return U_NAME_ZH_CN
     */
    public String getuNameZhCn() {
        return uNameZhCn;
    }

    /**
     * @param uNameZhCn
     */
    public void setuNameZhCn(String uNameZhCn) {
        this.uNameZhCn = uNameZhCn;
    }

    /**
     * @return U_NAME_ZH_TW
     */
    public String getuNameZhTw() {
        return uNameZhTw;
    }

    /**
     * @param uNameZhTw
     */
    public void setuNameZhTw(String uNameZhTw) {
        this.uNameZhTw = uNameZhTw;
    }

    /**
     * @return U_NAME_EN_US
     */
    public String getuNameEnUs() {
        return uNameEnUs;
    }

    /**
     * @param uNameEnUs
     */
    public void setuNameEnUs(String uNameEnUs) {
        this.uNameEnUs = uNameEnUs;
    }

    /**
     * @return JC_ZH_CN
     */
    public String getJcZhCn() {
        return jcZhCn;
    }

    /**
     * @param jcZhCn
     */
    public void setJcZhCn(String jcZhCn) {
        this.jcZhCn = jcZhCn;
    }

    /**
     * @return JC_ZH_TW
     */
    public String getJcZhTw() {
        return jcZhTw;
    }

    /**
     * @param jcZhTw
     */
    public void setJcZhTw(String jcZhTw) {
        this.jcZhTw = jcZhTw;
    }

    /**
     * @return JC_EN_US
     */
    public String getJcEnUs() {
        return jcEnUs;
    }

    /**
     * @param jcEnUs
     */
    public void setJcEnUs(String jcEnUs) {
        this.jcEnUs = jcEnUs;
    }
}
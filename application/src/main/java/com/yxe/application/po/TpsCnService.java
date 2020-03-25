package com.yxe.application.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_CAFOS_TPS_CN_SERVICE")
public class TpsCnService {
    @Id
    @Column(name = "XH")
    private BigDecimal xh;

    @Column(name = "CNTRCTXH")
    private BigDecimal cntrctxh;

    @Column(name = "UNITNO")
    private String unitno;

    @Column(name = "PERSONTYPE_DM")
    private BigDecimal persontypeDm;

    @Column(name = "FLAG")
    private String flag;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "BLACKFLAG")
    private String blackflag;

    @Column(name = "OPRID")
    private String oprid;

    @Column(name = "OPRDATE")
    private Date oprdate;

    @Column(name = "YXBZ")
    private String yxbz;

    @Column(name = "ATTACH")
    private String attach;

    @Column(name = "CHARGE_PERSON")
    private String chargePerson;

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
     * @return PERSONTYPE_DM
     */
    public BigDecimal getPersontypeDm() {
        return persontypeDm;
    }

    /**
     * @param persontypeDm
     */
    public void setPersontypeDm(BigDecimal persontypeDm) {
        this.persontypeDm = persontypeDm;
    }

    /**
     * @return FLAG
     */
    public String getFlag() {
        return flag;
    }

    /**
     * @param flag
     */
    public void setFlag(String flag) {
        this.flag = flag;
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
     * @return BLACKFLAG
     */
    public String getBlackflag() {
        return blackflag;
    }

    /**
     * @param blackflag
     */
    public void setBlackflag(String blackflag) {
        this.blackflag = blackflag;
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
     * @return ATTACH
     */
    public String getAttach() {
        return attach;
    }

    /**
     * @param attach
     */
    public void setAttach(String attach) {
        this.attach = attach;
    }

    /**
     * @return CHARGE_PERSON
     */
    public String getChargePerson() {
        return chargePerson;
    }

    /**
     * @param chargePerson
     */
    public void setChargePerson(String chargePerson) {
        this.chargePerson = chargePerson;
    }
}
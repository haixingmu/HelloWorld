package com.yxe.application.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_CAFOS_TPS_WORKER_REWARD")
public class TpsWorkerReward {
    @Id
    @Column(name = "XH")
    private BigDecimal xh;

    @Column(name = "UPXH")
    private BigDecimal upxh;

    @Column(name = "SERVICEXH")
    private BigDecimal servicexh;

    @Column(name = "WORKERXH")
    private BigDecimal workerxh;

    @Column(name = "CNTRCTXH")
    private BigDecimal cntrctxh;

    @Column(name = "UNITNO")
    private String unitno;

    @Column(name = "DESCR")
    private String descr;

    @Column(name = "HAPPEN_DATE")
    private Date happenDate;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "SCORE")
    private BigDecimal score;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "ATTACH")
    private String attach;

    @Column(name = "OPRID")
    private String oprid;

    @Column(name = "OPRDATE")
    private Date oprdate;

    @Column(name = "YXBZ")
    private String yxbz;

    @Column(name = "SAFEFLAG")
    private String safeflag;

    @Column(name = "EB_XH")
    private String ebXh;

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
     * @return UPXH
     */
    public BigDecimal getUpxh() {
        return upxh;
    }

    /**
     * @param upxh
     */
    public void setUpxh(BigDecimal upxh) {
        this.upxh = upxh;
    }

    /**
     * @return SERVICEXH
     */
    public BigDecimal getServicexh() {
        return servicexh;
    }

    /**
     * @param servicexh
     */
    public void setServicexh(BigDecimal servicexh) {
        this.servicexh = servicexh;
    }

    /**
     * @return WORKERXH
     */
    public BigDecimal getWorkerxh() {
        return workerxh;
    }

    /**
     * @param workerxh
     */
    public void setWorkerxh(BigDecimal workerxh) {
        this.workerxh = workerxh;
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
     * @return DESCR
     */
    public String getDescr() {
        return descr;
    }

    /**
     * @param descr
     */
    public void setDescr(String descr) {
        this.descr = descr;
    }

    /**
     * @return HAPPEN_DATE
     */
    public Date getHappenDate() {
        return happenDate;
    }

    /**
     * @param happenDate
     */
    public void setHappenDate(Date happenDate) {
        this.happenDate = happenDate;
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
     * @return TYPE
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return SCORE
     */
    public BigDecimal getScore() {
        return score;
    }

    /**
     * @param score
     */
    public void setScore(BigDecimal score) {
        this.score = score;
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
     * @return SAFEFLAG
     */
    public String getSafeflag() {
        return safeflag;
    }

    /**
     * @param safeflag
     */
    public void setSafeflag(String safeflag) {
        this.safeflag = safeflag;
    }

    /**
     * @return EB_XH
     */
    public String getEbXh() {
        return ebXh;
    }

    /**
     * @param ebXh
     */
    public void setEbXh(String ebXh) {
        this.ebXh = ebXh;
    }
}
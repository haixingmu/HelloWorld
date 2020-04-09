package com.yxe.application.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_CAFOS_TPS_UNWORKER")
public class TpsUnWorker {
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

    @Column(name = "BLACKFLAG")
    private String blackflag;

    @Column(name = "PDATE")
    private Date pdate;

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
     * @return PDATE
     */
    public Date getPdate() {
        return pdate;
    }

    /**
     * @param pdate
     */
    public void setPdate(Date pdate) {
        this.pdate = pdate;
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
}
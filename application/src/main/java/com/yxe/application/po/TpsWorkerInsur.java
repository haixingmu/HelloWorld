package com.yxe.application.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_CAFOS_TPS_WORKER_INSURANCE")
public class TpsWorkerInsur {
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

    @Column(name = "INSURANCE_TYPE")
    private String insuranceType;

    @Column(name = "INSURANCE_NO")
    private String insuranceNo;

    @Column(name = "INSURANCE_BEGIN")
    private Date insuranceBegin;

    @Column(name = "INSURANCE_END")
    private Date insuranceEnd;

    @Column(name = "FLAG")
    private String flag;

    @Column(name = "YXBZ")
    private String yxbz;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "ATTACH")
    private String attach;

    @Column(name = "OPRID")
    private String oprid;

    @Column(name = "OPRDATE")
    private Date oprdate;

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
     * @return INSURANCE_TYPE
     */
    public String getInsuranceType() {
        return insuranceType;
    }

    /**
     * @param insuranceType
     */
    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    /**
     * @return INSURANCE_NO
     */
    public String getInsuranceNo() {
        return insuranceNo;
    }

    /**
     * @param insuranceNo
     */
    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }

    /**
     * @return INSURANCE_BEGIN
     */
    public Date getInsuranceBegin() {
        return insuranceBegin;
    }

    /**
     * @param insuranceBegin
     */
    public void setInsuranceBegin(Date insuranceBegin) {
        this.insuranceBegin = insuranceBegin;
    }

    /**
     * @return INSURANCE_END
     */
    public Date getInsuranceEnd() {
        return insuranceEnd;
    }

    /**
     * @param insuranceEnd
     */
    public void setInsuranceEnd(Date insuranceEnd) {
        this.insuranceEnd = insuranceEnd;
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
}
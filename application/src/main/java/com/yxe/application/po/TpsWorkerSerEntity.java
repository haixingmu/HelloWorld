package com.yxe.application.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_CAFOS_TPS_WORKER_SERVICE")
public class TpsWorkerSerEntity {
    @Column(name = "XH")
    private String xh;

    @Column(name = "SERVICEXH")
    private BigDecimal servicexh;

    @Column(name = "CNTRCTXH")
    private BigDecimal cntrctxh;

    @Column(name = "UNITNO")
    private String unitno;

    @Column(name = "WORKERXH")
    private BigDecimal workerxh;

    @Column(name = "PERSONTYPE")
    private BigDecimal persontype;

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

    @Column(name = "SPECIAL_FLAG")
    private String specialFlag;

    @Column(name = "ATTACH")
    private String attach;

    @Column(name = "WORK_AREA")
    private String workArea;

    @Column(name = "TEMP_XH")
    private String tempXh;

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
     * @return PERSONTYPE
     */
    public BigDecimal getPersontype() {
        return persontype;
    }

    /**
     * @param persontype
     */
    public void setPersontype(BigDecimal persontype) {
        this.persontype = persontype;
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
     * @return SPECIAL_FLAG
     */
    public String getSpecialFlag() {
        return specialFlag;
    }

    /**
     * @param specialFlag
     */
    public void setSpecialFlag(String specialFlag) {
        this.specialFlag = specialFlag;
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
     * @return WORK_AREA
     */
    public String getWorkArea() {
        return workArea;
    }

    /**
     * @param workArea
     */
    public void setWorkArea(String workArea) {
        this.workArea = workArea;
    }

    /**
     * @return TEMP_XH
     */
    public String getTempXh() {
        return tempXh;
    }

    /**
     * @param tempXh
     */
    public void setTempXh(String tempXh) {
        this.tempXh = tempXh;
    }
}
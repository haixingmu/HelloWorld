package com.yxe.application.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_CAFOS_TPS_WORKER_PROJECT")
public class TpsWorkerProj {
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

    @Column(name = "PROJECT_NAME")
    private String projectName;

    @Column(name = "WORK_AREA")
    private String workArea;

    @Column(name = "PROJECT_BEGIN")
    private Date projectBegin;

    @Column(name = "PROJECT_END")
    private Date projectEnd;

    @Column(name = "WORK")
    private String work;

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
     * @return PROJECT_NAME
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * @param projectName
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
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
     * @return PROJECT_BEGIN
     */
    public Date getProjectBegin() {
        return projectBegin;
    }

    /**
     * @param projectBegin
     */
    public void setProjectBegin(Date projectBegin) {
        this.projectBegin = projectBegin;
    }

    /**
     * @return PROJECT_END
     */
    public Date getProjectEnd() {
        return projectEnd;
    }

    /**
     * @param projectEnd
     */
    public void setProjectEnd(Date projectEnd) {
        this.projectEnd = projectEnd;
    }

    /**
     * @return WORK
     */
    public String getWork() {
        return work;
    }

    /**
     * @param work
     */
    public void setWork(String work) {
        this.work = work;
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
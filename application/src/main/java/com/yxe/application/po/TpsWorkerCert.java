package com.yxe.application.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_CAFOS_TPS_WORKER_CERT")
public class TpsWorkerCert {
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

    @Column(name = "CERT_TYPE")
    private String certType;

    @Column(name = "PAPERS_NO")
    private String papersNo;

    /**
     * 复审日期
     */
    @Column(name = "PAPERS_BEGIN")
    private Date papersBegin;

    /**
     * 有效期止（复审日期+复审期限）
     */
    @Column(name = "PAPERS_END")
    private Date papersEnd;

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
     * 复审期限（默认一年）
     */
    @Column(name = "CHECK_SPAN")
    private BigDecimal checkSpan;

    /**
     * 发证日期，不填默认即为复审日期
     */
    @Column(name = "PAPERS_START")
    private Date papersStart;

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
     * @return CERT_TYPE
     */
    public String getCertType() {
        return certType;
    }

    /**
     * @param certType
     */
    public void setCertType(String certType) {
        this.certType = certType;
    }

    /**
     * @return PAPERS_NO
     */
    public String getPapersNo() {
        return papersNo;
    }

    /**
     * @param papersNo
     */
    public void setPapersNo(String papersNo) {
        this.papersNo = papersNo;
    }

    /**
     * 获取复审日期
     *
     * @return PAPERS_BEGIN - 复审日期
     */
    public Date getPapersBegin() {
        return papersBegin;
    }

    /**
     * 设置复审日期
     *
     * @param papersBegin 复审日期
     */
    public void setPapersBegin(Date papersBegin) {
        this.papersBegin = papersBegin;
    }

    /**
     * 获取有效期止（复审日期+复审期限）
     *
     * @return PAPERS_END - 有效期止（复审日期+复审期限）
     */
    public Date getPapersEnd() {
        return papersEnd;
    }

    /**
     * 设置有效期止（复审日期+复审期限）
     *
     * @param papersEnd 有效期止（复审日期+复审期限）
     */
    public void setPapersEnd(Date papersEnd) {
        this.papersEnd = papersEnd;
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

    /**
     * 获取复审期限（默认一年）
     *
     * @return CHECK_SPAN - 复审期限（默认一年）
     */
    public BigDecimal getCheckSpan() {
        return checkSpan;
    }

    /**
     * 设置复审期限（默认一年）
     *
     * @param checkSpan 复审期限（默认一年）
     */
    public void setCheckSpan(BigDecimal checkSpan) {
        this.checkSpan = checkSpan;
    }

    /**
     * 获取发证日期，不填默认即为复审日期
     *
     * @return PAPERS_START - 发证日期，不填默认即为复审日期
     */
    public Date getPapersStart() {
        return papersStart;
    }

    /**
     * 设置发证日期，不填默认即为复审日期
     *
     * @param papersStart 发证日期，不填默认即为复审日期
     */
    public void setPapersStart(Date papersStart) {
        this.papersStart = papersStart;
    }
}
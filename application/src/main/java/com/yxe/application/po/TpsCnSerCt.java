package com.yxe.application.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_CAFOS_TPS_CN_SERVICE_CT")
public class TpsCnSerCt {
    @Id
    @Column(name = "XH")
    private BigDecimal xh;

    @Column(name = "UPXH")
    private BigDecimal upxh;

    @Column(name = "CNTRCTXH")
    private BigDecimal cntrctxh;

    @Column(name = "CERT_NO")
    private String certNo;

    @Column(name = "CERT_NAME")
    private String certName;

    @Column(name = "BEGINTIME")
    private Date begintime;

    @Column(name = "ENDTIME")
    private Date endtime;

    @Column(name = "OPRID")
    private String oprid;

    @Column(name = "OPRDATE")
    private Date oprdate;

    @Column(name = "YXBZ")
    private String yxbz;

    @Column(name = "ATTACH")
    private String attach;

    @Column(name = "FLAG")
    private String flag;

    @Column(name = "D_CODE")
    private String dCode;

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
     * @return CERT_NO
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * @param certNo
     */
    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    /**
     * @return CERT_NAME
     */
    public String getCertName() {
        return certName;
    }

    /**
     * @param certName
     */
    public void setCertName(String certName) {
        this.certName = certName;
    }

    /**
     * @return BEGINTIME
     */
    public Date getBegintime() {
        return begintime;
    }

    /**
     * @param begintime
     */
    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    /**
     * @return ENDTIME
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * @param endtime
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
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
     * @return D_CODE
     */
    public String getdCode() {
        return dCode;
    }

    /**
     * @param dCode
     */
    public void setdCode(String dCode) {
        this.dCode = dCode;
    }
}
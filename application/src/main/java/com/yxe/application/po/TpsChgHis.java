package com.yxe.application.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_CAFOS_TPS_CHANGE_HIS")
public class TpsChgHis {
    @Column(name = "XH")
    private BigDecimal xh;

    @Column(name = "UPXH")
    private BigDecimal upxh;

    @Column(name = "LX")
    private String lx;

    @Column(name = "EDITFLAG")
    private String editflag;

    @Column(name = "DETAILXH")
    private BigDecimal detailxh;

    @Column(name = "OPRID")
    private String oprid;

    @Column(name = "OPRTIME")
    private Date oprtime;

    @Column(name = "LY")
    private String ly;

    @Column(name = "BEGINTIME")
    private Date begintime;

    @Column(name = "ENDTIME")
    private Date endtime;

    @Column(name = "HYXBZ")
    private String hyxbz;

    @Column(name = "HFLAG")
    private String hflag;

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
     * @return LX
     */
    public String getLx() {
        return lx;
    }

    /**
     * @param lx
     */
    public void setLx(String lx) {
        this.lx = lx;
    }

    /**
     * @return EDITFLAG
     */
    public String getEditflag() {
        return editflag;
    }

    /**
     * @param editflag
     */
    public void setEditflag(String editflag) {
        this.editflag = editflag;
    }

    /**
     * @return DETAILXH
     */
    public BigDecimal getDetailxh() {
        return detailxh;
    }

    /**
     * @param detailxh
     */
    public void setDetailxh(BigDecimal detailxh) {
        this.detailxh = detailxh;
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
     * @return OPRTIME
     */
    public Date getOprtime() {
        return oprtime;
    }

    /**
     * @param oprtime
     */
    public void setOprtime(Date oprtime) {
        this.oprtime = oprtime;
    }

    /**
     * @return LY
     */
    public String getLy() {
        return ly;
    }

    /**
     * @param ly
     */
    public void setLy(String ly) {
        this.ly = ly;
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
     * @return HYXBZ
     */
    public String getHyxbz() {
        return hyxbz;
    }

    /**
     * @param hyxbz
     */
    public void setHyxbz(String hyxbz) {
        this.hyxbz = hyxbz;
    }

    /**
     * @return HFLAG
     */
    public String getHflag() {
        return hflag;
    }

    /**
     * @param hflag
     */
    public void setHflag(String hflag) {
        this.hflag = hflag;
    }
}
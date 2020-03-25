package com.yxe.application.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_CAFOS_TPS_CN_SERVICE_JUDGE")
public class TpsCnServiceJudge {
    @Column(name = "XH")
    private BigDecimal xh;

    @Column(name = "UPXH")
    private BigDecimal upxh;

    @Column(name = "ITEM_NO")
    private String itemNo;

    @Column(name = "DELAY")
    private BigDecimal delay;

    @Column(name = "BASEDATE")
    private Date basedate;

    @Column(name = "BEGINDATE")
    private Date begindate;

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
     * @return ITEM_NO
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * @param itemNo
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    /**
     * @return DELAY
     */
    public BigDecimal getDelay() {
        return delay;
    }

    /**
     * @param delay
     */
    public void setDelay(BigDecimal delay) {
        this.delay = delay;
    }

    /**
     * @return BASEDATE
     */
    public Date getBasedate() {
        return basedate;
    }

    /**
     * @param basedate
     */
    public void setBasedate(Date basedate) {
        this.basedate = basedate;
    }

    /**
     * @return BEGINDATE
     */
    public Date getBegindate() {
        return begindate;
    }

    /**
     * @param begindate
     */
    public void setBegindate(Date begindate) {
        this.begindate = begindate;
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
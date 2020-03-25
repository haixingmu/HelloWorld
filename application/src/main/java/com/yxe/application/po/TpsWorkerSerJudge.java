package com.yxe.application.po;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "T_CAFOS_TPS_WORKER_SER_JUDGE")
public class TpsWorkerSerJudge {
    @Id
    @Column(name = "XH")
    private Integer xh;

    @Column(name = "UPXH")
    private Integer upxh;

    @Column(name = "ITEM_NO")
    private String itemNo;

    @Column(name = "DELAY")
    private Integer delay;

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
    public Integer getXh() {
        return xh;
    }

    /**
     * @param xh
     */
    public void setXh(Integer xh) {
        this.xh = xh;
    }

    /**
     * @return UPXH
     */
    public Integer getUpxh() {
        return upxh;
    }

    /**
     * @param upxh
     */
    public void setUpxh(Integer upxh) {
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
    public Integer getDelay() {
        return delay;
    }

    /**
     * @param delay
     */
    public void setDelay(Integer delay) {
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
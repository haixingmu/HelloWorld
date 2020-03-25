package com.yxe.application.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "T_CAFOS_AC_CHANNELIN_CHANNEL")
public class AcChannelinChannel {
    @Id
    @Column(name = "XH")
    private String xh;

    @Column(name = "UPXH")
    private String upxh;

    @Column(name = "CHANNEL_NO")
    private String channelNo;

    @Column(name = "REQ_BEGIN")
    private Date reqBegin;

    @Column(name = "REQ_END")
    private Date reqEnd;

    @Column(name = "CHECK_CYCLE")
    private Long checkCycle;

    @Column(name = "DEF_DAY")
    private Long defDay;

    @Column(name = "MAX_DAY")
    private Long maxDay;

    @Column(name = "LOCKFLAG")
    private String lockflag;

    @Column(name = "OPRID")
    private String oprid;

    @Column(name = "OPRDATE")
    private Date oprdate;

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
     * @return UPXH
     */
    public String getUpxh() {
        return upxh;
    }

    /**
     * @param upxh
     */
    public void setUpxh(String upxh) {
        this.upxh = upxh;
    }

    /**
     * @return CHANNEL_NO
     */
    public String getChannelNo() {
        return channelNo;
    }

    /**
     * @param channelNo
     */
    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
    }

    /**
     * @return REQ_BEGIN
     */
    public Date getReqBegin() {
        return reqBegin;
    }

    /**
     * @param reqBegin
     */
    public void setReqBegin(Date reqBegin) {
        this.reqBegin = reqBegin;
    }

    /**
     * @return REQ_END
     */
    public Date getReqEnd() {
        return reqEnd;
    }

    /**
     * @param reqEnd
     */
    public void setReqEnd(Date reqEnd) {
        this.reqEnd = reqEnd;
    }

    /**
     * @return CHECK_CYCLE
     */
    public Long getCheckCycle() {
        return checkCycle;
    }

    /**
     * @param checkCycle
     */
    public void setCheckCycle(Long checkCycle) {
        this.checkCycle = checkCycle;
    }

    /**
     * @return DEF_DAY
     */
    public Long getDefDay() {
        return defDay;
    }

    /**
     * @param defDay
     */
    public void setDefDay(Long defDay) {
        this.defDay = defDay;
    }

    /**
     * @return MAX_DAY
     */
    public Long getMaxDay() {
        return maxDay;
    }

    /**
     * @param maxDay
     */
    public void setMaxDay(Long maxDay) {
        this.maxDay = maxDay;
    }

    /**
     * @return LOCKFLAG
     */
    public String getLockflag() {
        return lockflag;
    }

    /**
     * @param lockflag
     */
    public void setLockflag(String lockflag) {
        this.lockflag = lockflag;
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
package com.yxe.application.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_HSE_MOC_SINFOUPDATE_SETTING")
public class MocSinfoupdateSetting {
    @Id
    @Column(name = "ID")
    private BigDecimal id;

    @Column(name = "SINFO_ID")
    private String sinfoId;

    @Column(name = "SINFO_DESC")
    private String sinfoDesc;

    @Column(name = "EFFECTIVE_STATUS")
    private String effectiveStatus;

    @Column(name = "OPRID")
    private String oprid;

    @Column(name = "OPR_DATE")
    private Date oprDate;

    @Column(name = "UNITNO")
    private String unitno;

    /**
     * @return ID
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * @return SINFO_ID
     */
    public String getSinfoId() {
        return sinfoId;
    }

    /**
     * @param sinfoId
     */
    public void setSinfoId(String sinfoId) {
        this.sinfoId = sinfoId;
    }

    /**
     * @return SINFO_DESC
     */
    public String getSinfoDesc() {
        return sinfoDesc;
    }

    /**
     * @param sinfoDesc
     */
    public void setSinfoDesc(String sinfoDesc) {
        this.sinfoDesc = sinfoDesc;
    }

    /**
     * @return EFFECTIVE_STATUS
     */
    public String getEffectiveStatus() {
        return effectiveStatus;
    }

    /**
     * @param effectiveStatus
     */
    public void setEffectiveStatus(String effectiveStatus) {
        this.effectiveStatus = effectiveStatus;
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
     * @return OPR_DATE
     */
    public Date getOprDate() {
        return oprDate;
    }

    /**
     * @param oprDate
     */
    public void setOprDate(Date oprDate) {
        this.oprDate = oprDate;
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
}
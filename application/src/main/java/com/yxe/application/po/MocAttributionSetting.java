package com.yxe.application.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_HSE_MOC_ATTRIBUTION_SETTING")
public class MocAttributionSetting {
    @Id
    @Column(name = "ID")
    private BigDecimal id;

    @Column(name = "ATTRI_ID")
    private String attriId;

    @Column(name = "ATTRI_DESC")
    private String attriDesc;

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
     * @return ATTRI_ID
     */
    public String getAttriId() {
        return attriId;
    }

    /**
     * @param attriId
     */
    public void setAttriId(String attriId) {
        this.attriId = attriId;
    }

    /**
     * @return ATTRI_DESC
     */
    public String getAttriDesc() {
        return attriDesc;
    }

    /**
     * @param attriDesc
     */
    public void setAttriDesc(String attriDesc) {
        this.attriDesc = attriDesc;
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
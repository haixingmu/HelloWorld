package com.yxe.application.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_HSE_MOC_CLSCHK_SETTING")
public class MocClschkSetting {
    @Id
    @Column(name = "ID")
    private BigDecimal id;

    @Column(name = "CLSCHK_ITEM")
    private String clschkItem;

    @Column(name = "CLSCHK_DESC")
    private String clschkDesc;

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
     * @return CLSCHK_ITEM
     */
    public String getClschkItem() {
        return clschkItem;
    }

    /**
     * @param clschkItem
     */
    public void setClschkItem(String clschkItem) {
        this.clschkItem = clschkItem;
    }

    /**
     * @return CLSCHK_DESC
     */
    public String getClschkDesc() {
        return clschkDesc;
    }

    /**
     * @param clschkDesc
     */
    public void setClschkDesc(String clschkDesc) {
        this.clschkDesc = clschkDesc;
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
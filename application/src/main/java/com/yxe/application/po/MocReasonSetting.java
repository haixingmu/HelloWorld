package com.yxe.application.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "T_HSE_MOC_REASON_SETTING")
public class MocReasonSetting extends MocReasonSettingKey {
    @Column(name = "REASON_ID")
    private String reasonId;

    @Column(name = "UNITNO")
    private String unitno;

    @Column(name = "REASON_DESC")
    private String reasonDesc;

    @Column(name = "EFFECTIVE_STATUS")
    private String effectiveStatus;

    @Column(name = "OPRID")
    private String oprid;

    @Column(name = "OPR_DATE")
    private Date oprDate;


    /**
     * @return REASON_ID
     */
    public String getReasonId() {
        return reasonId;
    }

    /**
     * @param reasonId
     */
    public void setReasonId(String reasonId) {
        this.reasonId = reasonId;
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
    
    /**
     * @return REASON_DESC
     */
    public String getReasonDesc() {
        return reasonDesc;
    }

    /**
     * @param reasonDesc
     */
    public void setReasonDesc(String reasonDesc) {
        this.reasonDesc = reasonDesc;
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
}
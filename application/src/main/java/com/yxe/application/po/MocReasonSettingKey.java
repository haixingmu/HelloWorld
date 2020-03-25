package com.yxe.application.po;

import javax.persistence.*;

@Table(name = "T_HSE_MOC_REASON_SETTING")
public class MocReasonSettingKey {
    @Id
    @Column(name = "REASON_ID")
    private String reasonId;

    @Id
    @Column(name = "UNITNO")
    private String unitno;

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
}
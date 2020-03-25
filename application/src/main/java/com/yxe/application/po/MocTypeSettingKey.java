package com.yxe.application.po;

import javax.persistence.*;

@Table(name = "T_HSE_MOC_TYPE_SETTING")
public class MocTypeSettingKey {
    @Id
    @Column(name = "TYPE_ID")
    private String typeId;

    @Id
    @Column(name = "UNITNO")
    private String unitno;

    @Id
    @Column(name = "GRADE_ID")
    private String gradeId;

    /**
     * @return TYPE_ID
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * @param typeId
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId;
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
     * @return GRADE_ID
     */
    public String getGradeId() {
        return gradeId;
    }

    /**
     * @param gradeId
     */
    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }
}
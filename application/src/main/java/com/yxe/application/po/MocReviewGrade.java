package com.yxe.application.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "T_HSE_MOC_REVIEWGRADE")
public class MocReviewGrade {
    @Id
    @Column(name = "GRADE_ID")
    private String gradeId;

    @Column(name = "GRADE_DESC")
    private String gradeDesc;

    @Column(name = "EFFECTIVE_DATE")
    private Date effectiveDate;

    @Column(name = "EFFECTIVE_STATUS")
    private String effectiveStatus;

    @Column(name = "OPRID")
    private String oprid;

    @Column(name = "OPR_DATE")
    private Date oprDate;

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

    /**
     * @return GRADE_DESC
     */
    public String getGradeDesc() {
        return gradeDesc;
    }

    /**
     * @param gradeDesc
     */
    public void setGradeDesc(String gradeDesc) {
        this.gradeDesc = gradeDesc;
    }

    /**
     * @return EFFECTIVE_DATE
     */
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * @param effectiveDate
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
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
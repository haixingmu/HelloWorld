package com.yxe.application.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_HSE_MOC_HAZ_APPROVERS")
public class MocHazApprovers {
    @Id
    @Column(name = "ID")
    private BigDecimal id;

    @Column(name = "UNITNO")
    private String unitno;

    @Column(name = "DEPTNO")
    private String deptno;

    @Column(name = "EMPID")
    private String empid;

    @Column(name = "EMPNAME")
    private String empname;

    @Column(name = "EFFECTIVE_STATUS")
    private String effectiveStatus;

    @Column(name = "APP_SEQ")
    private String appSeq;

    @Column(name = "OPRID")
    private String oprid;

    @Column(name = "OPR_DATE")
    private Date oprDate;

    @Column(name = "BASED_UNITNO")
    private String basedUnitno;

    @Column(name = "GRADE_ID")
    private String gradeId;

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
     * @return DEPTNO
     */
    public String getDeptno() {
        return deptno;
    }

    /**
     * @param deptno
     */
    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    /**
     * @return EMPID
     */
    public String getEmpid() {
        return empid;
    }

    /**
     * @param empid
     */
    public void setEmpid(String empid) {
        this.empid = empid;
    }

    /**
     * @return EMPNAME
     */
    public String getEmpname() {
        return empname;
    }

    /**
     * @param empname
     */
    public void setEmpname(String empname) {
        this.empname = empname;
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
     * @return APP_SEQ
     */
    public String getAppSeq() {
        return appSeq;
    }

    /**
     * @param appSeq
     */
    public void setAppSeq(String appSeq) {
        this.appSeq = appSeq;
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
     * @return BASED_UNITNO
     */
    public String getBasedUnitno() {
        return basedUnitno;
    }

    /**
     * @param basedUnitno
     */
    public void setBasedUnitno(String basedUnitno) {
        this.basedUnitno = basedUnitno;
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
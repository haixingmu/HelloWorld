package com.yxe.application.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_HSE_MOC_WORKSTEP")
public class MocWorkstep {
    @Id
    @Column(name = "ID")
    private BigDecimal id;

    @Column(name = "UNITNO")
    private String unitno;

    @Column(name = "STEPID")
    private String stepid;

    @Column(name = "STEPNAME")
    private String stepname;

    @Column(name = "EFFECTIVE_STATUS")
    private String effectiveStatus;

    @Column(name = "OPRID")
    private String oprid;

    @Column(name = "OPRTIME")
    private Date oprtime;

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
     * @return STEPID
     */
    public String getStepid() {
        return stepid;
    }

    /**
     * @param stepid
     */
    public void setStepid(String stepid) {
        this.stepid = stepid;
    }

    /**
     * @return STEPNAME
     */
    public String getStepname() {
        return stepname;
    }

    /**
     * @param stepname
     */
    public void setStepname(String stepname) {
        this.stepname = stepname;
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
     * @return OPRTIME
     */
    public Date getOprtime() {
        return oprtime;
    }

    /**
     * @param oprtime
     */
    public void setOprtime(Date oprtime) {
        this.oprtime = oprtime;
    }
}
package com.yxe.application.po;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_HSE_SECURITY_CHECK_LIST_HRIS")
public class SecChkHris {
    @Id
    @Column(name = "ID")
    private BigDecimal id;

    @Column(name = "CL_HRIS_SEQ")
    private BigDecimal clHrisSeq;

    @Column(name = "CL_SEQ")
    private String clSeq;

    @Column(name = "CL_NO")
    private String clNo;

    @Column(name = "BU_TO")
    private String buTo;

    @Column(name = "CHECK_DATE")
    private Date checkDate;

    @Column(name = "SCOPE_DEPT_NO")
    private String scopeDeptNo;

    @Column(name = "SHORT_TYPE")
    private String shortType;

    @Column(name = "SERIOUS_TYPE")
    private String seriousType;

    @Column(name = "DUTY_DEPT_NO")
    private String dutyDeptNo;

    @Column(name = "DUTY_DEPT_SUP")
    private String dutyDeptSup;

    @Column(name = "DUTY_DEPT_PERSON")
    private String dutyDeptPerson;

    @Column(name = "REVISE_DATE")
    private Date reviseDate;

    @Column(name = "SHORT_DESCR")
    private String shortDescr;

    @Column(name = "MEMO")
    private String memo;

    @Column(name = "CREATE_DATE")
    private Date createDate;

    @Column(name = "OPRID")
    private String oprid;

    @Column(name = "UPDATE_DATE")
    private Date updateDate;

    @Column(name = "IMPROVE_DESCR")
    private String improveDescr;

    @Column(name = "FINISHED_DATE")
    private Date finishedDate;

    @Column(name = "DUTY_PERSON")
    private String dutyPerson;

    @Column(name = "DUTY_PERSON_SUP")
    private String dutyPersonSup;

    @Column(name = "CONFIRM_RESULT")
    private String confirmResult;

    @Column(name = "CONFIRM_DATE")
    private Date confirmDate;

    @Column(name = "CONFIRM_PERSON")
    private String confirmPerson;

    @Column(name = "CONFIRM_SUB")
    private String confirmSub;

    @Column(name = "SEC_STATUS")
    private String secStatus;

    @Column(name = "SET_TYPE")
    private String setType;

    @Column(name = "IS_SEND_MAIL")
    private String isSendMail;

    @Column(name = "ASSIGNED_MAN")
    private String assignedMan;

    @Column(name = "SEC_CLASSIFY")
    private String secClassify;

    @Column(name = "SQUAD_SEQ")
    private BigDecimal squadSeq;

    @Column(name = "MEMO_DESCR")
    private String memoDescr;

    @Column(name = "SYS_MEMO")
    private String sysMemo;

    @Column(name = "UNION_EMP")
    private String unionEmp;

    @Column(name = "FIN_REVISE_DATE")
    private Date finReviseDate;

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
     * @return CL_HRIS_SEQ
     */
    public BigDecimal getClHrisSeq() {
        return clHrisSeq;
    }

    /**
     * @param clHrisSeq
     */
    public void setClHrisSeq(BigDecimal clHrisSeq) {
        this.clHrisSeq = clHrisSeq;
    }

    /**
     * @return CL_SEQ
     */
    public String getClSeq() {
        return clSeq;
    }

    /**
     * @param clSeq
     */
    public void setClSeq(String clSeq) {
        this.clSeq = clSeq;
    }

    /**
     * @return CL_NO
     */
    public String getClNo() {
        return clNo;
    }

    /**
     * @param clNo
     */
    public void setClNo(String clNo) {
        this.clNo = clNo;
    }

    /**
     * @return BU_TO
     */
    public String getBuTo() {
        return buTo;
    }

    /**
     * @param buTo
     */
    public void setBuTo(String buTo) {
        this.buTo = buTo;
    }

    /**
     * @return CHECK_DATE
     */
    public Date getCheckDate() {
        return checkDate;
    }

    /**
     * @param checkDate
     */
    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    /**
     * @return SCOPE_DEPT_NO
     */
    public String getScopeDeptNo() {
        return scopeDeptNo;
    }

    /**
     * @param scopeDeptNo
     */
    public void setScopeDeptNo(String scopeDeptNo) {
        this.scopeDeptNo = scopeDeptNo;
    }

    /**
     * @return SHORT_TYPE
     */
    public String getShortType() {
        return shortType;
    }

    /**
     * @param shortType
     */
    public void setShortType(String shortType) {
        this.shortType = shortType;
    }

    /**
     * @return SERIOUS_TYPE
     */
    public String getSeriousType() {
        return seriousType;
    }

    /**
     * @param seriousType
     */
    public void setSeriousType(String seriousType) {
        this.seriousType = seriousType;
    }

    /**
     * @return DUTY_DEPT_NO
     */
    public String getDutyDeptNo() {
        return dutyDeptNo;
    }

    /**
     * @param dutyDeptNo
     */
    public void setDutyDeptNo(String dutyDeptNo) {
        this.dutyDeptNo = dutyDeptNo;
    }

    /**
     * @return DUTY_DEPT_SUP
     */
    public String getDutyDeptSup() {
        return dutyDeptSup;
    }

    /**
     * @param dutyDeptSup
     */
    public void setDutyDeptSup(String dutyDeptSup) {
        this.dutyDeptSup = dutyDeptSup;
    }

    /**
     * @return DUTY_DEPT_PERSON
     */
    public String getDutyDeptPerson() {
        return dutyDeptPerson;
    }

    /**
     * @param dutyDeptPerson
     */
    public void setDutyDeptPerson(String dutyDeptPerson) {
        this.dutyDeptPerson = dutyDeptPerson;
    }

    /**
     * @return REVISE_DATE
     */
    public Date getReviseDate() {
        return reviseDate;
    }

    /**
     * @param reviseDate
     */
    public void setReviseDate(Date reviseDate) {
        this.reviseDate = reviseDate;
    }

    /**
     * @return SHORT_DESCR
     */
    public String getShortDescr() {
        return shortDescr;
    }

    /**
     * @param shortDescr
     */
    public void setShortDescr(String shortDescr) {
        this.shortDescr = shortDescr;
    }

    /**
     * @return MEMO
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param memo
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * @return CREATE_DATE
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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
     * @return UPDATE_DATE
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * @return IMPROVE_DESCR
     */
    public String getImproveDescr() {
        return improveDescr;
    }

    /**
     * @param improveDescr
     */
    public void setImproveDescr(String improveDescr) {
        this.improveDescr = improveDescr;
    }

    /**
     * @return FINISHED_DATE
     */
    public Date getFinishedDate() {
        return finishedDate;
    }

    /**
     * @param finishedDate
     */
    public void setFinishedDate(Date finishedDate) {
        this.finishedDate = finishedDate;
    }

    /**
     * @return DUTY_PERSON
     */
    public String getDutyPerson() {
        return dutyPerson;
    }

    /**
     * @param dutyPerson
     */
    public void setDutyPerson(String dutyPerson) {
        this.dutyPerson = dutyPerson;
    }

    /**
     * @return DUTY_PERSON_SUP
     */
    public String getDutyPersonSup() {
        return dutyPersonSup;
    }

    /**
     * @param dutyPersonSup
     */
    public void setDutyPersonSup(String dutyPersonSup) {
        this.dutyPersonSup = dutyPersonSup;
    }

    /**
     * @return CONFIRM_RESULT
     */
    public String getConfirmResult() {
        return confirmResult;
    }

    /**
     * @param confirmResult
     */
    public void setConfirmResult(String confirmResult) {
        this.confirmResult = confirmResult;
    }

    /**
     * @return CONFIRM_DATE
     */
    public Date getConfirmDate() {
        return confirmDate;
    }

    /**
     * @param confirmDate
     */
    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    /**
     * @return CONFIRM_PERSON
     */
    public String getConfirmPerson() {
        return confirmPerson;
    }

    /**
     * @param confirmPerson
     */
    public void setConfirmPerson(String confirmPerson) {
        this.confirmPerson = confirmPerson;
    }

    /**
     * @return CONFIRM_SUB
     */
    public String getConfirmSub() {
        return confirmSub;
    }

    /**
     * @param confirmSub
     */
    public void setConfirmSub(String confirmSub) {
        this.confirmSub = confirmSub;
    }

    /**
     * @return SEC_STATUS
     */
    public String getSecStatus() {
        return secStatus;
    }

    /**
     * @param secStatus
     */
    public void setSecStatus(String secStatus) {
        this.secStatus = secStatus;
    }

    /**
     * @return SET_TYPE
     */
    public String getSetType() {
        return setType;
    }

    /**
     * @param setType
     */
    public void setSetType(String setType) {
        this.setType = setType;
    }

    /**
     * @return IS_SEND_MAIL
     */
    public String getIsSendMail() {
        return isSendMail;
    }

    /**
     * @param isSendMail
     */
    public void setIsSendMail(String isSendMail) {
        this.isSendMail = isSendMail;
    }

    /**
     * @return ASSIGNED_MAN
     */
    public String getAssignedMan() {
        return assignedMan;
    }

    /**
     * @param assignedMan
     */
    public void setAssignedMan(String assignedMan) {
        this.assignedMan = assignedMan;
    }

    /**
     * @return SEC_CLASSIFY
     */
    public String getSecClassify() {
        return secClassify;
    }

    /**
     * @param secClassify
     */
    public void setSecClassify(String secClassify) {
        this.secClassify = secClassify;
    }

    /**
     * @return SQUAD_SEQ
     */
    public BigDecimal getSquadSeq() {
        return squadSeq;
    }

    /**
     * @param squadSeq
     */
    public void setSquadSeq(BigDecimal squadSeq) {
        this.squadSeq = squadSeq;
    }

    /**
     * @return MEMO_DESCR
     */
    public String getMemoDescr() {
        return memoDescr;
    }

    /**
     * @param memoDescr
     */
    public void setMemoDescr(String memoDescr) {
        this.memoDescr = memoDescr;
    }

    /**
     * @return SYS_MEMO
     */
    public String getSysMemo() {
        return sysMemo;
    }

    /**
     * @param sysMemo
     */
    public void setSysMemo(String sysMemo) {
        this.sysMemo = sysMemo;
    }

    /**
     * @return UNION_EMP
     */
    public String getUnionEmp() {
        return unionEmp;
    }

    /**
     * @param unionEmp
     */
    public void setUnionEmp(String unionEmp) {
        this.unionEmp = unionEmp;
    }

    /**
     * @return FIN_REVISE_DATE
     */
    public Date getFinReviseDate() {
        return finReviseDate;
    }

    /**
     * @param finReviseDate
     */
    public void setFinReviseDate(Date finReviseDate) {
        this.finReviseDate = finReviseDate;
    }
}
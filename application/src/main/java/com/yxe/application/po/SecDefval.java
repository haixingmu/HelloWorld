package com.yxe.application.po;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "T_HSE_SEC_DEF_VAL")
public class SecDefval {
    @Id
    @Column(name = "ID")
    private BigDecimal id;

    @Column(name = "DEF_NO")
    private String defNo;

    @Column(name = "DEF_VALUE")
    private String defValue;

    @Column(name = "OPRID")
    private String oprid;

    @Column(name = "PAGE_ID")
    private String pageId;

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
     * @return DEF_NO
     */
    public String getDefNo() {
        return defNo;
    }

    /**
     * @param defNo
     */
    public void setDefNo(String defNo) {
        this.defNo = defNo;
    }

    /**
     * @return DEF_VALUE
     */
    public String getDefValue() {
        return defValue;
    }

    /**
     * @param defValue
     */
    public void setDefValue(String defValue) {
        this.defValue = defValue;
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
     * @return PAGE_ID
     */
    public String getPageId() {
        return pageId;
    }

    /**
     * @param pageId
     */
    public void setPageId(String pageId) {
        this.pageId = pageId;
    }
}
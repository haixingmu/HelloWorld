package com.yxe.application.po;

import javax.persistence.*;

@Table(name = "T_BASE_AREA")
public class BaseArea {
    @Column(name = "AREANO")
    private String areano;

    @Column(name = "AREAMC")
    private String areamc;

    /**
     * @return AREANO
     */
    public String getAreano() {
        return areano;
    }

    /**
     * @param areano
     */
    public void setAreano(String areano) {
        this.areano = areano;
    }

    /**
     * @return AREAMC
     */
    public String getAreamc() {
        return areamc;
    }

    /**
     * @param areamc
     */
    public void setAreamc(String areamc) {
        this.areamc = areamc;
    }
}
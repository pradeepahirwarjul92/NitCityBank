/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heg.entity;

import java.io.Serializable;

/**
 *
 * @author softwaredeveloper
 */
public class InsurancePolicy implements Serializable {

    private Long policyId;
    private String policyName;
    private Integer tenure;
    private String company;
    private String type;

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public Integer getTenure() {
        return tenure;
    }

    public void setTenure(Integer tenure) {
        this.tenure = tenure;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "InsurancePolicy{" + "policyId=" + policyId + ", policyName=" + policyName + ", tenure=" + tenure + ", company=" + company + ", type=" + type + '}';
    }

}

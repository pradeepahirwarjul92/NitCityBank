/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heg.entity;

/**
 *
 * @author softwaredeveloper
 */
public class Project {

    private Long projId;
    private String projName;
    private Integer teamSize;

    public Long getProjId() {
        return projId;
    }

    public void setProjId(Long projId) {
        this.projId = projId;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public Integer getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(Integer teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "Project{" + "projId=" + projId + ", projName=" + projName + ", teamSize=" + teamSize + '}';
    }
    
    
    
    
}

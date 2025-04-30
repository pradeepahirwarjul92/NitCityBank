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
public class Membership {

	private Long mid;
	private String name;
	private String addrs;
	private Integer rewardPoints;

	public Long getMid() {
		return mid;
	}

	public void setMid(Long mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	public Integer getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(Integer rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	@Override
	public String toString() {
		return "Membership{" + "mid=" + mid + ", name=" + name + ", addrs=" + addrs + ", rewardPoints=" + rewardPoints
				+ '}';
	}

}

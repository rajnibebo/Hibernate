/**
 * 
 */
package com.rajni.ems.entities;

/**
 * @author rajni.ubhi
 *
 */
public class CommercialAddress extends Address {
	private Phone managerPhone;
	private Phone teamLeaderPhone;
	private Phone colleaguePhone;
	
	public Phone getManagerPhone() {
		return managerPhone;
	}
	public void setManagerPhone(Phone managerPhone) {
		this.managerPhone = managerPhone;
	}
	public Phone getTeamLeaderPhone() {
		return teamLeaderPhone;
	}
	public void setTeamLeaderPhone(Phone teamLeaderPhone) {
		this.teamLeaderPhone = teamLeaderPhone;
	}
	public Phone getColleaguePhone() {
		return colleaguePhone;
	}
	public void setColleaguePhone(Phone colleaguePhone) {
		this.colleaguePhone = colleaguePhone;
	}
	
}

package com.ananda.AnandaJava.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserRoles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //IDENTITY
    private int id;
	private int userId; 
    private int roleId; 
    private int createdBy; 
    private int updatedBy; 
    private LocalDateTime creationDatetime;
	private LocalDateTime updationDatetime; 
    private int isActive = 1; 
    private int isDeleted = 0;
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public int getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}
	public LocalDateTime getCreationDatetime() {
		return creationDatetime;
	}
	public void setCreationDatetime(LocalDateTime creationDatetime) {
		this.creationDatetime = creationDatetime;
	}
	public LocalDateTime getUpdationDatetime() {
		return updationDatetime;
	}
	public void setUpdationDatetime(LocalDateTime updationDatetime) {
		this.updationDatetime = updationDatetime;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDctive(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	public UserRoles(int id, int userId, int roleId, int createdBy, int updatedBy, LocalDateTime creationDatetime,
			LocalDateTime updationDatetime, int isActive, int isDeleted) {
		super();
		this.id = id;
		this.userId = userId;
		this.roleId = roleId;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.creationDatetime = creationDatetime;
		this.updationDatetime = updationDatetime;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
	}
	
	public UserRoles() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "UserRoles [id=" + id + ", userId=" + userId + ", roleId=" + roleId + ", createdBy=" + createdBy
				+ ", updatedBy=" + updatedBy + ", creationDatetime=" + creationDatetime + ", updationDatetime="
				+ updationDatetime + ", isActive=" + isActive + ", isDctive=" + isDeleted + "]";
	}
}

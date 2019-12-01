package com.yxe.application.po;

import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

public class Agent {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 用户名，为手机号码
     */
    private String username;

    /**
     * 密码
     */
    private String password;
    
    /**
     * 一个用户关联多个角色
     */
    @Transient
    private List<Role> roleList;
    
    /**
     * 前台传递的参数，用以查询
     */
    @Transient
    private String roleName;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名，为手机号码
     *
     * @return username - 用户名，为手机号码
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名，为手机号码
     *
     * @param username 用户名，为手机号码
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }


	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "Agent [id=" + id + ", createTime=" + createTime + ", updateTime=" + updateTime + ", username="
				+ username + ", password=" + password + ", roleName=" + roleName + "]";
	}
    
    
    
}
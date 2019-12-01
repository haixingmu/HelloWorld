package com.yxe.application.po;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

public class Role {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色说明
     */
    private String description;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;
    
    /**
     * 一个角色关联多个用户
     */
    @Transient
    private List<Agent> agentList;
    
    /**
     * 一个角色关联多个权限
     */
    @Transient
    private List<Grant> grantList;
    
    
    /**
     * 用户的名称,用作页面端模糊查询的条件
     */
    @Transient
    private String agentName;
    
    /**
     * 权限的父id,用作页面查询的条件
     */
    @Transient
    private Integer parentId;
    
   
    
    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取角色名称
     *
     * @return name - 角色名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置角色名称
     *
     * @param name 角色名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取角色说明
     *
     * @return description - 角色说明
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置角色说明
     *
     * @param description 角色说明
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

	public List<Agent> getAgentList() {
		return agentList;
	}

	public void setAgentList(List<Agent> agentList) {
		this.agentList = agentList;
	}

	public List<Grant> getGrantList() {
		return grantList;
	}

	public void setGrantList(List<Grant> grantList) {
		this.grantList = grantList;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}


    
    
}
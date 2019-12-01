package com.yxe.application.po;

import java.util.Date;

import javax.persistence.*;

@Table(name = "agent_user")
public class AgentUser {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 代理id
     */
    @Column(name = "agent_id")
    private Integer agentId;

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
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取代理id
     *
     * @return agent_id - 代理id
     */
    public Integer getAgentId() {
        return agentId;
    }

    /**
     * 设置代理id
     *
     * @param agentId 代理id
     */
    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
    
}
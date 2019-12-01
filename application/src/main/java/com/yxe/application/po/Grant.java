package com.yxe.application.po;

import java.util.List;

import javax.persistence.*;
@Table(name = "`grant`")
public class Grant {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 权限说明
     */
    private String description;

    /**
     * 权限url路径
     */
    private String url;

    /**
     * 权限父id，第一层级权限父id默认为null
     */
    @Column(name = "parent_id")
    private Integer parentId;
    /**
     * 是否是按钮
     */
    private Integer isButton;
    
    /**
     * 当前权限在同级的排序顺序
     */
    private Integer sort;
    
    /**
     * easyui 树形结构属性，方便页面渲染
     */
    @Transient
    private String text;
    
    /**
     * easyui 树形结构属性，方便页面渲染
     */
    @Transient
    private boolean checked;
    
    @Transient
    private Integer countOfChildren;
    
    
    /**
     * easyui 树形结构属性，方便页面渲染
     */
    @Transient
    private String state;
    
    /**
     * easyui 树形结构属性，方便页面渲染
     */
    @Transient
    private List<Grant> children;
    
    /**
     * 前台传递的参数，用以查询
     */
    @Transient
    private Integer roleId;
    
    /**
     * 角色权限关联表主键id
     */
    @Transient
    private Integer roleGrantId;
    
    /**
     * 前台传递的参数，用以更新权限
     */
    @Transient
    private String jsonParam;
    
    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取权限名称
     *
     * @return name - 权限名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置权限名称
     *
     * @param name 权限名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取权限说明
     *
     * @return description - 权限说明
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置权限说明
     *
     * @param description 权限说明
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取权限url路径
     *
     * @return url - 权限url路径
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置权限url路径
     *
     * @param url 权限url路径
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取权限父id，第一层级权限父id默认为null
     *
     * @return parent_id - 权限父id，第一层级权限父id默认为null
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置权限父id，第一层级权限父id默认为null
     *
     * @param parentId 权限父id，第一层级权限父id默认为null
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }


	public List<Grant> getChildren() {
		return children;
	}

	public void setChildren(List<Grant> children) {
		this.children = children;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getJsonParam() {
		return jsonParam;
	}

	public void setJsonParam(String jsonParam) {
		this.jsonParam = jsonParam;
	}

	public Integer getIsButton() {
		return isButton;
	}

	public void setIsButton(Integer isButton) {
		this.isButton = isButton;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getCountOfChildren() {
		return countOfChildren;
	}

	public void setCountOfChildren(Integer countOfChildren) {
		this.countOfChildren = countOfChildren;
	}

	public Integer getRoleGrantId() {
		return roleGrantId;
	}

	public void setRoleGrantId(Integer roleGrantId) {
		this.roleGrantId = roleGrantId;
	}

    
    
}
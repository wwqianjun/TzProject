package com.qianjun.service.entity;

import java.io.Serializable;

/**
 * @author muyuansun
 * @date 2014-2-8 下午5:26:02
 */
public class DataRight implements Serializable  {
	private static final long serialVersionUID = 1487072613981346339L;
	private String permCode = null;
	/**
	 * 个人P（只能看到自己） 记录个人userId
	 * 部门D（能够看到本部门下以及子部门的所有） 记录deptId
	 * 公司C（直接能够看到公司下所有） 记录companyId
	 */
	private String dataRightTypeCode = null;
	
	private Integer level = null;
	
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public String getPermCode() {
		return permCode;
	}
	public void setPermCode(String permCode) {
		this.permCode = permCode;
	}
	public String getDataRightTypeCode() {
		return dataRightTypeCode;
	}
	public void setDataRightTypeCode(String dataRightTypeCode) {
		this.dataRightTypeCode = dataRightTypeCode;
	}
	
}

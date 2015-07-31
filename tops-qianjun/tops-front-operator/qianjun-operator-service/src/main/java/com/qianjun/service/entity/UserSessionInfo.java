//package com.qianjun.service.entity;
//
//import java.util.Collection;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//
//import com.travelzen.b2g.common.exception.CommonException;
//import com.travelzen.b2g.redis.entity.SimpleUser;
//
///**
// * 扩展用户登陆信息
// * @author zhengzhichao
// *
// */
//public class UserSessionInfo extends User {
//	
//	private static final long serialVersionUID = -4306367508017564333L;
//	/**
//	 * 用户ID
//	 */
//	private String userId;
//	/**
//	 * 真实姓名
//	 */
//	private String realName;
//	
//	/**
//	 * 国家
//	 */
//	private String country;
//	/**
//	 * 是否为后台服务支持用户
//	 */
//	private Boolean isSupportStaff;
//	/**
//	 * 部门ID
//	 */
//	private String deptId;
//	/**
//	 * 当前用户所属公司，如果是真旅网用户，值为-1
//	 */
//	private String companyId;
//	/**
//	 * 公司KEY
//	 */
//	private String companyKey;
//	/**
//	 * 公司的页面权限
//	 */
//	private Map<String, String> authCodes;
//	/**
//	 * 当前用户对应的功能的数据权限
//	 * key 是 perm_code , value 是 {@link DataRight}
//	 */
//	private Map<String, DataRight> dataRightsInfo;
//	/**
//	 * 当前用户能查看的公司
//	 */
//	private List<String> companiesId;
//	/**
//	 * 差旅人
//	 */
//	private List<SimpleUser> travellerList;
//	
//	/**
//	 * 当前激活的公司id
//	 */
//	private String currentCompanyId;
//	
//	/**
//	 * 预留参数，如果有特殊的内容需要传参可用此map
//	 * 目前使用的
//	 * pnrData MakeFareByPNR 后台建单时保存订单的内容，方便传递
//	 */
//	private Map<String, Object> otherParams;
//	
//	/**
//	 * 调用父类构造方法
//	 * @param loginName 登陆名（因为登陆可能以多种方式登陆，所以不叫用户名啦）
//	 * @param password 密码
//	 * @param enabled 是否可用
//	 * @param accountNonExpired 账户是否过期
//	 * @param credentialsNonExpired 证书是否过期
//	 * @param accountNonLocked 账户是否锁定
//	 * @param authorities 授权信息
//	 */
//	public UserSessionInfo(String loginName, String password, boolean enabled,
//			boolean accountNonExpired, boolean credentialsNonExpired,
//			boolean accountNonLocked,
//			Collection<? extends GrantedAuthority> authorities) {
//		super(loginName, password, enabled, accountNonExpired, credentialsNonExpired,
//				accountNonLocked, authorities);
//	}
//
//	public String getUserId() {
//		return userId;
//	}
//
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}
//
//	public String getRealName() {
//		return realName;
//	}
//
//	public void setRealName(String realName) {
//		this.realName = realName;
//	}
//
//	public String getDeptId() {
//		return deptId;
//	}
//
//	public void setDeptId(String deptId) {
//		this.deptId = deptId;
//	}
//
//	public String getCompanyId() {
//		return companyId;
//	}
//
//	public void setCompanyId(String companyId) {
//		this.companyId = companyId;
//	}
//
//	public Map<String, String> getAuthCodes() {
//		return authCodes;
//	}
//
//	public void setAuthCodes(Map<String, String> authCodes) {
//		this.authCodes = authCodes;
//	}
//
//	public Boolean getIsSupportStaff() {
//		return isSupportStaff;
//	}
//
//	public void setIsSupportStaff(Boolean isSupportStaff) {
//		this.isSupportStaff = isSupportStaff;
//	}
//	public List<SimpleUser> getTravellerList() {
//		return travellerList;
//	}
//
//	public void setTravellerList(List<SimpleUser> travellerList) {
//		this.travellerList = travellerList;
//	}
//	
//	public Map<String, DataRight> getDataRightsInfo() {
//		return dataRightsInfo;
//	}
//
//	public void setDataRightsInfo(Map<String, DataRight> dataRightsInfo) {
//		this.dataRightsInfo = dataRightsInfo;
//	}
//
//	public List<String> getCompaniesId() {
//		return companiesId;
//	}
//
//	public void setCompaniesId(List<String> companiesId) {
//		this.companiesId = companiesId;
//	}
//
//	public String getCompanyKey() {
//		return companyKey;
//	}
//
//	public void setCompanyKey(String companyKey) {
//		this.companyKey = companyKey;
//	}
//
//	public String getCurrentCompanyId() {
//		return currentCompanyId;
//	}
//
//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}
//
//	/**
//	 * 此处需要做特殊判断，如果当前用户没有此公司的权限，则不能够设置当前公司
//	 * @param currentCompanyId
//	 */
//	public void setCurrentCompanyId(String currentCompanyId) throws CommonException {
//		if("-1".equals(currentCompanyId) && "-1".equals(companyId)) {
//			this.currentCompanyId = currentCompanyId;
//		} else {
//    		if(this.companiesId.contains(currentCompanyId)){
//    			this.currentCompanyId = currentCompanyId;
//    		}else{
//    			throw CommonException.instance("您没有当前公司权限！");
//    		}
//		}
//	}
//
//	public Map<String, Object> getOtherParams() {
//		return otherParams;
//	}
//
//	public void setOtherParams(Map<String, Object> otherParams) {
//		this.otherParams = otherParams;
//	}
//
//}

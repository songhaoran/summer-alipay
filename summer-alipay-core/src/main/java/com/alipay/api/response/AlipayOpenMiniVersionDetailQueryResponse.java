package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniAppCategoryInfo;
import com.alipay.api.domain.MiniPackageInfo;
import com.alipay.api.domain.RegionInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.version.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-12-20 10:43:25
 */
public class AlipayOpenMiniVersionDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1798273451193494478L;

	/** 
	 * 小程序应用描述
	 */
	@ApiField("app_desc")
	private String appDesc;

	/** 
	 * 小程序应用英文名称
	 */
	@ApiField("app_english_name")
	private String appEnglishName;

	/** 
	 * 小程序应用logo图标
	 */
	@ApiField("app_logo")
	private String appLogo;

	/** 
	 * 小程序应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/** 
	 * 小程序应用简介，一句话描述小程序功能
	 */
	@ApiField("app_slogan")
	private String appSlogan;

	/** 
	 * 小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/** 
	 * 小程序版本提交审核的时间
	 */
	@ApiField("gmt_apply_audit")
	private String gmtApplyAudit;

	/** 
	 * 小程序版本审核结束时间
	 */
	@ApiField("gmt_audit_end")
	private String gmtAuditEnd;

	/** 
	 * 小程序版本创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 小程序版本下架时间
	 */
	@ApiField("gmt_offline")
	private String gmtOffline;

	/** 
	 * 小程序版本上架时间
	 */
	@ApiField("gmt_online")
	private String gmtOnline;

	/** 
	 * 小程序灰度比例值，p10-10%的用户，p30-30%的用户，p50-50%的用户
	 */
	@ApiField("gray_strategy")
	private String grayStrategy;

	/** 
	 * 小程序备注
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 小程序类目列表
	 */
	@ApiListField("mini_app_category_info_list")
	@ApiField("mini_app_category_info")
	private List<MiniAppCategoryInfo> miniAppCategoryInfoList;

	/** 
	 * 小程序功能包列表
	 */
	@ApiListField("package_info_list")
	@ApiField("mini_package_info")
	private List<MiniPackageInfo> packageInfoList;

	/** 
	 * 审核驳回原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/** 
	 * 安全扫描结果，HAS_RISK-安全扫描不通过，APPROVED-安全扫描通过，SCANNING-正在扫描
	 */
	@ApiField("scan_result")
	private String scanResult;

	/** 
	 * 小程序版本截图，多个截图以逗号隔开
	 */
	@ApiListField("screen_shot_list")
	@ApiField("string")
	private List<String> screenShotList;

	/** 
	 * 客服邮箱
	 */
	@ApiField("service_email")
	private String serviceEmail;

	/** 
	 * 客服电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/** 
	 * 小程序服务区域信息，当服务区域类型是LOCATION时，这里明确指出具体的服务区域信息
	 */
	@ApiListField("service_region_info")
	@ApiField("region_info")
	private List<RegionInfo> serviceRegionInfo;

	/** 
	 * 小程序服务区域类型，GLOBLE-全球，CHINA-中国，LOCATION-指定区域
	 */
	@ApiField("service_region_type")
	private String serviceRegionType;

	/** 
	 * 小程序版本状态，INIT-开发中，AUDITING-审核中，WAIT_RELEASE-审核通过，AUDIT_REJECT-审核驳回，RELEASE-已上架，GRAY-灰度中，OFFLINE-下架，ONLINE-上架
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 小程序版本描述
	 */
	@ApiField("version_desc")
	private String versionDesc;

	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}
	public String getAppDesc( ) {
		return this.appDesc;
	}

	public void setAppEnglishName(String appEnglishName) {
		this.appEnglishName = appEnglishName;
	}
	public String getAppEnglishName( ) {
		return this.appEnglishName;
	}

	public void setAppLogo(String appLogo) {
		this.appLogo = appLogo;
	}
	public String getAppLogo( ) {
		return this.appLogo;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppName( ) {
		return this.appName;
	}

	public void setAppSlogan(String appSlogan) {
		this.appSlogan = appSlogan;
	}
	public String getAppSlogan( ) {
		return this.appSlogan;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	public String getAppVersion( ) {
		return this.appVersion;
	}

	public void setGmtApplyAudit(String gmtApplyAudit) {
		this.gmtApplyAudit = gmtApplyAudit;
	}
	public String getGmtApplyAudit( ) {
		return this.gmtApplyAudit;
	}

	public void setGmtAuditEnd(String gmtAuditEnd) {
		this.gmtAuditEnd = gmtAuditEnd;
	}
	public String getGmtAuditEnd( ) {
		return this.gmtAuditEnd;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtOffline(String gmtOffline) {
		this.gmtOffline = gmtOffline;
	}
	public String getGmtOffline( ) {
		return this.gmtOffline;
	}

	public void setGmtOnline(String gmtOnline) {
		this.gmtOnline = gmtOnline;
	}
	public String getGmtOnline( ) {
		return this.gmtOnline;
	}

	public void setGrayStrategy(String grayStrategy) {
		this.grayStrategy = grayStrategy;
	}
	public String getGrayStrategy( ) {
		return this.grayStrategy;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setMiniAppCategoryInfoList(List<MiniAppCategoryInfo> miniAppCategoryInfoList) {
		this.miniAppCategoryInfoList = miniAppCategoryInfoList;
	}
	public List<MiniAppCategoryInfo> getMiniAppCategoryInfoList( ) {
		return this.miniAppCategoryInfoList;
	}

	public void setPackageInfoList(List<MiniPackageInfo> packageInfoList) {
		this.packageInfoList = packageInfoList;
	}
	public List<MiniPackageInfo> getPackageInfoList( ) {
		return this.packageInfoList;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getRejectReason( ) {
		return this.rejectReason;
	}

	public void setScanResult(String scanResult) {
		this.scanResult = scanResult;
	}
	public String getScanResult( ) {
		return this.scanResult;
	}

	public void setScreenShotList(List<String> screenShotList) {
		this.screenShotList = screenShotList;
	}
	public List<String> getScreenShotList( ) {
		return this.screenShotList;
	}

	public void setServiceEmail(String serviceEmail) {
		this.serviceEmail = serviceEmail;
	}
	public String getServiceEmail( ) {
		return this.serviceEmail;
	}

	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}
	public String getServicePhone( ) {
		return this.servicePhone;
	}

	public void setServiceRegionInfo(List<RegionInfo> serviceRegionInfo) {
		this.serviceRegionInfo = serviceRegionInfo;
	}
	public List<RegionInfo> getServiceRegionInfo( ) {
		return this.serviceRegionInfo;
	}

	public void setServiceRegionType(String serviceRegionType) {
		this.serviceRegionType = serviceRegionType;
	}
	public String getServiceRegionType( ) {
		return this.serviceRegionType;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setVersionDesc(String versionDesc) {
		this.versionDesc = versionDesc;
	}
	public String getVersionDesc( ) {
		return this.versionDesc;
	}

}

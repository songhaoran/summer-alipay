package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序体验版轮询接口
 *
 * @author auto create
 * @since 1.0, 2017-12-20 11:02:36
 */
public class AlipayOpenMiniExperienceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4467617562283335143L;

	/**
	 * 小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

}

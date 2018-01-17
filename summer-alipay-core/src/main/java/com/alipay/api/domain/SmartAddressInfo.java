package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自助售卖机地址信息
 *
 * @author auto create
 * @since 1.0, 2017-11-02 20:49:12
 */
public class SmartAddressInfo extends AlipayObject {

	private static final long serialVersionUID = 5761545924265397523L;

	/**
	 * 行政区代码-区，使用国家行政区划代码，可参考http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/
	 */
	@ApiField("area_code")
	private Long areaCode;

	/**
	 * 行政区代码-市，使用国家行政区划代码，可参考http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/
	 */
	@ApiField("city_code")
	private Long cityCode;

	/**
	 * 自助售货机地址
	 */
	@ApiField("machine_address")
	private String machineAddress;

	/**
	 * 行政区代码-省，使用国家行政区划代码，可参考http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/
	 */
	@ApiField("province_code")
	private Long provinceCode;

	public Long getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(Long areaCode) {
		this.areaCode = areaCode;
	}

	public Long getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(Long cityCode) {
		this.cityCode = cityCode;
	}

	public String getMachineAddress() {
		return this.machineAddress;
	}
	public void setMachineAddress(String machineAddress) {
		this.machineAddress = machineAddress;
	}

	public Long getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(Long provinceCode) {
		this.provinceCode = provinceCode;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取用户车辆信息
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:27:59
 */
public class AlipayEcoMycarDialogonlineVehicleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6342165428887511442L;

	/**
	 * 车辆ID
	 */
	@ApiField("vi_id")
	private String viId;

	public String getViId() {
		return this.viId;
	}
	public void setViId(String viId) {
		this.viId = viId;
	}

}

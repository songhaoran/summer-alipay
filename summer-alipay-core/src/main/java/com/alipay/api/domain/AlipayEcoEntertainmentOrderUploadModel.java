package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数娱充值平台ISV订单回流接口
 *
 * @author auto create
 * @since 1.0, 2017-11-02 10:19:49
 */
public class AlipayEcoEntertainmentOrderUploadModel extends AlipayObject {

	private static final long serialVersionUID = 4634376524352583136L;

	/**
	 * 数娱充值ISV订单回流模型
	 */
	@ApiField("entertainment_order_info")
	private EntertainmentOrderInfo entertainmentOrderInfo;

	public EntertainmentOrderInfo getEntertainmentOrderInfo() {
		return this.entertainmentOrderInfo;
	}
	public void setEntertainmentOrderInfo(EntertainmentOrderInfo entertainmentOrderInfo) {
		this.entertainmentOrderInfo = entertainmentOrderInfo;
	}

}

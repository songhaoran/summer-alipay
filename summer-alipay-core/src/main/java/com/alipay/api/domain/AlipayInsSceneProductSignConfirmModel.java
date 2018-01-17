package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险代扣协议签约
 *
 * @author auto create
 * @since 1.0, 2017-10-25 19:38:10
 */
public class AlipayInsSceneProductSignConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 5452143339971156449L;

	/**
	 * 产品编码
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 支付宝会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

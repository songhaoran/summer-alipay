package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 下单请求接口
 *
 * @author auto create
 * @since 1.0, 2017-12-13 11:31:33
 */
public class AlipayInsAutoAutoinsprodPolicyApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5451783298275515211L;

	/**
	 * 邮寄信息
	 */
	@ApiField("deliver_info")
	private DeliverInfo deliverInfo;

	/**
	 * 询价申请ID
	 */
	@ApiField("enquiry_biz_id")
	private String enquiryBizId;

	/**
	 * 指定保险公司支付宝收款账户,一般为保险公司收款账号登录ID
	 */
	@ApiField("income_account_no")
	private String incomeAccountNo;

	/**
	 * 报价ID
	 */
	@ApiField("quote_biz_id")
	private String quoteBizId;

	/**
	 * 付费方式,1-代理人付款，2-投保人付款
	 */
	@ApiField("who_payed")
	private String whoPayed;

	public DeliverInfo getDeliverInfo() {
		return this.deliverInfo;
	}
	public void setDeliverInfo(DeliverInfo deliverInfo) {
		this.deliverInfo = deliverInfo;
	}

	public String getEnquiryBizId() {
		return this.enquiryBizId;
	}
	public void setEnquiryBizId(String enquiryBizId) {
		this.enquiryBizId = enquiryBizId;
	}

	public String getIncomeAccountNo() {
		return this.incomeAccountNo;
	}
	public void setIncomeAccountNo(String incomeAccountNo) {
		this.incomeAccountNo = incomeAccountNo;
	}

	public String getQuoteBizId() {
		return this.quoteBizId;
	}
	public void setQuoteBizId(String quoteBizId) {
		this.quoteBizId = quoteBizId;
	}

	public String getWhoPayed() {
		return this.whoPayed;
	}
	public void setWhoPayed(String whoPayed) {
		this.whoPayed = whoPayed;
	}

}

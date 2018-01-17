package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.detail.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-10-31 19:25:47
 */
public class KoubeiMarketingCampaignDetailInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2646382474442955173L;

	/** 
	 * 适用门店:门店与门店之间用“,”隔开
	 */
	@ApiField("limit_shops")
	private String limitShops;

	public void setLimitShops(String limitShops) {
		this.limitShops = limitShops;
	}
	public String getLimitShops( ) {
		return this.limitShops;
	}

}

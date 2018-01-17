package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 系统商删除作品接口
 *
 * @author auto create
 * @since 1.0, 2017-10-20 11:04:58
 */
public class KoubeiServindustryPortfolioOpusDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5713455346772454216L;

	/**
	 * 作品ID列表
	 */
	@ApiListField("opus_ids")
	@ApiField("string")
	private List<String> opusIds;

	/**
	 * 操作人信息
	 */
	@ApiField("portfolio_operator_info")
	private PortfolioOperatorInfo portfolioOperatorInfo;

	public List<String> getOpusIds() {
		return this.opusIds;
	}
	public void setOpusIds(List<String> opusIds) {
		this.opusIds = opusIds;
	}

	public PortfolioOperatorInfo getPortfolioOperatorInfo() {
		return this.portfolioOperatorInfo;
	}
	public void setPortfolioOperatorInfo(PortfolioOperatorInfo portfolioOperatorInfo) {
		this.portfolioOperatorInfo = portfolioOperatorInfo;
	}

}

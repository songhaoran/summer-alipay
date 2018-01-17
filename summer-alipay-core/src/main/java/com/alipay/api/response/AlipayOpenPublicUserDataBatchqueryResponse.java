package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserAnalysisData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.user.data.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2017-12-20 16:29:32
 */
public class AlipayOpenPublicUserDataBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4844985438212421323L;

	/** 
	 * 用户分析数据
	 */
	@ApiListField("data_list")
	@ApiField("user_analysis_data")
	private List<UserAnalysisData> dataList;

	public void setDataList(List<UserAnalysisData> dataList) {
		this.dataList = dataList;
	}
	public List<UserAnalysisData> getDataList( ) {
		return this.dataList;
	}

}

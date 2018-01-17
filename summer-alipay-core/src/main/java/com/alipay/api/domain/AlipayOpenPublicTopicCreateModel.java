package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销位添加接口
 *
 * @author auto create
 * @since 1.0, 2017-12-06 11:24:12
 */
public class AlipayOpenPublicTopicCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7451453565245544585L;

	/**
	 * 营销位图片url, 尺寸为996*450，最大不超过5M，支持格式:.jpg、.png ，请先调用<a href="https://docs.open.alipay.com/api_3/alipay.offline.material.image.upload"> 图片上传接口</a>获得图片url。营销位需要展示头图时，必须填写该参数。
	 */
	@ApiField("img_url")
	private String imgUrl;

	/**
	 * 营销位跳转地址，点击营销位头图跳到的链接url。营销位需要展示头图时，必须填写该参数。
	 */
	@ApiField("link_url")
	private String linkUrl;

	/**
	 * 营销位描述。营销位需要展示头图时，必须填写该参数。
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 营销位名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 营销位内容，数量限制：大于4个，小于8个
	 */
	@ApiListField("topic_items")
	@ApiField("topic_item")
	private List<TopicItem> topicItems;

	public String getImgUrl() {
		return this.imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getLinkUrl() {
		return this.linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public List<TopicItem> getTopicItems() {
		return this.topicItems;
	}
	public void setTopicItems(List<TopicItem> topicItems) {
		this.topicItems = topicItems;
	}

}

package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.personalized.menu.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-10-19 16:39:13
 */
public class AlipayOpenPublicPersonalizedMenuCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2455469956991883767L;

	/** 
	 * 该套个性化菜单key
	 */
	@ApiField("menu_key")
	private String menuKey;

	public void setMenuKey(String menuKey) {
		this.menuKey = menuKey;
	}
	public String getMenuKey( ) {
		return this.menuKey;
	}

}

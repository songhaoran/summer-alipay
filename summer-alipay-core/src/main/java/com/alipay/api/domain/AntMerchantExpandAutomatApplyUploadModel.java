package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自助售货机入驻申请
 *
 * @author auto create
 * @since 1.0, 2017-11-02 20:49:12
 */
public class AntMerchantExpandAutomatApplyUploadModel extends AlipayObject {

	private static final long serialVersionUID = 6465232947758951356L;

	/**
	 * 机具发货地址信息
	 */
	@ApiField("delivery_address")
	private SmartAddressInfo deliveryAddress;

	/**
	 * 合作类型 COOPERATION_CONTRACT(新签合约机),COOPERATION_EXCLUSIVE(定制机),COOPERATION_REFORM(改造机),COOPERATION_STOCK(存量智能机),COOPERATION_OTHER(其他)
	 */
	@ApiField("machine_cooperation_type")
	private String machineCooperationType;

	/**
	 * 机具出厂时间
	 */
	@ApiField("machine_delivery_date")
	private Date machineDeliveryDate;

	/**
	 * 机具名称，一般采用厂商名称的简称作为设备名称。8个英文字符或4个中文汉字
	 */
	@ApiField("machine_name")
	private String machineName;

	/**
	 * 机具类型 AUTOMAT(自助售卖机),WASHING_MACHINE(洗衣机),
    MASSAGE_CHAIR(按摩椅),
    AIR_BLOWER(吹风机),
    CRANE_MACHINE(娃娃机),
    EV_CHARGER(充电桩),
    SIMULATION_KTV(模拟KTV),
    GAME_MACHINE(游戏机),
    OTHER(其他);
	 */
	@ApiField("machine_type")
	private String machineType;

	/**
	 * 商户的支付宝账号ID
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * 运营商类型 ALIPAY_MERCHANT(支付宝商家),DISTRIBUTOR(渠道商),ISV(ISV服务商),OPERATOR_MERCHANT(运营商)
	 */
	@ApiField("merchant_user_type")
	private String merchantUserType;

	/**
	 * 机具点位地址信息
	 */
	@ApiField("point_position")
	private SmartAddressInfo pointPosition;

	/**
	 * 厂商的支付宝账号ID
	 */
	@ApiField("product_user_id")
	private String productUserId;

	/**
	 * 机具终端ID，由开发者生成，并需保证在开发者端不重复
	 */
	@ApiField("terminal_id")
	private String terminalId;

	/**
	 * 机具交易号，商户在厂商淘宝门店购买的设备需要提供当时订单对应的支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public SmartAddressInfo getDeliveryAddress() {
		return this.deliveryAddress;
	}
	public void setDeliveryAddress(SmartAddressInfo deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getMachineCooperationType() {
		return this.machineCooperationType;
	}
	public void setMachineCooperationType(String machineCooperationType) {
		this.machineCooperationType = machineCooperationType;
	}

	public Date getMachineDeliveryDate() {
		return this.machineDeliveryDate;
	}
	public void setMachineDeliveryDate(Date machineDeliveryDate) {
		this.machineDeliveryDate = machineDeliveryDate;
	}

	public String getMachineName() {
		return this.machineName;
	}
	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

	public String getMachineType() {
		return this.machineType;
	}
	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getMerchantUserType() {
		return this.merchantUserType;
	}
	public void setMerchantUserType(String merchantUserType) {
		this.merchantUserType = merchantUserType;
	}

	public SmartAddressInfo getPointPosition() {
		return this.pointPosition;
	}
	public void setPointPosition(SmartAddressInfo pointPosition) {
		this.pointPosition = pointPosition;
	}

	public String getProductUserId() {
		return this.productUserId;
	}
	public void setProductUserId(String productUserId) {
		this.productUserId = productUserId;
	}

	public String getTerminalId() {
		return this.terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}

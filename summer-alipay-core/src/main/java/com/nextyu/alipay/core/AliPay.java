package com.nextyu.alipay.core;

import lombok.ToString;

/**
 * created on 2018-01-09 16:18
 *
 * @author nextyu
 */
@ToString
public class AliPay {

    /**
     * 支付宝分配给开发者的应用ID
     */
    String appId;

    /**
     * 商户私钥
     */
    String privateKey;

    /**
     * 支付宝公钥
     */
    String aliPayPublicKey;

    /**
     * 订单标题
     */
    String subject;

    /**
     * 订单描述
     */
    String body;

    /**
     * 商户订单号
     */
    String outTradeNo;

    /**
     * 绝对超时时间，格式为yyyy-MM-dd HH:mm
     */
    String timeExpire;

    /**
     * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
     */
    String totalAmount;

    /**
     * 销售产品码，与支付宝签约的产品码名称
     */
    String productCode;

    /**
     * 公用回传参数，如果请求时传递了该参数，则返回给商户时会回传该参数
     */
    String passbackParams;

    /**
     * 支付宝服务器主动通知商户服务器里指定的页面http/https路径
     */
    String notifyUrl;

    /**
     * 同步返回地址，HTTP/HTTPS开头字符串
     */
    String returnUrl;

    /**
     * 商户自定义二维码宽度
     */
    Long qrcodeWidth;

    AliPay(String appId, String privateKey, String aliPayPublicKey) {
        this.appId = appId;
        this.privateKey = privateKey;
        this.aliPayPublicKey = aliPayPublicKey;
    }


    public Pay pay() {
        return new Pay(this);
    }

}

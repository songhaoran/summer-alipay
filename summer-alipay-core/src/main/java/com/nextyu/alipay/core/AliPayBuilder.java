package com.nextyu.alipay.core;

import com.nextyu.alipay.annotation.Optional;

/**
 * created on 2018-01-09 17:23
 *
 * @author nextyu
 */
public class AliPayBuilder {
    private AliPay aliPay;

    /**
     * @param appId           支付宝分配给开发者的应用ID
     * @param privateKey      商户私钥
     * @param aliPayPublicKey 支付宝公钥
     * @return
     */
    public static AliPayBuilder newBuilder(String appId, String privateKey, String aliPayPublicKey) {
        AliPayBuilder builder = new AliPayBuilder();
        builder.aliPay = new AliPay(appId, privateKey, aliPayPublicKey);
        return builder;
    }

    /**
     * @param subject 订单标题
     * @return
     */
    public AliPayBuilder subject(String subject) {
        aliPay.subject = subject;
        return this;
    }

    /**
     * @param outTradeNo 商户订单号
     * @return
     */
    public AliPayBuilder outTradeNo(String outTradeNo) {
        aliPay.outTradeNo = outTradeNo;
        return this;
    }


    /**
     * @param totalAmount 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
     * @return
     */
    public AliPayBuilder totalAmount(String totalAmount) {
        aliPay.totalAmount = totalAmount;
        return this;
    }

    /**
     * @param notifyUrl 支付宝服务器主动通知商户服务器里指定的页面http/https路径
     * @return
     */
    public AliPayBuilder notifyUrl(String notifyUrl) {
        aliPay.notifyUrl = notifyUrl;
        return this;
    }

    /**
     * @param timeExpire 绝对超时时间，格式为yyyy-MM-dd HH:mm
     * @return
     */
    @Optional
    public AliPayBuilder timeExpire(String timeExpire) {
        aliPay.timeExpire = timeExpire;
        return this;
    }

    /**
     * @param passbackParams 公用回传参数，如果请求时传递了该参数，则返回给商户时会回传该参数
     * @return
     */
    @Optional
    public AliPayBuilder passbackParams(String passbackParams) {
        aliPay.passbackParams = passbackParams;
        return this;
    }

    /**
     * @param body 订单描述
     * @return
     */
    @Optional
    public AliPayBuilder body(String body) {
        aliPay.body = body;
        return this;
    }

    /**
     * @param returnUrl 同步返回地址，HTTP/HTTPS开头字符串
     * @return
     */
    @Optional
    public AliPayBuilder returnUrl(String returnUrl) {
        aliPay.returnUrl = returnUrl;
        return this;
    }

    /**
     * @param qrcodeWidth 商户自定义二维码宽度
     * @return
     */
    @Optional
    public AliPayBuilder qrcodeWidth(Long qrcodeWidth) {
        aliPay.qrcodeWidth = qrcodeWidth;
        return this;
    }

    public AliPay build() {
        return aliPay;
    }
}

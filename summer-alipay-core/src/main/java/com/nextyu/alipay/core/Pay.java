package com.nextyu.alipay.core;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.domain.AlipayTradePagePayModel;
import com.alipay.api.domain.AlipayTradeWapPayModel;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.alipay.api.response.AlipayTradePagePayResponse;
import com.alipay.api.response.AlipayTradeWapPayResponse;
import com.nextyu.alipay.exception.AliPayException;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * created on 2018-01-09 17:41
 *
 * @author nextyu
 */
public class Pay {
    private AliPay aliPay;

    Pay(AliPay aliPay) {
        this.aliPay = aliPay;
    }

    /**
     * APP支付
     *
     * @return
     */
    public String appPay() {
        checkPayParam();
        AlipayClient alipayClient = getAlipayClient();
        AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
        AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
        model.setBody(aliPay.body);
        model.setSubject(aliPay.subject);
        model.setOutTradeNo(aliPay.outTradeNo);
        model.setTimeExpire(aliPay.timeExpire);
        model.setTotalAmount(aliPay.totalAmount);
        model.setProductCode("QUICK_MSECURITY_PAY");
        model.setPassbackParams(aliPay.passbackParams);
        request.setBizModel(model);
        request.setNotifyUrl(aliPay.notifyUrl);
        try {
            AlipayTradeAppPayResponse response = alipayClient.sdkExecute(request);
            return response.getBody();
        } catch (AlipayApiException e) {
            throw new AliPayException("支付宝APP支付-获取支付信息失败", e);
        }

    }


    /**
     * 手机网站支付
     *
     * @return
     */
    public String wapPay() {
        checkPayParam();
        checkNotNull(aliPay.returnUrl, "returnUrl cant't be null");
        AlipayClient alipayClient = getAlipayClient();
        AlipayTradeWapPayRequest request = new AlipayTradeWapPayRequest();
        AlipayTradeWapPayModel model = new AlipayTradeWapPayModel();
        model.setBody(aliPay.body);
        model.setSubject(aliPay.subject);
        model.setOutTradeNo(aliPay.outTradeNo);
        model.setTimeExpire(aliPay.timeExpire);
        model.setTotalAmount(aliPay.totalAmount);
        model.setProductCode("QUICK_WAP_PAY");
        model.setPassbackParams(aliPay.passbackParams);
        request.setBizModel(model);
        request.setNotifyUrl(aliPay.notifyUrl);
        request.setReturnUrl(aliPay.returnUrl);
        try {
            AlipayTradeWapPayResponse response = alipayClient.pageExecute(request);
            return response.getBody();
        } catch (AlipayApiException e) {
            throw new AliPayException("支付宝手机网站支付-获取支付信息失败", e);
        }

    }

    /**
     * 电脑网站支付-跳转模式
     *
     * @return
     */
    public String pcPay() {
        checkPayParam();
        checkNotNull(aliPay.returnUrl, "returnUrl cant't be null");
        AlipayClient alipayClient = getAlipayClient();
        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
        AlipayTradePagePayModel model = new AlipayTradePagePayModel();
        model.setBody(aliPay.body);
        model.setSubject(aliPay.subject);
        model.setOutTradeNo(aliPay.outTradeNo);
        model.setTimeExpire(aliPay.timeExpire);
        model.setTotalAmount(aliPay.totalAmount);
        model.setProductCode("FAST_INSTANT_TRADE_PAY");
        model.setPassbackParams(aliPay.passbackParams);
        request.setBizModel(model);
        request.setNotifyUrl(aliPay.notifyUrl);
        request.setReturnUrl(aliPay.returnUrl);
        try {
            AlipayTradePagePayResponse response = alipayClient.pageExecute(request);
            return response.getBody();
        } catch (AlipayApiException e) {
            throw new AliPayException("支付宝电脑网站支付-获取支付信息失败", e);
        }

    }

    /**
     * 电脑网站支付-前置模式（只有二维码）
     *
     * @return
     */
    public String pcPayWithQRCode() {
        checkPayParam();
        AlipayClient alipayClient = getAlipayClient();
        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
        AlipayTradePagePayModel model = new AlipayTradePagePayModel();
        model.setBody(aliPay.body);
        model.setSubject(aliPay.subject);
        model.setOutTradeNo(aliPay.outTradeNo);
        model.setTimeExpire(aliPay.timeExpire);
        model.setTotalAmount(aliPay.totalAmount);
        model.setProductCode("FAST_INSTANT_TRADE_PAY");
        model.setPassbackParams(aliPay.passbackParams);
        model.setQrPayMode("4");
        model.setQrcodeWidth(aliPay.qrcodeWidth);
        request.setBizModel(model);
        request.setNotifyUrl(aliPay.notifyUrl);
        try {
            AlipayTradePagePayResponse response = alipayClient.pageExecute(request);
            return response.getBody();
        } catch (AlipayApiException e) {
            throw new AliPayException("支付宝电脑网站支付-获取支付信息失败", e);
        }

    }

    private DefaultAlipayClient getAlipayClient() {
        return new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", aliPay.appId, aliPay.privateKey, "json", "utf-8", aliPay.aliPayPublicKey, "RSA2");
    }

    private void checkPayParam() {
        checkNotNull(aliPay.appId, "appId cant't be null");
        checkNotNull(aliPay.privateKey, "privateKey cant't be null");
        checkNotNull(aliPay.aliPayPublicKey, "aliPayPublicKey cant't be null");
        checkNotNull(aliPay.outTradeNo, "outTradeNo cant't be null");
        checkNotNull(aliPay.notifyUrl, "notifyUrl cant't be null");
    }


}

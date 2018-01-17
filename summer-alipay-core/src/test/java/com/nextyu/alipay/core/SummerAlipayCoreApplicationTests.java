package com.nextyu.alipay.core;

import com.xiaoleilu.hutool.lang.Console;
import org.junit.Test;

public class SummerAlipayCoreApplicationTests {

    private final String appId = "xxx";
    private final String privateKey = "xxx";
    private final String aliPayPublicKey = "xxx";

    private final String notifyUrl = "http://www.nextyu.com";

    /**
     * APP支付
     */
    @Test
    public void appPay() {
        String s = AliPayBuilder
                .newBuilder(appId, privateKey, aliPayPublicKey)
                .subject("测试订单")
                .outTradeNo(System.currentTimeMillis() / 1000 + "")
                .notifyUrl(notifyUrl)
                .build()
                .pay()
                .appPay();
        Console.log(s);
    }

    /**
     * 手机网站支付
     */
    @Test
    public void wapPay() {
        String s = AliPayBuilder
                .newBuilder(appId, privateKey, aliPayPublicKey)
                .subject("测试订单")
                .outTradeNo(System.currentTimeMillis() / 1000 + "")
                .notifyUrl(notifyUrl)
                .returnUrl("")
                .build()
                .pay()
                .wapPay();
        Console.log(s);
    }

    /**
     * 电脑网站支付-跳转模式
     */
    @Test
    public void pcPay() {
        String s = AliPayBuilder
                .newBuilder(appId, privateKey, aliPayPublicKey)
                .subject("测试订单")
                .outTradeNo(System.currentTimeMillis() / 1000 + "")
                .notifyUrl(notifyUrl)
                .build()
                .pay()
                .pcPay();
        Console.log(s);
    }

    /**
     * 电脑网站支付-前置模式（只有二维码）
     */
    @Test
    public void pcPayWithQRCode() {
        String s = AliPayBuilder
                .newBuilder(appId, privateKey, aliPayPublicKey)
                .subject("测试订单")
                .outTradeNo(System.currentTimeMillis() / 1000 + "")
                .notifyUrl(notifyUrl)
                .qrcodeWidth(200L)
                .build()
                .pay()
                .pcPayWithQRCode();
        Console.log(s);
    }

}

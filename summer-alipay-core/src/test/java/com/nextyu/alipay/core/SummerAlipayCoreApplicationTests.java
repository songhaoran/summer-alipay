package com.nextyu.alipay.core;

import com.xiaoleilu.hutool.lang.Console;
import org.junit.Test;

public class SummerAlipayCoreApplicationTests {

    private final String appId = "xxx";
    private final String privateKey = "xxx";
    private final String aliPayPublicKey = "xxx";

    private final String notifyUrl = "http://www.nextyu.com";

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

    @Test
    public void pcPayWithQRCode() {
        String s = AliPayBuilder
                .newBuilder(appId, privateKey, aliPayPublicKey)
                .subject("测试订单")
                .outTradeNo(System.currentTimeMillis() / 1000 + "")
                .notifyUrl(notifyUrl)
                .build()
                .pay()
                .pcPayWithQRCode();
        Console.log(s);
    }

}

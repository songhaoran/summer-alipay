# 支付宝支付相关组件

## 已实现的支付功能

### app支付

```
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
```

### 手机网站支付

```
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
```

### 电脑网站支付-跳转模式

```
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
```

### 电脑网站支付-前置模式（只有二维码）

```
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
```



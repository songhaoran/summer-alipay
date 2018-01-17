package com.nextyu.alipay.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 标记的方法是可选调用，其他的必须调用
 * created on 2018-01-10 14:54
 *
 * @author nextyu
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface Optional {
}

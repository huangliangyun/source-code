package com.javahly.spring26.annotation;

import com.javahly.spring26.imports.MyImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/4
 * @QQ :1136513099
 * @desc :
 */
@Import(MyImportSelector.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnableHly {
}

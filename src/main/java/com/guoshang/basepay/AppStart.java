package com.guoshang.basepay;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author :zlg
 * @Description :如果不用容器启动   可以直接运行这个
 * @Date : Create in 2017/10/12  下午3:56
 * @Modified By :
 */
@Slf4j
public class AppStart {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{
                        "classpath:spring/applicationContext-common.xml",
                        "classpath:spring/applicationContext-dubbo-provider.xml"
                });

        context.start();
        log.info("running");
        /**
         * 一直运行
         */
        while (true){}
    }
}

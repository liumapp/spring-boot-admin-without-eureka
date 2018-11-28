package com.liumapp.demo.admin.client.a.log;

import com.liumapp.qtools.date.DateTool;
import com.liumapp.qtools.date.TimeZoneDateTool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * file PrintLog.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/11/28
 */
@Component
@EnableScheduling
public class PrintLog {

    private static Logger logger = LoggerFactory.getLogger(PrintLog.class);

    /**
     * on prod model
     * plz annotate thie method
     */
    @Scheduled(fixedDelay = 3000)
    public void send () {
        logger.info("now is : " + TimeZoneDateTool.getSimpleShangHaiCurrentTime());
    }

}

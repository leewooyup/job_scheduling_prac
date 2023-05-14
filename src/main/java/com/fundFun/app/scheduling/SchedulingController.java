package com.fundFun.app.scheduling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class SchedulingController {
    private static final Logger log = LoggerFactory.getLogger(SchedulingTest.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @RequestMapping("/")
    public String callSchedulingLog() {
        return "index";
    }

    @Scheduled(fixedRate = 3000)
    public void reportCurrentTime() {
        String format = dateFormat.format(new Date());
        log.info("The time is now " + format);
    }
}

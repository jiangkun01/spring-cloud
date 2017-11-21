package co.fy.eurekacustormer.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CREATED IN  2017-11-21 下午5:52
 *
 * @AUTHOR: 姜坤
 **/
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${foo}")
    private String profile;

    @GetMapping("/hello")
    public String hello() {
        return this.profile;
    }
}
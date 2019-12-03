package com.lee.practice.git;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Date 2019/12/3
 * @Create by lixing
 */
@RestController
@EnableAutoConfiguration
public class GitTest {

    @RequestMapping("/")
    public String home() {
        return "hi git! -v.08 -master update! ----merge合并分支clx";
    }

}

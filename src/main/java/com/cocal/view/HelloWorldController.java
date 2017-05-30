package com.cocal.view;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by user on 2017/5/30.
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}

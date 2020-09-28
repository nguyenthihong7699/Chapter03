package com.jvision.admin.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello()
    {
        return "hello2";
    }
@GetMapping("/hello2")
    public String hello2()
{
    return "반갑습니다";
}

}

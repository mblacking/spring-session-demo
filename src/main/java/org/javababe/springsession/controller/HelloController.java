package org.javababe.springsession.controller;/**
 * @date: 2020/6/2 10:52
 * @description
 * @author nqm
 * @param $
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nqm
 * @description
 * @date 2020/6/2 10:52
 */
@RestController
public class HelloController {

    @GetMapping("admin/hello")
    public String adminHello() {

        return "hello admin";
    }


    @GetMapping("user/hello")
    public String usreHello() {

        return "hello user";
    }


    @GetMapping("hello")
    public String hello() {

        return "hello all";
    }

}

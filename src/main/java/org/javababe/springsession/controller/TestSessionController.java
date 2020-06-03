package org.javababe.springsession.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author LS
 * @date 2020/5/14 9:27 星期四
 */
@RestController
public class TestSessionController {

    @Value("${server.port}")
    private Integer serverPort;

    @GetMapping("/createSession")
    public String createSession(HttpSession session, String name) {
        session.setAttribute("name", name);

        return "当前请求的接口端口号：" + serverPort + "，创建seesion成功，sessionId：" + session.getId();
    }


    @GetMapping("getSeesion")
    public String getSeesion(HttpSession session) {

        return "当前请求的接口端口号：" + serverPort + "，sessionId：" + session.getId() + "，name:" + session.getAttribute("name");
    }


}

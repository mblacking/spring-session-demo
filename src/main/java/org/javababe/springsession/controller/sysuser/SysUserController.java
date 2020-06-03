package org.javababe.springsession.controller.sysuser;


import org.javababe.springsession.entity.sysuser.SysUser;
import org.javababe.springsession.service.sysuser.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author nieqm
 * @since 2020-05-28
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {


    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/getById/{id}")
    public SysUser getById(@PathVariable("id") Long id) {


        SysUser sysUser = sysUserService.selectById(id);
        return sysUser;
    }

}


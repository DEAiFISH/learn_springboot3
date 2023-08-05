package com.deaifish.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description TODO
 *
 * @className WelcomeController
 * @author DEAiFISH
 * @date 2023/8/5 11:23
 */
@Controller // 适配服务端渲染，前后端不分离
public class WelcomeController {

    /**
     * @description 利用模版引擎跳转页面
     *
     * @author DEAiFISH
     * @date 2023/8/5 11:25
     * @return java.lang.String
     */
    @GetMapping("/well")
    public String hello(@RequestParam("name") String name, Model model){
        //模版的逻辑试图名
        //物理视图名 = 前缀 + 逻辑视图名 + 后缀
        //真实地址 classpath:/templates/welcome.html

        //把需要给页面共享的数据放到model中
        model.addAttribute("msg",name);
        return "welcome";
    }
}

package com.deaifish.boot3.rpc.controller;

import com.deaifish.boot3.rpc.service.XApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2023/10/12 16:18
 */
@RestController
public class XApiController {

    @Autowired
    XApiService xApiService;

    /**
     * @description 根据QQ查询手机号
     *
     * @author DEAiFISH
     * @date 2023/10/12 16:33
     * @param QQ
     * @return reactor.core.publisher.Mono<java.lang.String>
     */
    @GetMapping("/QQ2Iphone")
    public Mono<String> getIphoneByQQ(@RequestParam("QQ") String QQ){
        return xApiService.getIphoneByQQ(QQ);
    }
}

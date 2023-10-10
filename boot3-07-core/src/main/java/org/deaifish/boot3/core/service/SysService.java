package org.deaifish.boot3.core.service;

import org.springframework.stereotype.Service;

/**
 * @description TODO
 *
 * @className SysService
 * @author DEAiFISH
 * @date 2023/10/10 16:24
 */
@Service
public class SysService {
    public void recordeLog(String userName){
        System.out.println(userName + "登录日志记录完成。。。");
    }
}

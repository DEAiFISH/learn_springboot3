package com.deaifish.boot.mapper;

import com.deaifish.boot.bean.TUser;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @description TODO
 *
 * @className UserMapper
 * @author DEAiFISH
 * @date 2023/8/12 19:39
 */
@MapperScan
public interface UserMapper {
    TUser getUserById(@Param("id") int id);

}

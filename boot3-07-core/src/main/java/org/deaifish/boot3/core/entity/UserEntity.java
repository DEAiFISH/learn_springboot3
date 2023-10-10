package org.deaifish.boot3.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description TODO
 *
 * @className UserEntity
 * @author DEAiFISH
 * @date 2023/10/10 16:50
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    private String userName;
    private String passwd;
}

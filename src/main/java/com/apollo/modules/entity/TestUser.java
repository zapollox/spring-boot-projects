package com.apollo.modules.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author apollo123
 * @since 2019-01-24
 */
@Data
public class TestUser extends Model<TestUser> {

    private static final long serialVersionUID = 1L;

    private String id;
    private String username;
    private String password;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

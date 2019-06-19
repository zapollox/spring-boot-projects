package com.apollo.modules.mapper;

import com.apollo.modules.entity.TestUser;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author apollo123
 * @since 2019-01-24
 */
@Mapper
public interface TestUserMapper extends BaseMapper<TestUser> {

    List<TestUser> selectAllUser();

}

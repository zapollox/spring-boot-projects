package com.apollo.modules.service;

import com.apollo.modules.entity.TestUser;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author apollo123
 * @since 2019-01-24
 */
public interface ITestUserService extends IService<TestUser> {

     List<TestUser> findAllUser();

}

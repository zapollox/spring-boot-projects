package com.apollo.modules.test.service.impl;

import com.apollo.modules.test.entity.TestUser;
import com.apollo.modules.test.mapper.TestUserMapper;
import com.apollo.modules.test.service.ITestUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author apollo123
 * @since 2019-01-24
 */
@Service
public class TestUserServiceImpl extends ServiceImpl<TestUserMapper, TestUser> implements ITestUserService {

}

package com.apollo.modules.service.impl;

import com.apollo.modules.entity.TestUser;
import com.apollo.modules.mapper.TestUserMapper;
import com.apollo.modules.service.ITestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author apollo123
 * @since 2019-01-24
 */
@Service
public class TestUserServiceImpl implements ITestUserService {
    @Autowired
    private TestUserMapper testUserMapper;
    @Override
    public List<TestUser> findAllUser() {
        return testUserMapper.selectAllUser();
    }
}

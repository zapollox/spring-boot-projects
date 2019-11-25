package com.apollo.modules.service.impl;

import com.apollo.modules.entity.User;
import com.apollo.modules.mapper.UserMapper;
import com.apollo.modules.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author apollo
 * @since 2019-11-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}

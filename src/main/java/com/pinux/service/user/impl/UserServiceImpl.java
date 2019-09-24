package com.pinux.service.user.impl;

import com.pinux.entity.user.User;
import com.pinux.mapper.user.UserMapper;
import com.pinux.service.user.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author pinux
 * @since 2019-09-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}

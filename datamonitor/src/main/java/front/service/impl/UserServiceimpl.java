package front.service.impl;

import front.entity.User;
import front.mapper.UserMapper;
import front.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: WangYN
 * Date: 2018/7/14
 * Time: 12:06
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class UserServiceimpl implements UserService {

   @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> getAll() {
        return userMapper.selectAll();
    }

    @Override
    public User queryByName(String name) {
        return this.userMapper.queryByName(name);
    }
}
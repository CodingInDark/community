package life.community.xianren.service.serviceImpl;

import life.community.xianren.mapper.UserMapper;
import life.community.xianren.pojo.User;
import life.community.xianren.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void insert(String name,String accountId,String token,String bio){

        userMapper.insert(name, accountId, token,bio);

    }
    public User findByToken(String token){
        return userMapper.findByToken(token);
    }
}

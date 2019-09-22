package life.community.xianren.service;

import life.community.xianren.pojo.User;

public interface UserService {
    void insert(String name,String accountId,String token,String bio);
    User findByToken(String token);
}

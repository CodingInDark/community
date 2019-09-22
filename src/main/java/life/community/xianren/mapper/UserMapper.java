package life.community.xianren.mapper;

import life.community.xianren.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    void insert(@Param("name")String name,@Param("accountId")String accountId,@Param("token")String token,@Param("bio")String bio);
    @Select("select * from user where token=#{token}")
    User findByToken(String token);
}

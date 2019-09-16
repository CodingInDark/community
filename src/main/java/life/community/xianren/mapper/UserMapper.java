package life.community.xianren.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserMapper {

    void insert(@Param("name")String name,@Param("accountId")String accountId,@Param("token")String token);
}

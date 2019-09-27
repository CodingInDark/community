package life.community.xianren.mapper;

import life.community.xianren.pojo.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QuestionMapper {
    @Insert("insert into question (title,description,gmt_create,gmt_modified,creator,tag) values (#{title},#{description},now(),now(),#{creator},#{tag})")
    void create(Question question);
}

package life.community.xianren.service.serviceImpl;

import life.community.xianren.mapper.QuestionMapper;
import life.community.xianren.pojo.Question;
import life.community.xianren.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    public void insert(String title,String description,String tag,Integer userId){
        Question question=new Question();
        question.setTitle(title);
        question.setDescription(description);
        question.setTag(tag);
        question.setCreator(userId);
        questionMapper.create(question);
    }


}

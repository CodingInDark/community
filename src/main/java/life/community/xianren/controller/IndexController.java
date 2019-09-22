package life.community.xianren.controller;

import life.community.xianren.pojo.User;
import life.community.xianren.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @Autowired
    private UserService userService;


    @GetMapping("/")
    public String index(HttpServletRequest request) {

        Cookie[] cookies=request.getCookies();
        if (cookies==null){
            return "index";
        }
        for(Cookie cookie:cookies){
            if (cookie.getName().equals("token")){
               String token=cookie.getValue();
               User user=userService.findByToken(token);
               if (user!=null){
                   request.getSession().setAttribute("user",user);
               }
               break;
            }
        }
        return "index";
    }
}

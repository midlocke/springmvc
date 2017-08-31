package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by richard on 2017/8/31.
 */
@Controller
public class TestController {

    @RequestMapping("test")
    public String testIndex(){
        return "testIndex.jsp";
    }
}

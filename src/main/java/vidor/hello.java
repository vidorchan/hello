package main.java.vidor;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/")
public class hello {
    private static final String INDEX = "index";

    @RequestMapping("mvc")
    public ModelAndView printlnWelcome() {
        Logger logger = Logger.getLogger(hello.class);

        Map<String, Object> model = new HashMap<>();
        model.put("message","hello world");
        logger.info("日志打印");
        logger.error("测试error");
        return new ModelAndView(INDEX, model);
    }
}

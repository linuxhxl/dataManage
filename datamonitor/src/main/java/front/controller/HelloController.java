package front.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: WangYN
 * Date: 2018/7/12
 * Time: 22:18
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Controller
@RequestMapping(value="/hello")
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value="/test")
    public List<Map<String, Object>> hello() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT user FROM mysql.user ", new Object[]{});
        return list;
    }

    @RequestMapping("hello")
    public String index(ModelMap map){
        logger.info("index");
        map.put("title","双击666!");
        return "hello";
    }

}
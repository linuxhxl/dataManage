package front.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
@RequestMapping(value="/hello")
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value="/hello")
    public List<Map<String, Object>> hello() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT user FROM mysql.user ", new Object[]{});
//       sayHello();
        return list;
    }

    public String sayHello(){
        System.out.println("hello world");
        return "";
    }

}
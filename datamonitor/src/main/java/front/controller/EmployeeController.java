package front.controller;

import front.entity.Employee;
import front.page.Page;
import front.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2018/7/23
 * Time: 17:55
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("employee")
    public String index(ModelMap map){
        List<Employee> list = employeeService.getAll();
        map.put("result",list);
        return "employee";
    }

    @RequestMapping("page")
    public String page(ModelMap map){
        Page page = new Page<Employee>();
        page.setPageNo(1);
        page.setPageSize(5);
        List<Employee> list = employeeService.findPage(page);
        map.put("result",list);
        return "employee";
    }
}

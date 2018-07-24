package front.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import front.entity.Employee;
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

    @RequestMapping("employeePage")
    public String page(ModelMap map){
        //设置分页条件，Parameters:pageNum 页码pageSize 每页显示数量count 是否进行count查询
        PageHelper.startPage(1, 3, true);

        List<Employee> list = employeeService.findPage();
        PageInfo<Employee> pageInfo = new PageInfo<Employee>(list);

        //打印分页信息
        System.out.println("数据总数：" + pageInfo.getTotal());
        System.out.println("数据总页数：" + pageInfo.getPages());
        System.out.println("最后一页：" + pageInfo.getLastPage());

        map.put("pageInfo",pageInfo);
        return "employeePage";
    }
}

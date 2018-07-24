package front.service.impl;

import front.entity.Employee;
import front.mapper.EmployeeMapper;
import front.page.Page;
import front.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2018/7/23
 * Time: 17:53
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAll() {
        return employeeMapper.selectAll();
    }

    @Override
    public List<Employee> findPage(Page page) {
        return employeeMapper.findPage(page);
    }
}

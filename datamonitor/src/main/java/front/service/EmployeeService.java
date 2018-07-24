package front.service;

import front.entity.Employee;
import front.page.Page;

import java.util.List;

/**
 * Created by Administrator on 2018/7/23.
 */
public interface EmployeeService {
    List<Employee> getAll();

    List<Employee> findPage(Page page);

}

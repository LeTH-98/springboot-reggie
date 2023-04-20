package com.lth.reggie;

import com.lth.reggie.mapper.EmployeeMapper;
import com.lth.reggie.pojo.Employee;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootReggieApplicationTests {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    void testSelect(){

        List<Employee> employees = employeeMapper.selectList(null);

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }



}

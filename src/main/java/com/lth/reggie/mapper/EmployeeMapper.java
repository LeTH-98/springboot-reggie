package com.lth.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lth.reggie.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}

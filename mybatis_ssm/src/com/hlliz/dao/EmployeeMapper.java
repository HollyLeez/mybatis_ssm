package com.hlliz.dao;

import com.hlliz.bean.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {

    public Employee getEmployeeById(int id);

    public void addEmp(Employee employee);

    public Integer updateEmp(Employee employee);

    public void deleteEmp(Integer id);

    public Employee getByIdAndLastName(@Param("id") int id, @Param("lastName") String lastName);

    public Employee getEmployeeByMap(Map<String, Object> map);

    public List<Employee> getEmployeeList();

    public Map<String, Object> getEmpMapById(int id);

    //������¼��װһ��Map:Map<Integer, Employee> ����������¼��������ֵ�Ƿ�װ���java����
    @MapKey("id")
    public Map<Integer, Employee> getEmpMap();
}

package com.wangshao.service;

import com.wangshao.entity.Student;

import java.util.List;
import java.util.Map;

/**
 * @author liutao
 * @create 2020-02-09-15:21
 * 学生信息service接口
 */


public interface StudentService {

    /**
     * 添加或者修改学生信息
     *
     * @param student
     */
    public void save(Student student);

    /**
     * 根据Id查找学生信息
     *
     * @param id
     * @return
     */
    public Student findById(Integer id);

    /**
     * 查询学生信息
     *
     * @return
     */
    public List<Student> list();

    /**
     * 根据id删除学生信息
     *
     * @param id
     */
    public void detele(Integer id);

    /**
     * 获取信息
     * @return
     */
    public Map<String, Object> getInfo();

}

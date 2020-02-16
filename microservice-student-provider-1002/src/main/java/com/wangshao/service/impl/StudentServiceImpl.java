package com.wangshao.service.impl;

import com.wangshao.entity.Student;

import org.springframework.stereotype.Service;
import com.wangshao.repository.StudentRepository;
import com.wangshao.service.StudentService;


import javax.annotation.Resource;
import java.util.List;

/**
 * @author liutao
 * @create 2020-02-09-15:29
 * 学生信息service实现类
 */

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentRepository studentRepository;

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student findById(Integer id) {
        return studentRepository.findOne(id);
    }

    @Override
    public List<Student> list() {
        return studentRepository.findAll();
    }

    @Override
    public void detele(Integer id) {
        studentRepository.delete(id);
    }
}

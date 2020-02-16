package com.wangshao.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wangshao.entity.Student;
import com.wangshao.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liutao
 * @create 2020-02-09-15:34
 * 服务提供者-学生信息控制器
 */

@RestController
@RequestMapping("/student")
public class StudentProviderController {

    @Resource
    private StudentService studentService;

    /**
     * 添加或者修改学生信息
     *
     * @param student
     * @return
     */
    @PostMapping(value = "/save")
    public boolean save(@RequestBody Student student) {
        try {
            studentService.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 查询学生信息
     * @return
     */
    @GetMapping(value = "/list")
    public List<Student> list(){
        System.out.println("list-----------1003");
        return studentService.list();
    }

    /**
     * 根据id查询学生信息
     * @param id
     * @return=-
     */
    @GetMapping(value = "/get/{id}")
    public Student get(@PathVariable("id") Integer id){
        return studentService.findById(id);
    }

    /**
     * 根据id删除学生信息
     * @param id
     * @return
     */
    @GetMapping(value = "/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        try {
            studentService.detele(id);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    /**
     * 获取信息
     * @return
     */
    @ResponseBody
    @GetMapping(value = "/getInfo")
    public Map<String,Object> getInfo() throws InterruptedException {
        Thread.sleep(900);
        return studentService.getInfo();
    }

}

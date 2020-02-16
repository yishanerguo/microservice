package com.wangshao.controller;

import com.wangshao.entity.Student;
import com.wangshao.service.StudentClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author liutao
 * @create 2020-02-10-17:17
 */

@RestController
@RequestMapping("/student")
public class StudentConsumerController {

   @Autowired
   private StudentClientService studentClientService;

    /**
     * 添加或修改学生信息
     * @param student
     * @return
     */
    @PostMapping(value = "/save")
    public boolean save(Student student){
        return studentClientService.save(student);
    }

    /**
     * 查询学生信息
     * @return
     */
    @SuppressWarnings("unchecked")
    @GetMapping(value = "/list")
    public List<Student> list(){
        return studentClientService.list();
    }

    /**
     * 根据id查询学生信息
     * @param id
     * @return
     */
    @GetMapping(value = "/get/{id}")
    public Student get(@PathVariable("id") Integer id){
        return  studentClientService.get(id);
    }

    /**
     * 根据id查询学生信息
     * @param id
     * @return
     */
    @GetMapping(value = "delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        try {
            studentClientService.delete(id);
            return true;
        } catch (RestClientException e) {
            return false;

        }

    }

    /**
     * 获取信息
     * @return
     */
    @GetMapping(value = "/getInfo")
    @ResponseBody
    public Map<String,Object> getInfo(){
        return studentClientService.getInfo();
    }
}
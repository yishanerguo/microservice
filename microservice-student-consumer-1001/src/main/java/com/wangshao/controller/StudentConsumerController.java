package com.wangshao.controller;

import com.wangshao.entity.Student;
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

    @Resource
    private RestTemplate restTemplate;

   // private final static  String PRE_HOST="http://localhost:1001";
    private final static  String PRE_HOST="http://MICROSERVICE-STUDENT";

    /**
     * 添加或修改学生信息
     * @param student
     * @return
     */
    @PostMapping(value = "/save")
    public boolean save(Student student){
        return restTemplate.postForObject(PRE_HOST+"/student/save",student,Boolean.class);
    }

    /**
     * 查询学生信息
     * @return
     */
    @SuppressWarnings("unchecked")
    @GetMapping(value = "/list")
    public List<Student> list(){
        return restTemplate.getForObject(PRE_HOST+"/student/list",List.class);
    }

    /**
     * 根据id查询学生信息
     * @param id
     * @return
     */
    @GetMapping(value = "/get/{id}")
    public Student get(@PathVariable("id") Integer id){
        return  restTemplate.getForObject(PRE_HOST+"/student/get/"+id,Student.class);
    }

    /**
     * 根据id查询学生信息
     * @param id
     * @return
     */
    @GetMapping(value = "delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        try {
            restTemplate.getForObject(PRE_HOST+"/student/delete/"+id,Boolean.class);
            return true;
        } catch (RestClientException e) {
            return false;

        }

    }

    @SuppressWarnings("unchecked")
    @GetMapping(value = "/getInfo")
    @ResponseBody
    public Map<String,Object> getInfo(){
        return restTemplate.getForObject(PRE_HOST+"/student/getInfo/",Map.class);
    }
}

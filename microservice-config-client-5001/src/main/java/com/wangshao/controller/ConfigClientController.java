package com.wangshao.controller;

import org.bouncycastle.pkcs.jcajce.JcePKCSPBEOutputEncryptorBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liutao
 * @create 2020-02-17-14:10
 */

@RestController
public class ConfigClientController {

    @Value("${port}")
    private String port;

    @GetMapping("/getPort")
    public String getPort(){
        return port;
    }

    public void  setPort(String port){
        this.port = port;
    }
}

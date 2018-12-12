package com.gc.rest;

import com.gc.com.gc.util.FileUtil;
import com.gc.pojo.CPUInfo;
import com.gc.pojo.GCInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class AppController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hi";
    }

    @RequestMapping("/info")
    public GCInfo getInfo(){
        return new GCInfo(new Date(),"localhost", FileUtil.getContents(3));
    }

    @RequestMapping("/info/gcpause")
    public GCInfo getInfoWithGCPause(){
        System.gc();
        return new GCInfo(new Date(),"localhost",FileUtil.getContents(3));
    }

    @RequestMapping("/info/cpu/high")
    public CPUInfo getCPUInfo()
    {
        int x=100;
        while(true){
            x+=1;
            if(x==10000){
                break;
            }
        }
        return new CPUInfo(new Date(),"localhost","4");
    }

}

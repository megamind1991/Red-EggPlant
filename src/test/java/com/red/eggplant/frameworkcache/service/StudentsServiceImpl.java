package com.red.eggplant.frameworkcache.service;

import com.red.eggplant.frameworkcache.annotation.Cache;
import org.springframework.stereotype.Service;

@Service
public class StudentsServiceImpl {

    @Cache(cacheNames="userInfoA")
    public String getOneStudentInfo(){
        return "chenzijA";
    }

    @Cache(cacheNames="userInfoB")
    public String getALLStudentInfo(){
        return "chenzijB";
    }

}

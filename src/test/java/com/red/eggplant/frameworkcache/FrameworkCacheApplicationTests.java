package com.red.eggplant.frameworkcache;

import com.red.eggplant.frameworkcache.annotation.Cache;
import com.red.eggplant.frameworkcache.service.StudentsServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FrameworkCacheApplicationTests {

    @Autowired
    StudentsServiceImpl studentsServiceImpl;

    @Test
    void contextLoads() {
        studentsServiceImpl.getOneStudentInfo();
        studentsServiceImpl.getALLStudentInfo();
    }



}

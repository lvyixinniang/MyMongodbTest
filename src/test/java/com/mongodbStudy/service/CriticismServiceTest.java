package com.mongodbStudy.service;


import com.mongodbStudy.pojo.Criticism;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CriticismServiceTest {

    @Resource
    private CriticismService criticismService;

    @Test
    public void testSaveComment(){
        Criticism criticism = new Criticism();
        criticism.setArticleid("100000");
        criticism.setContent("测试添加的数据");
        criticism.setCreateTime(LocalDateTime.now());
        criticism.setUserid("1003");
        criticism.setNickname("凯撒大帝");
        criticism.setState("1");

        criticism.setLikenum(0);
        criticism.setReplynum(0);

        criticismService.save(criticism);
    }

    @Test
    public void testupdate(){

    }
}

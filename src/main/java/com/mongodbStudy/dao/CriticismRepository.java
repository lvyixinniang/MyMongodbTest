package com.mongodbStudy.dao;


import com.mongodbStudy.pojo.Criticism;
import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.stereotype.Repository;


// 评论的持久层接口

public interface CriticismRepository extends MongoRepository<Criticism,String> {

}

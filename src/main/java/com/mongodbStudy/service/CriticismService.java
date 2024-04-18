package com.mongodbStudy.service;


import com.mongodbStudy.pojo.Criticism;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CriticismService {
   void save(Criticism criticism);
   void deleteById(String id);
   void update(Criticism criticism);
   Criticism findById(String id);
   List<Criticism> findAll();
}

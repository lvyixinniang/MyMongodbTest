package com.mongodbStudy.service.impl;

import com.mongodbStudy.dao.CriticismRepository;
import com.mongodbStudy.pojo.Criticism;
import com.mongodbStudy.service.CriticismService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
@Slf4j
public class CriticismServiceImpl implements CriticismService {
    @Autowired
    private CriticismRepository criticismRepository;



    @Override
    public void save(Criticism comment) {
        criticismRepository.save(comment);
    }

    @Override
    public void deleteById(String id) {
        criticismRepository.deleteById(id);
    }

    @Override
    public void update(Criticism comment) {
        criticismRepository.save(comment);
    }

    @Override
    public Criticism findById(String id) {

        return criticismRepository.findById(id).get();
    }

    @Override
    public List<Criticism> findAll() {
        return criticismRepository.findAll();
    }
}

package com.springboot.config.service;

import com.springboot.config.domain.MyProperties;
import com.springboot.config.repository.PropertiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author TTDKOC
 */
@Service
public class PropertiesService {

    @Autowired
    private PropertiesRepository repository;

    public Iterable<MyProperties> findAll() {
        return repository.findAll();
    }

    public Iterable<MyProperties> findByApplication(String application) {
        return repository.findByApplication(application);
    }

    public Iterable<MyProperties> findByApplicationAndProfile(String application, String profile) {
        return repository.findByApplicationAndProfile(application, profile);
    }

    public Iterable<MyProperties> findByApplicationAndProfileAndLabel(String application, String profile,
                                                                      String label) {
        return repository.findByApplicationAndProfileAndLabel(application, profile, label);
    }

    public Iterable<MyProperties> findByApplicationAndProfileAndLabelAndKey(String application, String profile,
                                                                            String label, String key) {
        return repository.findByApplicationAndProfileAndLabelAndKey(application, profile, label, key);
    }

    public Optional<MyProperties> findOneByApplicationAndProfileAndLabelAndKey(String application, String profile,
                                                                               String label, String key) {
        return repository.findOneByApplicationAndProfileAndLabelAndKey(application, profile, label, key);
    }

    public MyProperties save(MyProperties insuranceMyProperties) {
        return repository.save(insuranceMyProperties);
    }
}

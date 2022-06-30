package com.springboot.config.resource;

import com.springboot.config.domain.MyProperties;
import com.springboot.config.service.PropertiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URISyntaxException;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PropertyResource {


    @Autowired
    private PropertiesService propertiesService;


    @GetMapping("/props")
    public Iterable<MyProperties> getAll() {
        return propertiesService.findAll();
    }

    @GetMapping("/props/{application}")
    public Iterable<MyProperties> get(@PathVariable() String application) {
        return propertiesService.findByApplication(application);
    }

    @GetMapping("/props/{application}/{profile}")
    public Iterable<MyProperties> get(@PathVariable() String application, @PathVariable() String profile) {
        return propertiesService.findByApplicationAndProfile(application, profile);
    }

    @GetMapping("/props/{application}/{profile}/{label}")
    public Iterable<MyProperties> get(@PathVariable() String application, @PathVariable() String profile,
                                      @PathVariable() String label) {
        return propertiesService.findByApplicationAndProfileAndLabel(application, profile, label);
    }

    @GetMapping("/props/{application}/{profile}/{label}/{key}")
    public Iterable<MyProperties> get(@PathVariable() String application, @PathVariable() String profile,
                                      @PathVariable() String label, @PathVariable() String key) {
        return propertiesService.findByApplicationAndProfileAndLabelAndKey(application, profile, label, key);
    }

    @PutMapping("/props")
    public Optional<MyProperties> update(@Valid @RequestBody MyProperties insuranceMyProperties) throws URISyntaxException {
        Optional<MyProperties> existing = propertiesService.findOneByApplicationAndProfileAndLabelAndKey(
                insuranceMyProperties.getApplication(), insuranceMyProperties.getProfile(), insuranceMyProperties.getLabel(),
                insuranceMyProperties.getKey());
        return existing.map(rProp -> {
            rProp.setValue(insuranceMyProperties.getValue());
            return propertiesService.save(rProp);
        });
    }

    @PostMapping("/props")
    public MyProperties create(@Valid @RequestBody MyProperties insuranceMyProperties) {
        return propertiesService.save(insuranceMyProperties);
    }
}

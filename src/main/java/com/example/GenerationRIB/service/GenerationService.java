package com.example.GenerationRIB.service;

import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;

@Service
public class GenerationService {

    public String exportReport(Integer id, String reportFormat) throws FileNotFoundException {
        String path = "C:\\Users\\hp\\Desktop\\Report";
        File file = ResourceUtils.getFile("classpath:rib.jasper");
        return "Your Report is generated in the path: " +path;
    }

}

package com.example.GenerationRIB.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Template {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long code;
    private String description;
    private String source ;

    @OneToMany
    private List<TemplateParam> templateParam;
}

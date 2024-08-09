package com.skrp.batchio.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Industry")
public class Industry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private int year;
    private String industryAggregationNZSIOC;
    private String industryCodeNZSIOC;
    private String industryNameNZSIOC;
    private String units;
    private String variableCode;
    private String variableName;
    private String variableCategory;
    private long value;
    private String industryCodeANZSIC06;

}

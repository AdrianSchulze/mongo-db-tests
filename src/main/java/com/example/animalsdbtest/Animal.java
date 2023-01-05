package com.example.animalsdbtest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Animal {

    private String id;
    private String type;
    private int age;
    private String name;
}

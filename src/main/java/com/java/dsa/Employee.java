package com.java.dsa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Employee {
    int id;
    String name;
    String department;
    int salary;
    int age;
}
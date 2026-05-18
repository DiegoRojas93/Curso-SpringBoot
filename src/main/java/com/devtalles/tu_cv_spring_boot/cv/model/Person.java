package com.devtalles.tu_cv_spring_boot.cv.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private String profession;
}

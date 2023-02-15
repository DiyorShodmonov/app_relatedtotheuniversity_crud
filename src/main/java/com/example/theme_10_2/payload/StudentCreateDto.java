package com.example.theme_10_2.payload;

import lombok.Data;

/**
 * @author Saydali Murodullayev, Sun 4:08 PM. 3/13/2022
 */
@Data
public class StudentCreateDto {

    private String firstName;

    private String lastName;

    private Integer address_id;

    private Integer group_id;
}

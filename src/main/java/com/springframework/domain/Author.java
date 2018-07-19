package com.springframework.domain;

import lombok.Data;

/**
 * Created by Maciej on 12/07/2018
 */
@Data
public class Author {

    private Integer id;
    private String firstName;
    private String lastName;
    private String image;
}

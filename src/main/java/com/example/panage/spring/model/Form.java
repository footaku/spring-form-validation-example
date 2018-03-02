package com.example.panage.spring.model;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

/**
 * @author fu-taku
 */
public class Form {
    @NotEmpty
    @Length(min = 1, max = 3)
    private String name;

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}

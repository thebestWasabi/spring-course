package com.spring.mvc;

import com.spring.mvc.validation.CheckEmail;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employee {

    @Size(min = 2, max = 16, message = "Name size must be between 2 and 16")
    String name;

    @Size(min = 2, max = 16, message = "Surname size must be between 2 and 16")
    String surname;

    @Min(value = 500, message = "Must be greater or equals than 500")
    @Max(value = 2900, message = "Must be less or equals than 2900")
    int salary;

    String department;
    Map<String, String> departments;

    @Pattern(regexp = "\\d{3}-\\d{3}-\\d{2}-\\d{2}", message = "xxx-xxx-xx-xx")
    String phoneNumber;

    @CheckEmail
    String email;

    String laptop;
    Map<String, String> laptops;
    String[] languages;
    Map<String, String> languagesList;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");

        laptops = new HashMap<>();
        laptops.put("Lenovo", "Lenovo z300");
        laptops.put("Asus", "Asus Rog 3Z");
        laptops.put("MacBook", "MacBook air m2");

        languagesList = new HashMap<>();
        languagesList.put("English", "En");
        languagesList.put("Russian", "Ru");
        languagesList.put("German", "Ge");
        languagesList.put("French", "Fr");
        languagesList.put("Chines", "Ch");
    }
}

package com.ambro.main;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ModelObject {

    private String name;
    private String surname;
    private LocalDate date;
    private Integer phone;

    public ModelObject(String name, String surname, LocalDate date, Integer phone) {
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.phone = phone;
    }

    public long getAge() {
        LocalDate now = LocalDate.now();
        LocalDate time = this.date;
        long age = time.until(now, ChronoUnit.DAYS);
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDate() {
        return date;
    }

    public Integer getPhone() {
        return phone;
    }

}

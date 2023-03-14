package org.example.domain;

import java.util.Objects;
public class Abonents {
    private Long id;
    private String name;
    private String last_name;
    private String phone_number;

    public Abonents(Long id, String name, String last_name, String phone_number) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.phone_number = phone_number;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Abonents abonents = (Abonents) o;
        return Objects.equals(id, abonents.id);
    }


    @Override
    public String toString() {
        return "Абонент{" +
                "id=" + id +
                ", имя - " + name +
                ", фамилия - " + last_name +
                ", номер телефона - " + phone_number +  '}';
    }
}


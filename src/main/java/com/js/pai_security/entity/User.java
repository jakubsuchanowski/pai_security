package com.js.pai_security.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "Users")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userid;


    @NotEmpty(message = "Imie musi być uzupełnione!")
    @Pattern(regexp = "[a-zA-Z]{2,30}", message="Podaj poprawnie imie!!!")
    private String name;
    @NotEmpty(message = "Nazwisko musi być uzupełnione!")
    @Pattern(regexp = "[a-zA-Z]{2,30}", message="Podaj poprawnie nazwisko!!!")
    private String surname;

    @NotEmpty(message = "Login musi być uzupełniony!")
    @Size(min = 3, message = "Wpisz co najmniej 3 znaki!")
    private String login;
    @NotEmpty(message = "Hasło musi być uzupełnione!")
    @Size(min = 3, message = "Wpisz co najmniej 3 znaki!")
    private String password;

    public User(String name, String surname, String login, String password){
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

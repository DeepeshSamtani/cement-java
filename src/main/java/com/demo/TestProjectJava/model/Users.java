package com.demo.TestProjectJava.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Getter
@Setter
@Entity
public class Users {
    @Id
    @Column
    private String username;
    @Column
    private String password;
}

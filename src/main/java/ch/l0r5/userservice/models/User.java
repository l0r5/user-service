package ch.l0r5.userservice.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Builder;

@Builder
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue
    private final Long id;

    @Column
    private final String username;

}
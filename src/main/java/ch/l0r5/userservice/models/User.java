package ch.l0r5.userservice.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

   @Id
   @GeneratedValue
   private Long id;
}

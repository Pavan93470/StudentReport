package com.evoke.StudentReport.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
   @Entity
   @Table(name="Student")
public class StudentEntity {
      @Id
      private int id;
   @Column(name="name")
        private String name;
      @Column(name="email")
        private String Email;

    }


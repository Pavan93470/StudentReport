package com.evoke.StudentReport.Repository;

import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;


@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Integer, Id> {
}

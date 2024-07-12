package com.evoke.StudentReport.Servie;

import com.evoke.StudentReport.entity.StudentEntity;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
     public StudentEntity save(StudentEntity Savestudent);
}

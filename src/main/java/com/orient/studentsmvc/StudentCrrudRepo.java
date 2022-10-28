package com.orient.studentsmvc;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentCrrudRepo extends CrudRepository<Student,Long> {
}

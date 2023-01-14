package com.kobe.flywhey.FlywayDemo.repository;

import com.kobe.flywhey.FlywayDemo.entity.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends CrudRepository<Test, Long> {
}

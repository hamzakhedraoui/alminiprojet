package com.elearning.demo.dao;

import com.elearning.demo.models.Modules;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleRepository extends JpaRepository<Modules,Long> {
}

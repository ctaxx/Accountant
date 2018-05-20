package com.accountant.repository;

import com.accountant.entity.StatetableEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<StatetableEntity, Integer>{
}

package com.jpnt.demologin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpnt.demologin.model.AppUser;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Long> {

}
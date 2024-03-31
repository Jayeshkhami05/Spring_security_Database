package com.Rutuja.Spring_Security_database.repositry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rutuja.Spring_Security_database.Entity.Entityuser;

@Repository
public interface Repo extends JpaRepository<Entityuser, Integer> {

	Optional<Entityuser> findByName(String username);

}

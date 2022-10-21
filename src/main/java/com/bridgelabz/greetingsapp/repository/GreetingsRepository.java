package com.bridgelabz.greetingsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.greetingsapp.model.GreetingsModel;

@Repository
public interface GreetingsRepository extends JpaRepository<GreetingsModel, Integer> {

}

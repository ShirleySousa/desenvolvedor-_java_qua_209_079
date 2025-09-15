package com.crud.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.app.models.Pessoa;

@Repository
public interface AppRepository extends CrudRepository<Pessoa, Long> {
    // Use Long como tipo do ID se o ID da sua entidade Pessoa for Long
}
package com.jm.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jm.modelos.User;
@Repository

public interface InterfaceUsuario extends CrudRepository<User, Integer> {

}
 
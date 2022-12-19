package br.com.joaogosmani.productsandorders.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaogosmani.productsandorders.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

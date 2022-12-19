package br.com.joaogosmani.productsandorders.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaogosmani.productsandorders.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

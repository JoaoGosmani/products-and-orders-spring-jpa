package br.com.joaogosmani.productsandorders.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaogosmani.productsandorders.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

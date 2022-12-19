package br.com.joaogosmani.productsandorders.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaogosmani.productsandorders.entities.OrderItem;
import br.com.joaogosmani.productsandorders.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}

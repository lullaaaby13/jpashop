package me.bluecitron.jpashop.repository;

import lombok.RequiredArgsConstructor;
import me.bluecitron.jpashop.domain.Order;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderRepository {

    private final EntityManager em;

    public void save(Order order) {
        em.persist(order);
    }

    public Order findOne(Long id) {
        return em.find(Order.class, id);
    }


    /*public List<Order> findAll() {
        return em.createQuery("select o from Order o")
    }*/
}

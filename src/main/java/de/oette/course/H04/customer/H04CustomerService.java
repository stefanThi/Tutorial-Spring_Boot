package de.oette.course.H04.customer;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
public class H04CustomerService {

    @PersistenceContext
    private EntityManager entityManager;
    private final ApplicationEventPublisher applicationEventPublisher;

    public H04CustomerService(EntityManager entityManager, ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
        this.entityManager = entityManager;
    }

    @Transactional
    public void createCustomer() {
        H04Customer customer = new H04Customer();
        entityManager.persist(customer);
        applicationEventPublisher.publishEvent(new CustomerCreatedEvent(this, customer));
    }
}

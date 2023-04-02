package de.oette.course.C02;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
public class PersistDemoComponent {

    @PersistenceContext
    private EntityManager entityManager;

    private int count = 1;

    @Transactional
    public void persistEntity() {
        entityManager.persist(new DemoEntityWithName());
        if (count % 3 == 0) {
            throw new RuntimeException("Boom");
        }
        count++;
    }
}

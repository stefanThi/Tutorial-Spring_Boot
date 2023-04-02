package de.oette.course.C01;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.metamodel.EntityType;
import java.util.Set;
import java.util.function.DoubleToIntFunction;

@Component
public class PersistenceContextDemoComponent {

    @PersistenceContext
    private EntityManager entityManager;

    @EventListener(ApplicationReadyEvent.class)
    public void onStartup() {
        Set<EntityType<?>> registeredEntities = entityManager.getMetamodel().getEntities();
        if(registeredEntities.isEmpty()){
            System.out.println("no entities registered yet");
        }else{
            registeredEntities.stream().forEach(this::log);
        }
    }

    private void log(EntityType<?> entityType) {
        System.out.println(entityType.getName() + " is registered at persistence context");
    }
}

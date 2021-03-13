package ch.l0r5.userservice.persistence;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.EntityType;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class UserServicePersistenceContext {

    @javax.persistence.PersistenceContext
    private EntityManager entityManager;

    @EventListener(ApplicationReadyEvent.class)
    public void onStartup() {
        Set<EntityType<?>> registeredEntities = entityManager.getMetamodel().getEntities();
        if (registeredEntities.isEmpty()) {
            log.info("No entities registered yet.");
        }
        registeredEntities.forEach(entityType -> log.info("{} entity is registered at persistence context.", entityType));
    }
}


package ch.l0r5.userservice.persistence;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import ch.l0r5.userservice.models.User;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class UserServicePersistenceContext {

    @PersistenceContext
    private EntityManager entityManager;

    @EventListener(ApplicationReadyEvent.class)
    @Transactional
    public void initialLoad() {
        entityManager.persist(User.builder().username("DonaldDuck").build());
        entityManager.persist(User.builder().username("DaisyDuck").build());
        entityManager.persist(User.builder().username("DagobertDuck").build());
    }
}


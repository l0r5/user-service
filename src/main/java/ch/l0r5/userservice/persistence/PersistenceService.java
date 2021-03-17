package ch.l0r5.userservice.persistence;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import ch.l0r5.userservice.models.User;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PersistenceService {

    @PersistenceContext
    private EntityManager entityManager;

    @EventListener(ApplicationReadyEvent.class)
    @Transactional
    public void initialLoad() {
        entityManager.persist(User.builder().username("DonaldDuck").build());
        entityManager.persist(User.builder().username("DaisyDuck").build());
        entityManager.persist(User.builder().username("DagobertDuck").build());
    }

    public List<User> getAllUsers() {
        String queryString = "select allUsers from User allUsers";
        TypedQuery<User> query = entityManager.createQuery(queryString, User.class);
        return query.getResultList();
    }
}


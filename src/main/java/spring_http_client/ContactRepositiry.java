package spring_http_client;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContactRepositiry extends CrudRepository<Contact, Long> {
    List<Contact> findByFirstName(String firstName);
}

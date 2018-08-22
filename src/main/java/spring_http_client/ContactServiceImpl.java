package spring_http_client;


import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("contactService")
@Repository
@Transactional
public class ContactServiceImpl implements ContactService {
    @Autowired
    ContactRepositiry contactRepositiry;

    @Transactional(readOnly = true)
    public List<Contact> findAll() {
        return Lists.newArrayList(contactRepositiry.findAll());
    }
    @Transactional(readOnly = true)
    public List<Contact> findByFirstName(String firstName) {
        return contactRepositiry.findByFirstName(firstName);
    }
    @Transactional(readOnly = true)
    public Contact findById(Long id) {
        return contactRepositiry.findOne(id);
    }
    @Transactional(readOnly = true)
    public Contact save(Contact contact) {
        return contactRepositiry.save(contact);
    }
    @Transactional(readOnly = true)
    public void delete(Contact contact) {
        contactRepositiry.delete(contact);
    }
}

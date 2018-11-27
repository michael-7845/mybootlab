package mybootlab.controller;

import mybootlab.model.Customer;
import mybootlab.model.Greeting;
import mybootlab.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @GetMapping(value = "/customers", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Customer> findCustomers(@RequestParam(required = false) final String firstName,
                                        @RequestParam(required = false) final String lastName) {
        if((firstName != null) && (lastName != null)) {
            return repository.findByFirstNameAndLastName(firstName, lastName);
        } else if(firstName != null) {
            return repository.findByFirstName(firstName);
        } else if(lastName != null) {
            return repository.findByLastName(lastName);
        } else {
            return repository.findAllCustomers();
        }
    }

    @RequestMapping(value="/customers/{id}", method=RequestMethod.GET)
    Optional<Customer> getCustomerById(@PathVariable Long id) {
        return repository.findById(id);
    }

}

//    @GetMapping(value = "/customers", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    public Iterable<Customer> findCustomers() {
//        return repository.findAll();
//    }
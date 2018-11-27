package mybootlab.repository;

import mybootlab.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    @Query("from Customer c")
    List<Customer> findAllCustomers();

    List<Customer> findByLastName(String lastName);

    List<Customer> findByFirstName(String firstName);

    List<Customer> findByFirstNameAndLastName(String firstName, String lastName);
}

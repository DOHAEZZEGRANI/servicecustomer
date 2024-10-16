package org.xproce.customerservice.Dao.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.customerservice.Dao.Entities.Customer;


public interface CustomerRepository extends JpaRepository<Customer,Long> {


}
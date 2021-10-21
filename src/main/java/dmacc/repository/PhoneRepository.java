package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Phone;

/**
 * @author booth - gboothroyd@dmacc.edu
 *CIS175 - Fall 2021
 * Oct 19, 2021
 */

@Repository
public interface PhoneRepository  extends JpaRepository<Phone, Long> { } 



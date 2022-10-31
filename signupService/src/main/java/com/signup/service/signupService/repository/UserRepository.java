package com.signup.service.signupService.repository;

import com.signup.service.signupService.model.User;
import com.sun.corba.se.spi.ior.ObjectId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, ObjectId> {

}

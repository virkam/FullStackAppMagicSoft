package com.magicsoft.usersservice.repository;

import com.magicsoft.usersservice.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, String>{ 

}

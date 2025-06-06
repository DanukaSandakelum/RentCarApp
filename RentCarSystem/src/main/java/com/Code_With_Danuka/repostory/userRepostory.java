package com.Code_With_Danuka.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.Code_With_Danuka.entity.User;

@Repository

public interface userRepostory extends JpaRepository<User, Long> {
    // This interface will automatically provide CRUD operations for the user entity
    // Additional custom query methods can be defined here if needed 

}

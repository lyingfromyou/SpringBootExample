package com.lying.examplejpa.report;

import com.lying.examplejpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);

    @Query(value = "from User u where u.name = :name")
    User findUser(@Param("name") String name);
}

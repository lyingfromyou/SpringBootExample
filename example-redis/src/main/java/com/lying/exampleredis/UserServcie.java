package com.lying.exampleredis;

import com.lying.exampleredis.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserServcie extends JpaRepository<User, Long> {
}

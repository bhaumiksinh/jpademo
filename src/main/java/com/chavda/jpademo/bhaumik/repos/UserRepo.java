package com.chavda.jpademo.bhaumik.repos;

import com.chavda.jpademo.bhaumik.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}

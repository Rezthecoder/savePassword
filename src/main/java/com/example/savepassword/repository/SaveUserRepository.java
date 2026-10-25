package com.example.savepassword.repository;

import com.example.savepassword.entity.SaveUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveUserRepository extends JpaRepository<SaveUser,Long> {
}

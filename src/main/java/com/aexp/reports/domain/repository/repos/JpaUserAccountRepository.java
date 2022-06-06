package com.aexp.reports.domain.repository.repos;

import com.aexp.reports.domain.repository.entities.UserAccountEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface JpaUserAccountRepository extends JpaRepository<UserAccountEntity, Long> {
}

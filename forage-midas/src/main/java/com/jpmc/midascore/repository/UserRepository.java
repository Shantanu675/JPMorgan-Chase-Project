package com.jpmc.midascore.repository;

import com.jpmc.midascore.entity.UserRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserRecord, Long> {
    UserRecord findById(long id);

    UserRecord findByName(String name);
}


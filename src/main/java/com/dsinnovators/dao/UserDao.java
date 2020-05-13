package com.dsinnovators.dao;

import com.dsinnovators.model.DemoUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by A.A.MAMUN on 5/12/2020.
 */
@Transactional
public interface UserDao extends CrudRepository<DemoUser, String> {

    @Query("select u.password from DemoUser u where u.email=?1")
    String findUserPasswordByEmail(String email);
}

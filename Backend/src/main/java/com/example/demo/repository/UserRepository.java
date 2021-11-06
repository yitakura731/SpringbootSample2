package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.data.BaseUser;

@Repository
public interface UserRepository extends CrudRepository<BaseUser,Long>{

    public BaseUser findByUserId(String userId) throws Exception;

    public List<BaseUser> findByIdNot(Long userId) throws Exception;

}

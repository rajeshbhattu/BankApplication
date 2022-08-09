package com.ojas.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ojas.entities.AccountEntity;
@Repository
public interface AccountRepo extends JpaRepository<AccountEntity,Integer>{
public Optional<AccountEntity> findByUsername(String uname);

@Query(value="select * from account  where id=?1 and transactionid=?2",nativeQuery=true)
public Optional<AccountEntity> findByUserid(Integer id,Integer transid);
}

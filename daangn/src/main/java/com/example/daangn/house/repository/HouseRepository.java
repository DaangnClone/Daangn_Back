package com.example.daangn.house.repository;

import com.example.daangn.house.domain.House;
import com.example.daangn.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HouseRepository extends JpaRepository<House, Long> {


}

package com.exmple.dao;

import com.exmple.entity.Socks;
import org.springframework.data.repository.CrudRepository;

public interface SocksRepository extends CrudRepository<Socks, Integer> {
}

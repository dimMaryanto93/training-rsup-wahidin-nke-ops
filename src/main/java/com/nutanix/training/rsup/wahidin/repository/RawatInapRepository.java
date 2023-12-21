package com.nutanix.training.rsup.wahidin.repository;

import com.nutanix.training.rsup.wahidin.model.RawatInap;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RawatInapRepository extends CrudRepository<RawatInap, String> {

    public List<RawatInap> findAll();
}

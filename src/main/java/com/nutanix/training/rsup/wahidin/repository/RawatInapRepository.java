package com.nutanix.training.rsup.wahidin.repository;

import com.nutanix.training.rsup.wahidin.model.RawatInap;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public interface RawatInapRepository extends CrudRepository<RawatInap, String> {

    public List<RawatInap> findAll();
}

package com.nutanix.training.rsup.wahidin.repository;

import com.nutanix.training.rsup.wahidin.model.RawatInap;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class RawatInapRepository {

    public List<RawatInap> findAll() {
        List<RawatInap> list = new ArrayList<>();
        list.add(new RawatInap(UUID.randomUUID().toString(), "Dimas Maryanto", 100, LocalDate.now(), null));
        return list;
    }
}

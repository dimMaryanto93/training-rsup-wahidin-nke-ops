package com.nutanix.training.rsup.wahidin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RawatInap {

    private String id;
    private String namaPasien;
    private Integer noRuangan;
    private LocalDate tanggalMasuk;
    private LocalDate tanggalKeluar;
}

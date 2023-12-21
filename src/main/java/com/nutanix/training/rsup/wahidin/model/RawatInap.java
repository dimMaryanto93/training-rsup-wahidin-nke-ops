package com.nutanix.training.rsup.wahidin.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "rawat_inap")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RawatInap {

    @Id
    private String id;
    @Column(name = "nama_pasien")
    private String namaPasien;
    @Column(name = "no_ruangan")
    private Integer noRuangan;
    @Column(name = "tgl_masuk")
    private LocalDate tanggalMasuk;
    @Column(name = "tgl_keluar")
    private LocalDate tanggalKeluar;
}

create table rawat_inap
(
    id          character varying(64) primary key,
    nama_pasien character varying(100) not null,
    no_ruangan  integer                         default 1,
    tgl_masuk   date                   not null default now(),
    tgl_keluar  date
);

insert into rawat_inap(id, nama_pasien, no_ruangan, tgl_masuk, tgl_keluar)
values ('01', 'Dimas Maryanto', 12, now(), null);
package com.jsc.model;

public class DaftarRsRujukan {

    private String nama_rumah_sakit;
    private String alamat;
    private String kota_madya;
    private String kelurahan;
    private String kecamatan;

    public String getNama_rumah_sakit() {
        return nama_rumah_sakit;
    }

    public void setNama_rumah_sakit(String nama_rumah_sakit) {
        this.nama_rumah_sakit = nama_rumah_sakit;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKota_madya() {
        return kota_madya;
    }

    public void setKota_madya(String kota_madya) {
        this.kota_madya = kota_madya;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("DaftarRsRujukan{");
        sb.append("nama_rumah_sakit='").append(nama_rumah_sakit).append('\'');
        sb.append("alamat='").append(alamat).append('\'');
        sb.append("kota_madya='").append(kota_madya).append('\'');
        sb.append("kelurahan='").append(kelurahan).append('\'');
        sb.append("kecamatan='").append(kecamatan);
        sb.append('}');
        return sb.toString();
    }
}

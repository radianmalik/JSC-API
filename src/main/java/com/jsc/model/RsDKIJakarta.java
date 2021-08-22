package com.jsc.model;

public class RsDKIJakarta {

    private String nama_rumah_sakit;
    private String jenis_rumah_sakit;
    private String alamat_rumah_sakit;
    private String kelurahan;
    private String kecamatan;
    private String kota_or_kab_administrasi;
    private Integer kode_pos;
    private String nomor_telepon;
    private String nomor_fax;
    private Integer no_hp_direktur_or_kepala_rs;
    private String website;
    private String email;

    public String getNama_rumah_sakit() {
        return nama_rumah_sakit;
    }

    public void setNama_rumah_sakit(String nama_rumah_sakit) {
        this.nama_rumah_sakit = nama_rumah_sakit;
    }

    public String getJenis_rumah_sakit() {
        return jenis_rumah_sakit;
    }

    public void setJenis_rumah_sakit(String jenis_rumah_sakit) {
        this.jenis_rumah_sakit = jenis_rumah_sakit;
    }

    public String getAlamat_rumah_sakit() {
        return alamat_rumah_sakit;
    }

    public void setAlamat_rumah_sakit(String alamat_rumah_sakit) {
        this.alamat_rumah_sakit = alamat_rumah_sakit;
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

    public String getKota_or_kab_administrasi() {
        return kota_or_kab_administrasi;
    }

    public void setKota_or_kab_administrasi(String kota_or_kab_administrasi) {
        this.kota_or_kab_administrasi = kota_or_kab_administrasi;
    }

    public Integer getKode_pos() {
        return kode_pos;
    }

    public void setKode_pos(Integer kode_pos) {
        this.kode_pos = kode_pos;
    }

    public String getNomor_telepon() {
        return nomor_telepon;
    }

    public void setNomor_telepon(String nomor_telepon) {
        this.nomor_telepon = nomor_telepon;
    }

    public String getNomor_fax() {
        return nomor_fax;
    }

    public void setNomor_fax(String nomor_fax) {
        this.nomor_fax = nomor_fax;
    }

    public Integer getNo_hp_direktur_or_kepala_rs() {
        return no_hp_direktur_or_kepala_rs;
    }

    public void setNo_hp_direktur_or_kepala_rs(Integer no_hp_direktur_or_kepala_rs) {
        this.no_hp_direktur_or_kepala_rs = no_hp_direktur_or_kepala_rs;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("RsDKIJakarta{");
        sb.append("nama_rumah_sakit='").append(nama_rumah_sakit).append('\'');
        sb.append("jenis_rumah_sakit='").append(jenis_rumah_sakit).append('\'');
        sb.append("alamat_rumah_sakit='").append(alamat_rumah_sakit).append('\'');
        sb.append("kelurahan='").append(kelurahan).append('\'');
        sb.append("kecamatan='").append(kecamatan);
        sb.append("kota_or_kab_administrasi='").append(kota_or_kab_administrasi);
        sb.append("kode_pos='").append(kode_pos);
        sb.append("nomor_telepon='").append(nomor_telepon);
        sb.append("nomor_fax='").append(nomor_fax);
        sb.append("no_hp_direktur_or_kepala_rs='").append(no_hp_direktur_or_kepala_rs);
        sb.append("website='").append(website);
        sb.append("email='").append(email);
        sb.append('}');
        return sb.toString();
    }
}

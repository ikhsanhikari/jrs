/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phrmc.dto;

/**
 *
 * @author premium
 */
public class PersediaanDto {
 
    String id,kode,nama,harga_beli,harga_jual,tgl_kadaluarsa,jumlah,ket;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga_beli() {
        return harga_beli;
    }

    public void setHarga_beli(String harga_beli) {
        this.harga_beli = harga_beli;
    }

    public String getHarga_jual() {
        return harga_jual;
    }

    public void setHarga_jual(String harga_jual) {
        this.harga_jual = harga_jual;
    }

    public String getTgl_kadaluarsa() {
        return tgl_kadaluarsa;
    }

    public void setTgl_kadaluarsa(String tgl_kadaluarsa) {
        this.tgl_kadaluarsa = tgl_kadaluarsa;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getKet() {
        return ket;
    }

    public void setKet(String ket) {
        this.ket = ket;
    }
}


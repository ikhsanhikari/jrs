
package phrmc.model;

import phrmc.dto.*;




public class PembelianModel {
    String kode,id,name;
    String id_supplier;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    double jumlah,harga,tot;

    public double getTot() {
        return tot;
    }

    public void setTot(double tot) {
        this.tot = tot;
    }
    String tgl;

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(String id_supplier) {
        this.id_supplier = id_supplier;
    }

    

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    
}
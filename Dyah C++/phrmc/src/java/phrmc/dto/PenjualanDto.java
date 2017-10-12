
package phrmc.dto;



public class PenjualanDto {
    String kode;
    String id_user;
    String id_obat;
    double jumlah,harga,tot;

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    String tgl;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getId_obat() {
        return id_obat;
    }

    public void setId_obat(String id_obat) {
        this.id_obat = id_obat;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public double getTot() {
        return tot;
    }

    public void setTot(double tot) {
        this.tot = tot;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }
}

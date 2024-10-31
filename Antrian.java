package PACKAGE_NAME;

class Antrian extends Node {
    private String nama = "";
    private int jumlah = 0;
    private String kartu = "";
    private int posisi = -1;

    public Antrian(String nama, int jumlah, String kartu) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.kartu = kartu;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return this.jumlah;
    }

    public void setKartu(String kartu) {
        this.kartu = kartu;
    }

    public String getKartu() {
        return this.kartu;
    }

    public void setPosisi(int posisi) {
        this.posisi = posisi;
    }

    public int getPosisi() {
        return this.posisi;
    }

    @Override
    public String getData() {
        return "Nama: " + this.nama + "\n" +
                "Antrian ke: " + this.posisi + "\n" +
                "Jumlah Buku: " + this.jumlah + "\n" +
                "Kartu Spesial: " + this.kartu;
    }
}
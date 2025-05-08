//Saya Rafly Putra Santoso NIM 2100846 mengerjakan UTSDPBO
//dalam mata kuliah Desain Pemrograman Berorientasi Objek
//untuk keberkahanNya maka saya tidak melakukan
//kecurangan seperti yang telah dispesifikasikan
public class Employee {
    protected String noKTP;
    protected String nama;
    protected String alamat;
    protected double gajiPerBulan;

    public Employee(String noKTP, String nama, String alamat, double gajiPerBulan) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.alamat = alamat;
        this.gajiPerBulan = gajiPerBulan;
    }

    public String getNoKTP() { return noKTP; }
    public String getNama() { return nama; }
    public String getAlamat() { return alamat; }
    public double getGajiPerBulan() { return gajiPerBulan; }

    public void displayInfo() {
        System.out.println("- No KTP: " + noKTP);
        System.out.println("  Nama: " + nama);
        System.out.println("  Alamat: " + alamat);
        System.out.println("  Gaji: Rp" + gajiPerBulan);
    }
}
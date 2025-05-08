//Saya Rafly Putra Santoso NIM 2100846 mengerjakan UTSDPBO
//dalam mata kuliah Desain Pemrograman Berorientasi Objek
//untuk keberkahanNya maka saya tidak melakukan
//kecurangan seperti yang telah dispesifikasikan
public class Chef extends Employee {
    private Restaurant tempatBekerja;

    public Chef(String noKTP, String nama, String alamat, double gajiPerBulan, Restaurant tempatBekerja) {
        super(noKTP, nama, alamat, gajiPerBulan);
        this.tempatBekerja = tempatBekerja;
    }

    public Restaurant getTempatBekerja() { return tempatBekerja; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Posisi: Chef");
        System.out.println("  Bekerja di: " + tempatBekerja.getNama());
    }
}
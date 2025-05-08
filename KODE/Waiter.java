//Saya Rafly Putra Santoso NIM 2100846 mengerjakan UTSDPBO
//dalam mata kuliah Desain Pemrograman Berorientasi Objek
//untuk keberkahanNya maka saya tidak melakukan
//kecurangan seperti yang telah dispesifikasikan
public class Waiter extends Employee {
    private Company tempatBekerja;

    public Waiter(String noKTP, String nama, String alamat, double gajiPerBulan, Company tempatBekerja) {
        super(noKTP, nama, alamat, gajiPerBulan);
        this.tempatBekerja = tempatBekerja;
    }

    public Company getTempatBekerja() { return tempatBekerja; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Posisi: Waiter");
        System.out.println("  Bekerja di: " + tempatBekerja.getNama());
    }
}
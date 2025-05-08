//Saya Rafly Putra Santoso NIM 2100846 mengerjakan UTSDPBO
//dalam mata kuliah Desain Pemrograman Berorientasi Objek
//untuk keberkahanNya maka saya tidak melakukan
//kecurangan seperti yang telah dispesifikasikan
public abstract class Company {
    protected String kode;
    protected String nama;
    protected String perusahaanPemilik;
    protected int tahunBerdiri;
    protected Employee[] karyawan;

    public Company(String kode, String nama, String perusahaanPemilik, int tahunBerdiri, int maxKaryawan) {
        this.kode = kode;
        this.nama = nama;
        this.perusahaanPemilik = perusahaanPemilik;
        this.tahunBerdiri = tahunBerdiri;
        this.karyawan = new Employee[maxKaryawan];
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public String getPerusahaanPemilik() { return perusahaanPemilik; }
    public int getTahunBerdiri() { return tahunBerdiri; }
    public Employee[] getKaryawan() { return karyawan; }

    public void addKaryawan(Employee karyawan, int index) {
        if (index >= 0 && index < this.karyawan.length) {
            this.karyawan[index] = karyawan;
        }
    }

    public abstract void displayInfo();
}
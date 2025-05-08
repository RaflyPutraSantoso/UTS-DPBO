//Saya Rafly Putra Santoso NIM 2100846 mengerjakan UTSDPBO
//dalam mata kuliah Desain Pemrograman Berorientasi Objek
//untuk keberkahanNya maka saya tidak melakukan
//kecurangan seperti yang telah dispesifikasikan
public class Restaurant extends Company {
    private String kategori;
    private Menu[] menus;

    public Restaurant(String kode, String nama, String perusahaanPemilik, int tahunBerdiri, String kategori, int maxKaryawan, int maxMenus) {
        super(kode, nama, perusahaanPemilik, tahunBerdiri, maxKaryawan);
        this.kategori = kategori;
        this.menus = new Menu[maxMenus];
    }

    public String getKategori() { return kategori; }
    public Menu[] getMenus() { return menus; }

    public void addMenu(Menu menu, int index) {
        if (index >= 0 && index < menus.length) {
            menus[index] = menu;
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("\n=== INFO RESTORAN ===");
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Pemilik: " + perusahaanPemilik);
        System.out.println("Tahun Berdiri: " + tahunBerdiri);
        System.out.println("Kategori: " + kategori);
        
        System.out.println("\nDaftar Menu:");
        for (Menu menu : menus) {
            if (menu != null) {
                menu.displayInfo();
            }
        }
        
        System.out.println("\nDaftar Karyawan:");
        for (Employee emp : karyawan) {
            if (emp != null) {
                emp.displayInfo();
            }
        }
    }

    public class Menu {
        private String id;
        private String nama;
        private String bahanUtama;
        private String asalMenu;

        public Menu(String id, String nama, String bahanUtama, String asalMenu) {
            this.id = id;
            this.nama = nama;
            this.bahanUtama = bahanUtama;
            this.asalMenu = asalMenu;
        }

        public String getId() { return id; }
        public String getNama() { return nama; }
        public String getBahanUtama() { return bahanUtama; }
        public String getAsalMenu() { return asalMenu; }

        public void displayInfo() {
            System.out.println("- ID: " + id);
            System.out.println("  Nama: " + nama);
            System.out.println("  Bahan Utama: " + bahanUtama);
            System.out.println("  Asal: " + asalMenu);
        }
    }
}
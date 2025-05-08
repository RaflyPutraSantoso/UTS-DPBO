//Saya Rafly Putra Santoso NIM 2100846 mengerjakan UTSDPBO
//dalam mata kuliah Desain Pemrograman Berorientasi Objek
//untuk keberkahanNya maka saya tidak melakukan
//kecurangan seperti yang telah dispesifikasikan
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

    // Getter methods
    public String getId() { return id; }
    public String getNama() { return nama; }
    public String getBahanUtama() { return bahanUtama; }
    public String getAsalMenu() { return asalMenu; }

    public void displayInfo() {
        System.out.println("Menu: " + nama + " (" + id + ")");
        System.out.println("Bahan: " + bahanUtama);
        System.out.println("Asal: " + asalMenu);
    }
}
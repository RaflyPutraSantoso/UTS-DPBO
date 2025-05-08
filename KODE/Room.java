//Saya Rafly Putra Santoso NIM 2100846 mengerjakan UTSDPBO
//dalam mata kuliah Desain Pemrograman Berorientasi Objek
//untuk keberkahanNya maka saya tidak melakukan
//kecurangan seperti yang telah dispesifikasikan
public class Room {
    private String id;
    private String nama;
    private int kapasitas;
    private String fasilitas;
    private boolean isKamar;

    public Room(String id, String nama, int kapasitas, String fasilitas, boolean isKamar) {
        this.id = id;
        this.nama = nama;
        this.kapasitas = kapasitas;
        this.fasilitas = fasilitas;
        this.isKamar = isKamar;
    }

    // Getter methods
    public String getId() { return id; }
    public String getNama() { return nama; }
    public int getKapasitas() { return kapasitas; }
    public String getFasilitas() { return fasilitas; }
    public boolean isKamar() { return isKamar; }

    public void displayInfo() {
        System.out.println("Room: " + nama + " (" + id + ")");
        System.out.println("Tipe: " + (isKamar ? "Kamar" : "Ruang Meeting"));
        System.out.println("Fasilitas: " + fasilitas);
    }
}
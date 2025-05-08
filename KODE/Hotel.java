//Saya Rafly Putra Santoso NIM 2100846 mengerjakan UTSDPBO
//dalam mata kuliah Desain Pemrograman Berorientasi Objek
//untuk keberkahanNya maka saya tidak melakukan
//kecurangan seperti yang telah dispesifikasikan
public class Hotel extends Company {
    private int level;
    private Room[] rooms;

    public Hotel(String kode, String nama, String perusahaanPemilik, int tahunBerdiri, int level, int maxKaryawan, int maxRooms) {
        super(kode, nama, perusahaanPemilik, tahunBerdiri, maxKaryawan);
        this.level = level;
        this.rooms = new Room[maxRooms];
    }

    public int getLevel() { return level; }
    public Room[] getRooms() { return rooms; }

    public void addRoom(Room room, int index) {
        if (index >= 0 && index < rooms.length) {
            rooms[index] = room;
        }
    }

    @Override
public void displayInfo() {
    System.out.println("\n=== INFO HOTEL ===");
    System.out.println("Kode: " + kode);
    System.out.println("Nama: " + nama);
    System.out.println("Pemilik: " + perusahaanPemilik);
    System.out.println("Tahun Berdiri: " + tahunBerdiri);
    System.out.println("Bintang: " + level);
    
    // Count actual employees (not null)
    int jumlahKaryawan = 0;
    for (Employee emp : karyawan) {
        if (emp != null) {
            jumlahKaryawan++;
        }
    }
    System.out.println("Jumlah Karyawan: " + jumlahKaryawan);
    
    System.out.println("\nDaftar Kamar:");
    for (Room room : rooms) {
        if (room != null) {
            room.displayInfo();
        }
    }
    
    System.out.println("\nDaftar Karyawan:");
    for (Employee emp : karyawan) {
        if (emp != null) {
            emp.displayInfo();
        }
    }
}

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

        public String getId() { return id; }
        public String getNama() { return nama; }
        public int getKapasitas() { return kapasitas; }
        public String getFasilitas() { return fasilitas; }
        public boolean isKamar() { return isKamar; }

        public void displayInfo() {
            System.out.println("- ID: " + id);
            System.out.println("  Nama: " + nama);
            System.out.println("  Kapasitas: " + kapasitas + " orang");
            System.out.println("  Fasilitas: " + fasilitas);
            System.out.println("  Tipe: " + (isKamar ? "Kamar" : "Ruang Meeting"));
        }
    }
}
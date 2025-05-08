//Saya Rafly Putra Santoso NIM 2100846 mengerjakan UTSDPBO
//dalam mata kuliah Desain Pemrograman Berorientasi Objek
//untuk keberkahanNya maka saya tidak melakukan
//kecurangan seperti yang telah dispesifikasikan

import java.util.Scanner;

public class Main {
    private static Hotel[] hotels = new Hotel[10];
    private static Restaurant[] restaurants = new Restaurant[10];
    private static int hotelCount = 0;
    private static int restaurantCount = 0;

    public static void main(String[] args) {
        initializeSampleData();
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n=== SISTEM MANAJEMEN HOTEL & RESTORAN ===");
            System.out.println("1. Tampilkan Semua Data");
            System.out.println("2. Cari Hotel");
            System.out.println("3. Cari Restoran");
            System.out.println("4. Cari Karyawan");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch(choice) {
                case 1:
                    displayAllData();
                    break;
                case 2:
                    searchHotels(scanner);
                    break;
                case 3:
                    searchRestaurants(scanner);
                    break;
                case 4:
                    searchEmployees(scanner);
                    break;
                case 0:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while(choice != 0);
        
        scanner.close();
    }

    private static void initializeSampleData() {
        // ================== HOTELS ==================
        
        // 1. The Ritz-Carlton Jakarta (Pacific Place)
        Hotel hotel1 = new Hotel("HTL001", "The Ritz-Carlton Jakarta", "PT Marriott International", 2005, 5, 8, 6);
        hotel1.addRoom(hotel1.new Room("R001", "Club Executive Suite", 2, "AC, TV, Minibar, Lounge Access, Free WiFi", true), 0);
        hotel1.addRoom(hotel1.new Room("R002", "Presidential Suite", 4, "AC, TV, Kitchen, Dining Room, 2 Bathrooms", true), 1);
        hotel1.addRoom(hotel1.new Room("R003", "Grand Ballroom", 1000, "Stage, Sound System, LED Lighting", false), 2);
        // Employees
        hotel1.addKaryawan(new Waiter("3276010111", "Budi Santoso", "Jl. DR. Ide Anak Agung Gde Agung No.1", 6500000, hotel1), 0);
        hotel1.addKaryawan(new Waiter("3276010222", "Agus Wijaya", "Jl. Sudirman Kav 52-53", 8500000, hotel1), 1);
        hotel1.addKaryawan(new Waiter("3276010333", "Ani Rahayu", "Jl. Gatot Subroto No.23", 6000000, hotel1), 2);
        hotels[hotelCount++] = hotel1;
    
        // 2. Hotel Indonesia Kempinski Jakarta
        Hotel hotel2 = new Hotel("HTL002", "Hotel Indonesia Kempinski", "PT Kempinski Indonesia", 1962, 5, 10, 5);
        hotel2.addRoom(hotel2.new Room("R101", "Deluxe Room", 2, "AC, TV, Coffee Machine, City View", true), 0);
        hotel2.addRoom(hotel2.new Room("R102", "Kempinski Suite", 3, "AC, TV, Living Area, Butler Service", true), 1);
        hotel2.addRoom(hotel2.new Room("R103", "Boardroom", 20, "Projector, Conference Table, Catering", false), 2);
        // Employees
        hotel2.addKaryawan(new Waiter("3276020333", "Dewi Lestari", "Jl. MH Thamrin No.1", 6000000, hotel2), 0);
        hotel2.addKaryawan(new Waiter("3276020444", "Hendra Gunawan", "Jl. Kebon Sirih No.17", 8000000, hotel2), 1);
        hotel2.addKaryawan(new Waiter("3276020555", "Fajar Setiawan", "Jl. Jend. Sudirman No.45", 5800000, hotel2), 2);
        hotels[hotelCount++] = hotel2;
    
        // 3. Ayana Midplaza Jakarta
        Hotel hotel3 = new Hotel("HTL003", "Ayana Midplaza Jakarta", "PT Ayana Hospitality", 1992, 4, 6, 4);
        hotel3.addRoom(hotel3.new Room("R201", "Premier Room", 2, "AC, TV, Work Desk, Bathtub", true), 0);
        hotel3.addRoom(hotel3.new Room("R202", "Executive Suite", 3, "AC, TV, Lounge Access, Kitchenette", true), 1);
        // Employees
        hotel3.addKaryawan(new Waiter("3276030555", "Citra Dewi", "Jl. Jend. Sudirman Kav. 10-11", 5000000, hotel3), 0);
        hotel3.addKaryawan(new Waiter("3276030666", "Bambang Sutrisno", "Jl. MH Thamrin No.30", 7500000, hotel3), 1);
        hotel3.addKaryawan(new Waiter("3276030777", "Rina Amelia", "Jl. Gatot Subroto No.12", 5200000, hotel3), 2);
        hotels[hotelCount++] = hotel3;
    
        // ================== RESTAURANTS ==================
        
        // 1. Nusa Indonesian Gastronomy
        Restaurant resto1 = new Restaurant("RST001", "Nusa Indonesian Gastronomy", "PT Nusa Kuliner", 2018, "Indonesian", 5, 8);
        resto1.addMenu(resto1.new Menu("M001", "Nasi Campur Bali", "Rice, Chicken, Vegetables, Sambal", "Bali"), 0);
        resto1.addMenu(resto1.new Menu("M002", "Rendang Wagyu", "Beef, Coconut Milk, Spices", "West Sumatra"), 1);
        resto1.addKaryawan(new Chef("3276110111", "Wayan Sudirga", "Jl. Dr. Kusuma Atmaja No.77", 9000000, resto1), 0);
        resto1.addKaryawan(new Waiter("3276110222", "Putri Ayu", "Jl. Kebon Sirih No.41", 4500000, resto1), 1);
        restaurants[restaurantCount++] = resto1;
    
        // 2. SKYE Bar & Restaurant
        Restaurant resto2 = new Restaurant("RST002", "SKYE Bar & Restaurant", "PT BCA Skye", 2015, "International", 4, 6);
        resto2.addMenu(resto2.new Menu("M101", "Beef Wellington", "Beef Tenderloin, Mushroom, Puff Pastry", "England"), 0);
        resto2.addMenu(resto2.new Menu("M102", "Truffle Pasta", "Pasta, Truffle, Cream Sauce", "Italy"), 1);
        resto2.addKaryawan(new Chef("3276220333", "Andrea Rossi", "Jl. MH Thamrin No.1", 10000000, resto2), 0);
        restaurants[restaurantCount++] = resto2;
    
        // 3. Sate Khas Senayan
        Restaurant resto3 = new Restaurant("RST003", "Sate Khas Senayan", "PT Senayan Trijaya", 1985, "Indonesian", 3, 5);
        resto3.addMenu(resto3.new Menu("M201", "Sate Ayam", "Chicken, Peanut Sauce", "Java"), 0);
        resto3.addMenu(resto3.new Menu("M202", "Gado-Gado", "Vegetables, Peanut Sauce, Tofu", "Jakarta"), 1);
        resto3.addKaryawan(new Chef("3276330444", "Joko Susanto", "Jl. Senayan No.31", 6500000, resto3), 0);
        restaurants[restaurantCount++] = resto3;
    }
    private static void displayAllData() {
        System.out.println("\n=== DATA HOTEL ===");
        for (int i = 0; i < hotelCount; i++) {
            hotels[i].displayInfo();
        }

        System.out.println("\n=== DATA RESTORAN ===");
        for (int i = 0; i < restaurantCount; i++) {
            restaurants[i].displayInfo();
        }
    }

    private static void searchHotels(Scanner scanner) {
        System.out.print("Masukkan nama hotel: ");
        String keyword = scanner.nextLine();
        
        Hotel[] results = SearchService.searchHotelsByName(hotels, keyword);
        
        if (results.length > 0) {
            System.out.println("\nHasil Pencarian:");
            for (Hotel hotel : results) {
                hotel.displayInfo();
            }
        } else {
            System.out.println("Hotel tidak ditemukan!");
        }
    }

    private static void searchRestaurants(Scanner scanner) {
        System.out.println("1. Cari berdasarkan nama");
        System.out.println("2. Cari berdasarkan menu");
        System.out.print("Pilihan: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        if (choice == 1) {
            System.out.print("Masukkan nama restoran: ");
            String keyword = scanner.nextLine();
            Restaurant[] results = SearchService.searchRestaurantsByName(restaurants, keyword);
            displayRestaurantResults(results);
        } else if (choice == 2) {
            System.out.print("Masukkan nama menu: ");
            String keyword = scanner.nextLine();
            Restaurant[] results = SearchService.searchRestaurantsByMenu(restaurants, keyword);
            displayRestaurantResults(results);
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }

    private static void displayRestaurantResults(Restaurant[] results) {
        if (results.length > 0) {
            System.out.println("\nHasil Pencarian:");
            for (Restaurant resto : results) {
                resto.displayInfo();
            }
        } else {
            System.out.println("Restoran tidak ditemukan!");
        }
    }

    private static void searchEmployees(Scanner scanner) {
        System.out.print("Masukkan nama karyawan: ");
        String keyword = scanner.nextLine();
        
        // Gabungkan semua perusahaan untuk pencarian
        Company[] allCompanies = new Company[hotelCount + restaurantCount];
        System.arraycopy(hotels, 0, allCompanies, 0, hotelCount);
        System.arraycopy(restaurants, 0, allCompanies, hotelCount, restaurantCount);
        
        Employee[] results = SearchService.searchEmployees(allCompanies, keyword);
        
        if (results.length > 0) {
            System.out.println("\nHasil Pencarian:");
            for (Employee emp : results) {
                emp.displayInfo();
                System.out.println();
            }
        } else {
            System.out.println("Karyawan tidak ditemukan!");
        }
    }
}
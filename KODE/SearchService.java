
//Saya Rafly Putra Santoso NIM 2100846 mengerjakan UTSDPBO
//dalam mata kuliah Desain Pemrograman Berorientasi Objek
//untuk keberkahanNya maka saya tidak melakukan
//kecurangan seperti yang telah dispesifikasikan
public class SearchService {
    public static Hotel[] searchHotelsByName(Hotel[] hotels, String keyword) {
        Hotel[] result = new Hotel[hotels.length];
        int count = 0;
        
        for (Hotel hotel : hotels) {
            if (hotel != null && hotel.getNama().toLowerCase().contains(keyword.toLowerCase())) {
                result[count++] = hotel;
            }
        }
        
        return java.util.Arrays.copyOf(result, count);
    }

    public static Restaurant[] searchRestaurantsByName(Restaurant[] restaurants, String keyword) {
        Restaurant[] result = new Restaurant[restaurants.length];
        int count = 0;
        
        for (Restaurant resto : restaurants) {
            if (resto != null && resto.getNama().toLowerCase().contains(keyword.toLowerCase())) {
                result[count++] = resto;
            }
        }
        
        return java.util.Arrays.copyOf(result, count);
    }

    public static Restaurant[] searchRestaurantsByMenu(Restaurant[] restaurants, String keyword) {
        Restaurant[] result = new Restaurant[restaurants.length];
        int count = 0;
        
        for (Restaurant resto : restaurants) {
            if (resto != null) {
                for (Restaurant.Menu menu : resto.getMenus()) {
                    if (menu != null && menu.getNama().toLowerCase().contains(keyword.toLowerCase())) {
                        result[count++] = resto;
                        break;
                    }
                }
            }
        }
        
        return java.util.Arrays.copyOf(result, count);
    }

    public static Employee[] searchEmployees(Company[] companies, String keyword) {
        Employee[] result = new Employee[100]; // Asumsi max 100 karyawan
        int count = 0;
        
        for (Company company : companies) {
            if (company != null) {
                for (Employee emp : company.getKaryawan()) {
                    if (emp != null && emp.getNama().toLowerCase().contains(keyword.toLowerCase())) {
                        result[count++] = emp;
                    }
                }
            }
        }
        
        return java.util.Arrays.copyOf(result, count);
    }
}
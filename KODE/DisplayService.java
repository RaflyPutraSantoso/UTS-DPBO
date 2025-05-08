//Saya Rafly Putra Santoso NIM 2100846 mengerjakan UTSDPBO
//dalam mata kuliah Desain Pemrograman Berorientasi Objek
//untuk keberkahanNya maka saya tidak melakukan
//kecurangan seperti yang telah dispesifikasikan
public class DisplayService {
    public static void displayAllCompanies(Company[] companies) {
        for (Company company : companies) {
            if (company != null) {
                company.displayInfo();
                System.out.println("----------------------");
            }
        }
    }
}
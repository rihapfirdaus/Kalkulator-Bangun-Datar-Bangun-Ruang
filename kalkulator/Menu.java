package kalkulator;

import java.util.*;

public class Menu {
    Scanner scan = new Scanner(System.in);

    public void menu() {
        System.out.println("=".repeat(50));
        System.out.println(" ".repeat(20) + "Kalkulator");
        System.out.println("=".repeat(50));

        System.out.println("1. Bangun Datar");
        System.out.println("2. Bangun Ruang");
        System.out.println("0. Keluar");
        
        while(true){
            System.out.print("> (1/2/3): ");
            int input = scan.nextInt();
            
            if (input == 1) {
                this.menu("bangun datar");
                break;
            } else if (input == 2) {
                this.menu("bangun ruang");
                break;
            } else if (input == 0){
                System.out.println("=".repeat(50));
                System.out.println(" ".repeat(12)+"Terimakasih.. Good Luck...");
                System.exit(0);
            } else {
                System.out.println("Input salah!! masukkan ulang!!");
            }
        }
    }
    
    public void menu(String objek){
        if (objek.equals("bangun datar")) {
            System.out.println("=".repeat(50));
            System.out.println(" ".repeat(13) + "Kalkulator Bangun Datar");
            System.out.println("=".repeat(50));

            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Jajar Genjang");
            System.out.println("6. Belah Ketupat");
            System.out.println("7. Trapesium");
            System.out.println("8. Layang-layang");
            System.out.println("0. Kembali");
            
            while (true) {
                System.out.print("> (1-8): ");
                int input = scan.nextInt();

                switch (input) {
                    case 1:
                        Persegi persegi = new Persegi();
                        System.out.println("-".repeat(21) + "Persegi" + "-".repeat(22));
                        bangunDatar(persegi);
                        break;
                    case 2:
                        PersegiPanjang persegiPanjang = new PersegiPanjang();
                        System.out.println("-".repeat(17) + "Persegi Panjang" + "-".repeat(18));
                        bangunDatar(persegiPanjang);
                        break;
                    case 3:
                        Segitiga segitiga = new Segitiga();
                        System.out.println("-".repeat(21) + "Segitiga" + "-".repeat(21));
                        bangunDatar(segitiga);
                        break;
                    case 4:
                        Lingkaran lingkaran = new Lingkaran();
                        System.out.println("-".repeat(20) + "Lingkaran" + "-".repeat(21));
                        bangunDatar(lingkaran);
                        break;
                    case 5:
                        JajarGenjang jajarGenjang = new JajarGenjang();
                        System.out.println("-".repeat(18) + "Jajar Genjang" + "-".repeat(19));
                        bangunDatar(jajarGenjang);
                        break;
                    case 6:
                        BelahKetupat belahKetupat = new BelahKetupat();
                        System.out.println("-".repeat(18) + "Belah Ketupat" + "-".repeat(19));
                        bangunDatar(belahKetupat);
                        break;
                    case 7:
                        Trapesium trapesium = new Trapesium();
                        System.out.println("-".repeat(20) + "Trapesium" + "-".repeat(21));
                        bangunDatar(trapesium);
                        break;
                    case 8:
                        LayangLayang layangLayang = new LayangLayang();
                        System.out.println("-".repeat(18) + "Layang Layang" + "-".repeat(19));
                        bangunDatar(layangLayang);
                        break;
                    case 0:
                        this.menu();
                        continue;
                    default:
                        System.out.println("Input salah!! masukkan ulang!!");
                        continue;
                }
                break;
            }
            if (askUser()) {
                this.menu("bangun datar");
            } else {
                System.out.println("=".repeat(50));
                System.out.println(" ".repeat(12)+"Terimakasih.. Good Luck...");
                System.exit(0);
            }
        } else if(objek.equals("bangun ruang")){
            System.out.println("=".repeat(50));
            System.out.println(" ".repeat(13) + "Kalkulator Bangun Ruang");
            System.out.println("=".repeat(50));
            
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Kerucut");
            System.out.println("4. Tabung");
            System.out.println("5. Bola");
            System.out.println("0. Kembali");
            
            while (true) {
                System.out.print("> (1-5): ");
                int input = scan.nextInt();

                switch (input) {
                    case 1:
                        Kubus kubus = new Kubus();
                        System.out.println("-".repeat(22) + "Kubus" + "-".repeat(23));
                        bangunRuang(kubus);
                        break;
                    case 2:
                        Balok balok = new Balok();
                        System.out.println("-".repeat(22) + "Balok" + "-".repeat(23));
                        bangunRuang(balok);
                        break;
                    case 3:
                        Kerucut kerucut = new Kerucut();
                        System.out.println("-".repeat(21) + "Kerucut" + "-".repeat(22));
                        bangunRuang(kerucut);
                        break;
                    case 4:
                        Tabung tabung = new Tabung();
                        System.out.println("-".repeat(22) + "Tabung" + "-".repeat(22));
                        bangunRuang(tabung);
                        break;
                    case 5:
                        Bola bola = new Bola();
                        System.out.println("-".repeat(23) + "Bola" + "-".repeat(23));
                        bangunRuang(bola);
                        break;
                    case 0:
                        this.menu();
                        continue;
                    default:
                        System.out.println("Input salah!! masukkan ulang!!");
                        continue;
                }
                break;
            }
            if (askUser()) {
                this.menu("bangun ruang");
            } else {
                System.out.println("=".repeat(50));
                System.out.println(" ".repeat(12)+"Terimakasih.. Good Luck...");
                System.exit(0);
            }
        }
    }
    
    private void bangunDatar(BangunDatar object) {
        System.out.println("1. Keliling");
        System.out.println("2. Luas");

        while (true) {
            System.out.print("> (1/2): ");
            int user = scan.nextInt();
            switch (user) {
                case 1:
                    System.out.println("Masukkan nilai dalam satuan cm");
                    object.keliling();
                    System.out.println("\nKeliling: " + object.getResult() + " cm");
                    break;
                case 2:
                    System.out.println("\nMasukkan nilai dalam satuan cm");
                    object.luas();
                    System.out.println("\nLuas: " + object.getResult() + " cm^2");
                    break;
                default:
                    System.out.println("Input salah!! masukkan ulang!!");
                    continue;
            }
            break;
        }
    }
    
    private void bangunRuang(BangunRuang object){
        System.out.println("1. Luas");
        System.out.println("2. Volume");

        while (true) {
            System.out.print("> (1/2): ");
            int user = scan.nextInt();
            switch (user) {
                case 1:
                    System.out.println("\nMasukkan nilai dalam satuan cm");
                    object.luas();
                    System.out.println("\nLuas: " + object.getResult() + " cm^2");
                    break;
                case 2:
                    System.out.println("\nMasukkan nilai dalam satuan cm");
                    object.volume();
                    System.out.println("\nVolume: " + object.getResult() + " cm^3");
                    break;
                default:
                    System.out.println("Input salah!! masukkan ulang!!");
                    continue;
            }
            break;
        }
    }
    
    private boolean askUser(){
        scan.nextLine();
        System.out.println("\nApakah anda ingin menghitung lagi?");
        while (true) {
            System.out.print("> (yes/no): ");
            String user = scan.nextLine();
            if (user.equalsIgnoreCase("yes")) {
                return true;
            } else if (user.equalsIgnoreCase("no")){
                return false;
            } else {
                System.out.println("Input salah!! masukkan ulang!!");
            }
        }
    }
}

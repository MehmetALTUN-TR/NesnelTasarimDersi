import java.util.Scanner;

public class TestHesapCuzdani {
    public static void main(String[] args) {

        HesapCuzdani alininHesapCuzdani = new HesapCuzdani(100);
        HesapCuzdani furkaninHesapCuzdani2 = new HesapCuzdani(-8.54);
        System.out.printf("Alinin bakiyesi %8.2f TL \n", alininHesapCuzdani.getBakiye());
        System.out.printf("Furkanın bakiyesi %8.2f TL \n", furkaninHesapCuzdani2.getBakiye());

        Scanner klavyScanner = new Scanner(System.in);
        double yatanMiktar;
        
        System.out.println("Alinin hesabına yatacak miktarı giriniz : ");
        yatanMiktar = klavyScanner.nextDouble();
        alininHesapCuzdani.paraYatir(yatanMiktar);

        System.out.println("Furkanın hesabına yatacak miktarı giriniz : ");
        yatanMiktar = klavyScanner.nextDouble();
        furkaninHesapCuzdani2.paraYatir(yatanMiktar);
        klavyScanner.close();
        System.out.printf("Alinin bakiyesi %8.2f TL \n", alininHesapCuzdani.getBakiye());
        System.out.printf("Furkanın bakiyesi %8.2f TL \n", furkaninHesapCuzdani2.getBakiye());
    }
}

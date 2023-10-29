import java.util.Scanner;

public class Turler {
    private String ad;
    private int nufus;
    private double buyumeOrani;

    public void oku() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Türün adı   :");
        ad = klavye.nextLine();

        System.out.println("Türün Nüfusu    :");
        nufus = klavye.nextInt();

        System.out.println("Türün büyüme oranı  %:");
        buyumeOrani = klavye.nextDouble();
        klavye.close();

    }

    public void yaz() {
        System.out.println("Tür adı         : " + ad);
        System.out.println("Tür nüfusu      : " + nufus);
        System.out.println("Tür büyümeoranı : %" + buyumeOrani);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getNufus() {
        return nufus;
    }

    public void setNufus(int nufus) {
        this.nufus = nufus;
    }

    public double getBuyumeOrani() {
        return buyumeOrani;
    }

    public void setBuyumeOrani(double buyumeOrani) {
        this.buyumeOrani = buyumeOrani;
    }
}

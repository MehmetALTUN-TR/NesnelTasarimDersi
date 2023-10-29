//Hesap cüzdanı modelimizi oluşturuyoruz.
public class HesapCuzdani {

    private double bakiye;

    public HesapCuzdani(double ilkbakiye){
        if(ilkbakiye>0)
        bakiye=ilkbakiye;
    }
    public void paraYatir(double miktar)
    {
        bakiye+=miktar;
    }
    public double getBakiye(){
        return bakiye;
    }
}
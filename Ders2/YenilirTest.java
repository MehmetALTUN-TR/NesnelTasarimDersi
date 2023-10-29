public class YenilirTest {
    public static void main(String[] args) {

        Object[] nesneler={new Kaplan(),new Tavuk(),new Kedi(),new Elma(),new Portakal()};
        for (int i = 0; i < nesneler.length; i++) {
            if(nesneler[i] instanceof Yenilir)
                System.out.println(((Yenilir)nesneler[i]).nasilYenir());
            if(nesneler[i] instanceof Hayvan)
                System.out.println(((Hayvan)nesneler[i]).ses());
        }

    }
}

abstract class Hayvan {

    private double agirlik;

    public double getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(double agirlik) {
        this.agirlik = agirlik;
    }
    public abstract String ses();

}

class Tavuk extends Hayvan implements Yenilir{
    public String ses(){
        return "Tavuk: Gıd gıd gıdak";
    }
    public String nasilYenir(){
        return "Tavuk: Kızartarak Yenir.";
    }
}
class Kaplan extends Hayvan{
    public String ses(){
        return "Kaplan: Kükrer";
    }
}
class Kedi extends Hayvan{

    public String ses(){
        return "Kedi: Miyavvv";
    }

}
abstract class Meyve implements Yenilir {

    
}
class Elma extends Meyve{
    public String nasilYenir(){
        return "Elma: Pişirmeden direk yenir.";
    }
}
class Portakal extends Meyve{
    public String nasilYenir(){
        return "Portakal: Kabuğu Soyularak Yenir.";
    }
}
public class OverloadTest {
    public static void main(String[] args) {
        A a=new A();
        a.p(10);
        a.p(10.0);
    }
}
//B adında bir class oluşturuyoruz
class B {
    //p adında double bir parametre alan ve bu parametreyi 2 ile çarpıp ekrana yazan fonksiyonu yazalım.
    public void p(double i){
        System.out.println(i*2);
    }
}
//A sınıfını B sınıfından kalıtım yolu ile oluşturuyoruz.
//B sınıfının p fonksiyonu artık A sınıfınında bir fonksiyonu oldu
class A extends B{
    //p adında int bir parametre alan ve bu parametreyi ekrana yazan fonksiyonu yazalım.
    public void p(int i){
        System.out.println(i);
    }
    //burada p fonksiyonunu farklı bir parametre ile aşırı yükledik.
}

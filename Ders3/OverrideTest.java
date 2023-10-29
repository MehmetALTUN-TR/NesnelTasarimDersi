public class OverrideTest {
    public static void main(String[] args) {
        A a = new A();
        a.p(100);

    }
}

class B {
    public void p(double i) {
        System.out.println(i * 2);
    }
}

class A extends B {
    // p fonksiyonunu ezerek tekrar şekillendirerek girilen parametreyi direk yazdırdık.
    // eğer override yapmaksaktık 2 katını ekrana yazacaktı.
    public void p(double i) {
        System.out.println(i);
    }
}
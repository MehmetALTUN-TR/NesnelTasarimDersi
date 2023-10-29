public class SampleTest {
    public static void main(String[] args) {
        
        Sample<String> sample1=new Sample<String>();
        sample1.setVeri("Merhaba Dünya");
        System.out.println(sample1.getVeri());

        Sample<Turler> sample2=new Sample<Turler>();
        Turler yaratik=new Turler();
        yaratik.setAd("Karetta Karetta");
        yaratik.setNufus(100);
        yaratik.setBuyumeOrani(10);
        sample2.setVeri(yaratik);

        Turler yeniYaratik=new Turler();
        yeniYaratik=sample2.getVeri();
        yeniYaratik.yaz();
    }
}

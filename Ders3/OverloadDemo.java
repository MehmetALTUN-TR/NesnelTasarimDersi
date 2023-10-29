public class OverloadDemo {
    public static void main(String[] args) {
        double ortalama = ortalama(40.0, 50.0);
        double ortalama2 = ortalama(1.0, 2.0, 3.0);
        char ortalama3 = ortalama('A', 'C');
        int ortalama4 = ortalama(50,90);

        System.out.println("Ortalama1 = " + ortalama);
        System.out.println("Ortalama2 = " + ortalama2);
        System.out.println("Ortalama3 = " + ortalama3);
        System.out.println("Ortalama4 = " + ortalama4);
    }

    public static double ortalama(double s1, double s2) {
        return (s1 + s2) / 2.0;
    }

    public static double ortalama(double s1, double s2, double s3) {
        return (s1 + s2 + s3) / 3;
    }

    public static char ortalama(char c1, char c2) {
        return (char) (((int) c1 + (int) c2) / 2);
    }
    public static int ortalama(int s1, int s2) {
        return (s1 + s2) / 2;
    }
}

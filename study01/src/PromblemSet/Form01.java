package PromblemSet;

public class Form01 {

    public static void main(String[] args) {
        System.out.println("千克    磅");
        for (int i = 1; i <= 200; i++) {
            System.out.printf( "%3d",i );
            System.out.printf("   ");
            System.out.printf("%.1f",band(i));
            System.out.println();
            }


    }

    public static double band(int i){
        double band = i * 2.2;
        //System.out.printf("%5d",band);
        return band;
    }
}

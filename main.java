public class Main {

    public static void main(String[] args) {

        int x1 = 5;
        int x2 = 4;
        int x3 = -3;
        int y1 = 2;
        int y2 = 9;
        int y3 = 2;
        int z1 = -5;
        int z2 = 2;
        int z3= 6;


        double distance1 = (Math.sqrt(Math.pow(y1-y2,2)+ (Math.pow(x1-x2,2)+ (Math.pow(z1-z2,2)))));
        double distance2 = (Math.sqrt(Math.pow(y1-y3,2)+ (Math.pow(x1-x3,2)+ (Math.pow(z1-z3,2)))));
        double distance3 = (Math.sqrt(Math.pow(y2-y3,2)+ (Math.pow(x2-x3,2)+ (Math.pow(z2-z3,2)))));
        double max = Math.max((int)distance1,distance2);
        double max2 = Math.max((int)distance1,distance3);
        double max3 = Math.max(max,max2);
        double min = Math.min(distance1,distance2);
        double min2 = Math.min(distance1,distance3);
        double min3 = Math.min(min,min2);
        System.out.printf("The minimum distance is ~%.3f\n", (min3));
        System.out.printf("The maximum distance is ~%.3f", (max3));
    }
}

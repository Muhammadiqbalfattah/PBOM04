public class LatihanBuatProgramMethodOverload {
    /*
    Buatlah sebuah program dengan method overloading untuk melakukan perhitungan:
    1. 5 + 5.6
    2. 5.6 + 5
    3. 5 + 5
    4. 5.6 + 5.6

     */
   /* static int plusMethodInt(int x, int y) {
    return x + y;
}

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
    */
    static int midnight (int x, int y){
        return x + y;
    }
    static double midnight(double x, double y){
        return x + y;

    }

    public static void main(String[] args) {
        int myNum1 = midnight(5,0);
        double myNum2 = midnight(0,5.6);
        System.out.println(" 1. Nilai ke -1 : " + myNum1 + "+" + myNum2);

        int myNum3 = midnight(5,0);
        double myNum4 = midnight(5.6,0);
        System.out.println("2. Nilai ke-2 : " + myNum4 + "+" + myNum3);

        int myNum5 = midnight(5,0);
       // double myNum6 = midnight(0,0);
        System.out.println("3. Nilai ke - 3 : " + myNum5 + "+" + myNum5);

        double myNum6 = midnight(5.6,0);
        System.out.println("4. Nilai ke- 4 : " + myNum6 + "+" + myNum6);



    }

}
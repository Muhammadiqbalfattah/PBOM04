// Method return value

public class Method {
    static int bilangan1(){
        return 100;
    }
    static int bilangan2 (){
        int hasil = 100 + 200;

        return hasil;
    }
    public static void main(String[] args) {
        System.out.println("Nilai Bilangan 1 = " + bilangan1());
        if (bilangan1() > bilangan2()){
            System.out.println(bilangan1() + " Nilainya kebih besar dari " + bilangan2());
        } else {
            System.out.println(bilangan1() + "Nilainya lebih kecil dari " + bilangan2());
        }

    }
}

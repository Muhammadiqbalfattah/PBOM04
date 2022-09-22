class Objectandclass {
    //Latihan classMobil
    private boolean rem = false;
    public void mengerem (){
        if(this.rem == true){
            System.out.println("Mobil mengerem");
        } else {
            System.out.println("Mobil tidak mengerem");
        }
        System.out.println("Fungsi rem dipanggil !");

    }
    public void aksesrem(boolean rem){
        this.rem  = rem;

    }
    public class main{
        public static void main(String[] args) {
            Objectandclass objmobil = new Objectandclass();
            objmobil.mengerem();
            System.out.println("Nilai rem = " + objmobil);
        }


    }

}

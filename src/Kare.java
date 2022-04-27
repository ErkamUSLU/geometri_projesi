public class Kare implements alanCevre {

    @Override
    public void Alan() {
        double Alan = Variables.getKenar()*Variables.getKenar();
        System.out.println("Alan : "+Alan);
        Cevre();
    }

    @Override
    public  void Cevre() {
        double Cevre = Variables.getKenar()*4;
        System.out.println("Cevre : "+Cevre);

    }
}

import java.util.Arrays;

public class Class {
    int nomber;
    String soz;
    int[] massiv;

    @Override
    public String toString() {
        return "Class: " + "\n"+
                "nomber: " + nomber + "\n"+
                "soz: " + soz + "\n" +
                "massiv: " + Arrays.toString(massiv);
    }

    public Class(int nomber, String soz, int[] massiv) {
        this.nomber = nomber;
        this.soz = soz;
        this.massiv = massiv;

    }
}

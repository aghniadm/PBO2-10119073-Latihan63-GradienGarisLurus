package pbo2.pkg10119073.latihan63.gradiengarislurus;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menghitung gradien garis lurus
 * dengan konsep interface class
 *
 */

public class PBO210119073Latihan63GradienGarisLurus {

    public static void main(String[] args) {
        Koordinat koor1,koor2;
        
        koor1 = new Koordinat(2, 10, 5, 7);
        System.out.println("Garis yang melalui titik ("+koor1.getX1()+","+koor1.getY1()+")"
                             + " dan ("+koor1.getX2()+","+koor1.getY2()+")");
        System.out.println("memiliki gradien sebesar " +koor1.hitungGradien());
        
        koor2 = new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik ("+koor2.getX1()+","+koor2.getY1()+")"
                             + " dan ("+koor2.getX2()+","+koor2.getY2()+")");
        System.out.println("memiliki gradien sebesar "+koor2.hitungGradien());
    }
    
}

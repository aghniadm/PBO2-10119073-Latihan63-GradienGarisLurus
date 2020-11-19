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

public class Koordinat implements GarisLurus {
    private int x1, y1, x2, y2;
    
    public Koordinat(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public int getX1(){
        return x1;
    }
    
    public int getY1(){
        return y1;
    }
    
    public int getX2(){
        return x2;
    }
    
    public int getY2(){
        return y2;
    }
    
    public int hitungGradien(){
        return (y1 - y2) / (x1 - x2);
    }
}
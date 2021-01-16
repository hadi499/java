public class OverloadFungsi {
    public static void main(String[] args) {

        int hasilInteger;
        hasilInteger = tambah(4,5);
        printAngka(hasilInteger);
    }
    private static int tambah(int angkaInt1, int angkaInt2){
        return angkaInt1 + angkaInt2 ;
    }
    private static float tambah(int angkaInt2, float angkaFloat1){
        return angkaFloat1 + angkaInt2;
    }
    private static void printAngka(int angkaInteger){
        System.out.println("angka ini adalah integer dengan nilai = " + angkaInteger);
    }
    private static void printAngka(float angkaFloat){
        System.out.println("angka ini adalah float dengan nilai = " + angkaFloat);
    }
}

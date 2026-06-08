package Praktikum_7.bagian_2;

public class BlackWhiteFilter implements FilterStrategy{
    @Override
    public void apply(String fileName) {
        System.out.println("Menerapkan Filter hitam-putih pada" + fileName);
    }
}

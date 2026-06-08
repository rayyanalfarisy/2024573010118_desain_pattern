package Praktikum_7.bagian_2;

public class SepiaFilter implements FilterStrategy{
    @Override
    public void apply(String fileName) {
        System.out.println("Menerapkan Filter sephia pada" + fileName);
    }
}

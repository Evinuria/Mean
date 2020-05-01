import java.util.Scanner ;
public class main extends Mean{
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        int i = 0;
        System.out.println("HELLO");
        System.out.println("MY NAME IS EVINURIA FILUYUNISTIARA");
        System.out.println("Today we are going to learn about");
        System.out.println("Menghitung Rata-Rata");
        Mean main;
        main = new Mean();
        System.out.print("Masukkan jumlah data : ");
        main.jumlahdata = input.nextInt();
        main.nilairata();
    } 
}
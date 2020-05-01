import java.util.Scanner;
public class Mean{
    int i;
    int jumlahdata;
    int data[];
    float mean; 
    int total;
    
        Scanner input = new Scanner(System.in);
         public void nilairata(){
             total = 0;
            if (jumlahdata <= 0) {System.out.println ("Angka yang anda masukkan salah");}
                else{
                    int data[] = new int[jumlahdata];
                    for(i=0; i < data.length; i++){
                    System.out.print("Masukkan data ke "+ (i+1) + " : ");
                    data[i] = input.nextInt();
                    total=total+data[i];}

                    System.out.print("Rata-rata dari ");
                    for(i=0; i <(jumlahdata-1); i++){
                    System.out.print(data[i]+ " + ");}
                    
                    mean = total/jumlahdata;
                    System.out.println(data[jumlahdata-1] + " adalah  " + mean);
                }
            }
}
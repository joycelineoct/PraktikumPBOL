import java.util.Scanner;
public class Tugas1_PPBOL {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Isi data diri kamu :)");
        System.out.print("Masukkan nama: ");
        String nama = x.nextLine();
        System.out.print("Masukkan NIM: ");
        int nim = x.nextInt();
        System.out.println("Hi! Nama kamu adalah " + nama + " dan NIM kamu " + nim);
    }
}
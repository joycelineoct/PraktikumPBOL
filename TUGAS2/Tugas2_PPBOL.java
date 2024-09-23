import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tugas2_PPBOL {
    public static Map<String, String> infoMahasiswa = new HashMap<>();
    public static Scanner x = new Scanner(System.in);

    public static void main(String[] args) {
        int pil;
        do {
            System.out.println("=== Selamat Datang di Pusat Sistem Informasi Mahasiswa! ===");
            System.out.println("1. Tambahkan Data Mahasiswa\n2. Tampilkan Daftar Mahasiswa\n3. Ubah Data Mahasiswa\n4. Hapus Data Mahasiswa\n5. Keluar"); 
            System.out.print("Pilihan Kamu: ");
            pil = x.nextInt();
            x.nextLine();

            switch (pil) {
                case 1:
                    tambahMahasiswa();
                    break;
                case 2:
                    tampilMahasiswa();
                    break;
                case 3:
                    ubahMahasiswa();
                    break;
                case 4:
                    hapusMahasiswa();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan layanan kami! ^___^");
                    break;
                default:
                    System.out.println("Maaf, pilihan yang tersedia hanya 1-5...");
            }
        } while (pil != 5);
    }

    public static void tambahMahasiswa() {
        System.out.print("Masukkan NIM Kamu: ");
        String nim = x.nextLine();

        if (infoMahasiswa.containsKey(nim)) {
            System.out.println("Oops, NIM ini sudah terdaftar! :(");
        } else {
            System.out.print("Masukkan Nama Kamu: ");
            String nama = x.nextLine();
            infoMahasiswa.put(nim, nama);
            System.out.println("Selamat, mahasiswa berhasil ditambahkan!");
        }
    }

    public static void tampilMahasiswa() {
        if (infoMahasiswa.isEmpty()) {
            System.out.println("Belum ada mahasiswa yang didaftarkan...");
        } else {
            System.out.println("Daftar Mahasiswa:");
            for (Map.Entry<String, String> entry : infoMahasiswa.entrySet()) {
                System.out.println("NIM: " + entry.getKey() + ", Nama: " + entry.getValue());
            }
        }
    }

    public static void ubahMahasiswa() {
        System.out.print("Masukkan NIM yang akan diupdate: ");
        String nim = x.nextLine();

        if (infoMahasiswa.containsKey(nim)) {
            System.out.print("Masukkan Nama baru: ");
            String namaBaru = x.nextLine();
            infoMahasiswa.put(nim, namaBaru);
            System.out.println("Data mahasiswa berhasil diupdate!");
        } else {
            System.out.println("NIM tidak ditemukan.");
        }
    }

    public static void hapusMahasiswa() {
        System.out.print("Masukkan NIM yang akan dihapus: ");
        String nim = x.nextLine();

        if (infoMahasiswa.containsKey(nim)) {
            infoMahasiswa.remove(nim);
            System.out.println("Data mahasiswa berhasil dihapus!");
        } else {
            System.out.println("NIM tidak ditemukan.");
        }
    }
}
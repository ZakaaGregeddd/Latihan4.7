package Notepad;

public class BukaNotepad {
    public static void main(String[] args) {
        try {
            System.out.println("Mencoba membuka Notepad...");
            
            // Mendapatkan environment Runtime saat ini
            Runtime runtime = Runtime.getRuntime();
            
            // Mengeksekusi perintah "notepad" ke sistem operasi
            Process process = runtime.exec("notepad");
            
            System.out.println("Notepad berhasil dibuka!");
            
        } catch (Exception e) {
            // Menangkap error jika Notepad gagal dibuka
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
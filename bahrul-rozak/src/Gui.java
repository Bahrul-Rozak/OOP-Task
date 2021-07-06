/* 
Nama : Bahrul Rozak
NIM : 1903015050
Buatlah program sederhana menggunakan GUI JOptionPane dan MessageDialog untuk
menampilkan Nama, Nim, kelas
*/

// Mengimport beberapa library yang dibutuhkan
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Gui{
    public static void main(String[] args)
  {
    String nim = "1903015050";
    
    // membuat sebuah Jframe
    JFrame frame = new JFrame("JOptionPane showMessageDialog");

    // menampilkan Joption dengan showMessageDialog
    JOptionPane.showMessageDialog(frame,
        "NIM: " + nim + " 4E",
        "Bahrul Rozak",
        JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
  }
}
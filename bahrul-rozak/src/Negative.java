public class Negative {
       public static void main(String[] args) {
              int[] arr=new int[-10];
       }
}
/* output
Exception in thread "main" java.lang.NegativeArraySizeException: -10
at Negative.main(Negative.java:3)
Penjelasan:
karena Di sini JVM telah melempar NegativeArraySizeException karena saya
membuat array dengan ukuran negatif seperti yang ditunjukkan pada program.
*/
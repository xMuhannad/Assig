



import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class file2 {
    private String A;
    public file2 (String A){


        try {
            try {
                RandomAccessFile ra = new RandomAccessFile("randomAccessFile1.dat", "rw");

                try {
                    ra.writeUTF(A);
                } catch (IOException ex) {
                    System.out.println(ex);
                }

            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
            System.out.println("Done.");
        } finally {

        }

    }

    public file2 (){
        try {
            RandomAccessFile ra = new RandomAccessFile("randomAccessFile1.dat", "r");

            System.out.println(ra.length());


            try {
                while(true){
                    A = (ra.readUTF());
                }
            } catch (IOException ex) {
                System.out.println("end2 of file");
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public String toString() {
        String str = A ;
        orderfile a = new orderfile();
        a.B(A);
        return str;
    }
}

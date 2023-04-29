

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class file4 {

    private String A;
    public file4 (int b){
        A = String.valueOf(b);

        try {
            try {
                RandomAccessFile ra = new RandomAccessFile("randomAccessFile3.dat", "rw");

                try {
                    ra.writeUTF(A);
                } catch (IOException ex) {
                    System.out.println(ex);
                }

            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
            System.out.println("Done3.");
        } finally {

        }

    }

    public file4 (){
        try {
            RandomAccessFile ra = new RandomAccessFile("randomAccessFile3.dat", "r");



            try {
                while(true){
                    A = (ra.readUTF());
                }
            } catch (IOException ex) {
                System.out.println("end4 of file");
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
        a.D(A);
        return str;
    }
}

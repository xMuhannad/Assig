



import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class file {
    private String A;

    public file (String C){
        try {
            try {
                RandomAccessFile ra = new RandomAccessFile("randomAccessFile.dat", "rw");

                try {
                    ra.writeUTF(C);

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
    public file (){
        try {
            RandomAccessFile ra = new RandomAccessFile("randomAccessFile.dat", "r");
            try {
                while(true){
                    A = (ra.readUTF());
                }
            } catch (IOException ex) {
                System.out.println("end of file");
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
        a.A(A);
        return str;
    }
}


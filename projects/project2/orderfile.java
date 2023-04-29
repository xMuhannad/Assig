import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class orderfile {
    public void A (String A){


        try {
            try {
                RandomAccessFile ra = new RandomAccessFile("randomAccessFile4.dat", "rw");

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
    public void B (String b){


        try {
            try {
                RandomAccessFile ra = new RandomAccessFile("randomAccessFile4.dat", "rw");

                try {
                    ra.writeUTF(b);
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

    
    public void D (String c){


        try {
            try {
                RandomAccessFile ra = new RandomAccessFile("randomAccessFile4.dat", "rw");

                try {
                    ra.writeUTF(c);
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
}


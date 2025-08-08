package javap;
import java.util.Scanner;

public class Google_Drive {
    
    Scanner sca = new Scanner(System.in);

    void upload() {
        System.out.print("Give a file to upload, give file name: ");
        String f = sca.nextLine();
        System.out.println("File is uploaded: " + f);
    }

    void download() {
        System.out.print("Which file do you want to download, give file name: ");
        String f = sca.nextLine();
        System.out.println("File is downloaded: " + f);
    }

    public static void main(String[] args) {
        Google_Drive g = new Google_Drive();
        g.upload();
        g.download();

        g.sca.close();
    }
}

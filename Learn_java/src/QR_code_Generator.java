import com.sun.javafx.iio.ImageStorage;
import net.glxn.qrgen.image.ImageType;

//import java.io.ByteArrayOutputStream;

/**
 * Created by abc on 6/20/2016.
 */
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QR_code_Generator {
    public static void main(String[] args) throws Exception{
        String details="MARIUM RUQAIYA ";
        ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();
        File f=new File("D:\\version-control\\myCourse.jpg");
        FileOutputStream fos =new FileOutputStream(f);
        fos.write(out.toByteArray());
        fos.flush();
    }
    /*public static void main(String[] args) {
        Outer:
        for(int i=0;i<=4;i++){
            Inner:
            for(int j=0;j<=10;j++){
                if(i==1)
                break Inner;
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }*/
}

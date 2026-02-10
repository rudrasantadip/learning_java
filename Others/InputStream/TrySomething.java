import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TrySomething
{
    public static void main(String[] args) throws IOException
    {
        String path ="santa.jpeg";

        //Createing a file resource fromt the realtive path
        File image = new File(path);
        InputStream is = new FileInputStream(image);

        
        File target = new File("target.jpeg");
        if(target.exists())
        {
            target.delete();
        }
        Files.copy(Paths.get(path), Paths.get(target.getName()));
    }
}
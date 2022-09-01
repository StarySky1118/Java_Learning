package writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {
        String str = "\n斯人若彩虹，遇见方知有。";
        String filePath = "Z:\\hello.txt";

        fileWrite(str, filePath);


    }

    public static void fileWrite(String str, String filePath) {
        FileWriter fw = null;

        try {
            fw = new FileWriter(filePath, true);
            fw.write(str);
            System.out.println("写入成功！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

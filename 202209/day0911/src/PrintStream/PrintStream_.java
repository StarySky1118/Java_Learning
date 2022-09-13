package PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStream_ {
    public static void main(String[] args) {
        PrintStream out = System.out;

        out.print("斯人若彩虹，遇见方知有。");

        String filePath = "Z:\\PrintStreamTest.txt";

        try {
            System.setOut(new PrintStream(filePath));
            out = System.out;
            out.print("斯人若彩虹，遇见方知有。");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

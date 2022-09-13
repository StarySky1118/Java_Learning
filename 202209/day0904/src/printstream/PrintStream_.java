package printstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStream_ {
    public static void main(String[] args) {

        PrintStream out = System.out;

        out.print("你好");

        out.close();

        try {
            System.setOut(new PrintStream("Z:\\hello01.txt"));
            out = System.out;
            out.print("斯人若彩虹，遇见方知有。");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            out.close();
        }
    }
}

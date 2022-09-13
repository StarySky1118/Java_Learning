package buffered;

public class CopyTest {
    public static void main(String[] args) {
        String srcFilePath = "Z:\\wyq.txt";
        String destFilePath = "Z:\\wyq(1).txt";

        BufferedCopy.fileCopy(srcFilePath, destFilePath);
    }
}

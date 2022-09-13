package bufferedcopy;

public class CopyTest {
    public static void main(String[] args) {
        String srcFilePath = "Z:\\Lappland.jpg";
        String destFilePath = "Z:\\Lappland(2).jpg";

        PictureCopy.fileCopy(srcFilePath, destFilePath);
    }
}

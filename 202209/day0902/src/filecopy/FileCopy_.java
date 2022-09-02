package filecopy;

import java.io.*;

public class FileCopy_ {
    public static void main(String[] args) {
        String srcFilePath = "Z:\\wyq.txt";
        String destFilePath = "Z:\\abc.txt";
        fileCopy(srcFilePath, destFilePath);

    }

    /**
     * 拷贝srcFilePath至destFilePath。
     * @param srcFilePath 源文件
     * @param destFilePath 目标文件
     */
    /*
        思路分析：创建FileReader和FileWriter对象，并将二者放入BufferedReader和BufferedWriter，循环读取一定
        数量字符到buf，写入destFilePath。
    */
    public static void fileCopy(String srcFilePath, String destFilePath) {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            String lineString = null;
            bufferedReader = new BufferedReader(new FileReader(srcFilePath));
            bufferedWriter = new BufferedWriter(new FileWriter(destFilePath, true));

            // 循环读取与写入
            while((lineString = bufferedReader.readLine()) != null) {
                bufferedWriter.write(lineString);
                bufferedWriter.newLine();
            }

            System.out.println("文件拷贝成功！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally { // 关流
            try {
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

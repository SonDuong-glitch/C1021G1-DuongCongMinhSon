package week3.io_text_file.baitap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyToTargerFile {
    public int countCharacter(String file)
    {
        int count=0;
        try{
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            int i;
            while((i=bufferedReader.read())!=-1)
            {
                if ((char)i!=' ')
                {
                    count++;
                }
            }
        }
        catch(Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return count;
    }
    public void countCharacter1(String source,String target)
    {
        int count=0;
        try{
            BufferedReader br=new BufferedReader(new FileReader(source));
            FileWriter  fileWriter  =new FileWriter(target, true);
            BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
            int i;
            while((i=br.read())!=-1)
            {
                if ((char)i!=' ')
                {
                    count++;
                }
            }
        }
        catch(Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
    public static void main(String[] args) {
        CopyToTargerFile check=new CopyToTargerFile();
        System.out.println("Số lượng từ trong file gốc là: "+check.countCharacter("E:\\C1021G1_DuongCongMinhSon\\Module_2\\src\\week3\\io_text_file\\baitap\\input"));
    }
}

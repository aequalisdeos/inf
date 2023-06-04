import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class z12 {
    public static void main(String[] args) throws IOException {
        String line;
        ArrayList<Object> list = new ArrayList<>();
        File file= new File("C:\\Users\\Мишка\\Desktop\\z12.txt");
        FileInputStream file_In_Str  = new FileInputStream(file);
        InputStreamReader fRe=new InputStreamReader(file_In_Str);
        BufferedReader file_BR = new BufferedReader(fRe);
        FileOutputStream file_Out_Str = new FileOutputStream(file,true);
        OutputStreamWriter fWr = new OutputStreamWriter(file_Out_Str);
        BufferedWriter file_BW = new BufferedWriter(fWr);
        file_BW.newLine();
        String[] Patt = {"Мужской", "Женский", "край", "город", "область"};
        String[] ZamPatt = {"М", "Ж", "кр.", "г.", "обл."};
        Pattern pat1;
        Matcher mat1;
        while((line = file_BR.readLine()) != null) {
            String[] str=line.split("\\.");
            Collections.addAll(list, str);
        }
        file_BW.newLine();
        String[] array = list.toArray(new String[list.size()]);

        for (int i=0;i<array.length;i++){
            for (int j=0;j<Patt.length;j++){
                pat1=Pattern.compile(Patt[j]);
                mat1=pat1.matcher(array[i]);
                if (mat1.find()) array[i]=mat1.replaceAll(ZamPatt[j]);
            }
        }
        for (String s : array) {
            file_BW.write("\n"+s);
        }
        file_BW.close();
    }
}
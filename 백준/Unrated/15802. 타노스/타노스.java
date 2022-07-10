import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String name = br.readLine();

        if("jsw6701".equals(name)){
            bw.write("1");
        }
        else{
            bw.write("0");
        }
        bw.close();

    }
}

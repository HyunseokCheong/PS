import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String name = br.readLine();
        bw.write(":fan::fan::fan:" + "\n");
        bw.write(":fan::" + name + "::fan:" + "\n");
        bw.write(":fan::fan::fan:" + "\n");
        bw.flush(); bw.close();
    }
}
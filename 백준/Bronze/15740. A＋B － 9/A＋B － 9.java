import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        Long a = Long.parseLong(st.nextToken());
        Long b = Long.parseLong(st.nextToken());

        bw.write((a + b) + "\n");
        bw.flush();
    }
}
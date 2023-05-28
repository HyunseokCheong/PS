import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    // declare
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int             N;
    static int[]           arr;
    
    public static void main(String[] args) throws IOException {
        // read
        N = Integer.parseInt(br.readLine());
        
        // solve
        bw.write("Gnomes:" + "\n");
        
        loop1:
        while (N-- > 0) {
            arr = new int[3];
            st  = new StringTokenizer(br.readLine());
            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            
            if (arr[0] < arr[1] && arr[1] < arr[2]) {
                bw.write("Ordered" + "\n");
            } else if (arr[0] > arr[1] && arr[1] > arr[2]) {
                bw.write("Ordered" + "\n");
            } else {
                bw.write("Unordered" + "\n");
            }
        }
        
        // write
        bw.flush();
        bw.close();
    }
}
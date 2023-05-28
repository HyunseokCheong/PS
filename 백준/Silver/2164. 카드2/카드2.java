import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> que = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            que.offer(i);
        }

        while (que.size() > 1) {
            que.poll(); // 맨 앞 제거
            que.offer(que.poll()); // 맨 앞 제거 + 맨 뒤에 추가
        }
        System.out.println(que.poll());
    }
}
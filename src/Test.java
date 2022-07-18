import java.util.*;
import java.io.*;

public class Test{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input > 0) {
                pq.add(input);
            }
            else {
                if (pq.isEmpty()) System.out.println('0');
                else{
                    System.out.println(pq.poll());
                }
            }
        }
    }
}
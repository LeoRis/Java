import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.StringTokenizer;

// Class: Binary_Search_Tree
// Class: BNode

public class Find_The_Number {

    public static void main(String[] args) throws Exception {
        int i, j, k;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        
        Binary_Search_Tree<Integer> tree = new Binary_Search_Tree<Integer>(N);
        for (i = 0; i < N; i++) {
            int number = Integer.parseInt(br.readLine());
            tree.insert(number);
        }
        
        br.close();
                
        tree.reversedInOrder(tree.root);
//        tree.sortArray();
        System.out.println(tree.array[P - 1]);
        
    }
   
}
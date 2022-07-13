import java.math.BigInteger;
import java.util.*;

class node{
    int boxes;
    int matches;
    public node(int boxes, int matches) {
        this.boxes = boxes;
        this.matches = matches;
    }
}

class PQcomp implements Comparator<node>{
    @Override
    public int compare(node o1, node o2) {
        return o2.matches - o1.matches;
    }
}
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<node> pq = new PriorityQueue<>(new PQcomp());
        int capacity = sc.nextInt();
        int containers = sc.nextInt();
        for(int i=0; i<containers; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            pq.add(new node(a,b));
        }
        int current = 0;
        int total_matches = 0;
        while (current<capacity && !pq.isEmpty()){
            node cur = pq.poll();
            int taken = 0;
            if(cur.boxes >= capacity- current){
                taken = capacity - current;
                current = capacity;
            }else{
                taken = cur.boxes;
                current+= cur.boxes;
            }

            total_matches+= (taken*cur.matches);
        }
        System.out.println(total_matches);

    }


}
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.min;

class node implements Comparable<node> {
    int k, l, most_sales;

    public node(int k, int l) {
        this.k = k;
        this.l = l;
        this.most_sales = min(k, l - k);
    }

    @Override
    public int compareTo(node d) {
        if (d.most_sales != most_sales)
            return d.most_sales - most_sales;
        if (d.k != k)
            return d.k - k;
        return d.l - l;
    }
}

public class Solution {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();
        List<node> nodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nodes.add(new node(sc.nextInt(), sc.nextInt()));
        }
        sc.close();
        Collections.sort(nodes);

        long total = 0;

        for (int i = 0; i < n; i++) {
            total += min(nodes.get(i).k, nodes.get(i).l);
            if (f > 0 && nodes.get(i).most_sales > 0) {
                f--;
                total += nodes.get(i).most_sales;
            }
        }

        System.out.println(total);
    }
}
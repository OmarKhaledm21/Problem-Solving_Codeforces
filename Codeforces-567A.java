import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
    static class City {
        int x;
        int min;
        int max;

        public City(int x) {
            this.x = x;
        }

        @Override
        public String toString() {
            return this.min + " " + this.max;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<City> cities = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            cities.add(new City(s.nextInt()));
        }
        s.close();

        City c0 = cities.get(0);
        c0.min = Math.abs(cities.get(1).x - c0.x);
        City cn = cities.get(n - 1);
        cn.min = Math.abs(cn.x - cities.get(n - 2).x);

        for(int i=0; i<n; i++){
            City current = cities.get(i);
            current.max = Math.max( Math.abs(current.x - c0.x),Math.abs(current.x - cn.x) );
            if(i!=0 && i!=n-1){
                current.min = Math.min( Math.abs(current.x - cities.get(i+1).x),Math.abs(current.x -cities.get(i-1).x));
            }
        }
        for(var city: cities){
            System.out.println(city.toString());
        }
    }
}
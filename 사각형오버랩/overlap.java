package com.company;

public class Main {
    static class Point{
        public int x;
        public int y;
    }
    static boolean doesOverlap(Point l1, Point r1, Point l2, Point r2) {
        if (l1.x > r2.x || l2.x > r1.x ){ // if one rectangle is on the side of another
            return false;
        }
        if (l2.y < r2.y || l2.y < r1.y){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Point rec1_left_upper = new Point();
        Point rec1_right_under = new Point();

        Point rec2_left_upper = new Point();
        Point rec2_right_under = new Point();
        rec1_left_upper.x = 0; rec1_left_upper.y = 10;
        rec1_right_under.x =10; rec1_right_under.y = 0;
        rec2_left_upper.x = 7; rec2_left_upper.y = 7;
        rec2_right_under.x = 17; rec2_right_under.y = 0;

        System.out.println(doesOverlap(rec1_left_upper,rec1_right_under,rec2_left_upper,rec2_right_under));
    }
}

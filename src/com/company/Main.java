package com.company;

public class Main {

    public static void main(String[] args) {
        /*Point p =new Point(6,6);

        Rectangle to = new Rectangle(4,3,8,12);

        double a= to.distanceToRectangle(p);
        System.out.println(a);


         */
        Point x1 = new Point(7,8);
        Point x2 = new Point(2,6);
        Point x3 = new Point(5,5);
        Point x4 = new Point(3,4);
        Point x5 = new Point(5,3);
        Point x6 = new Point(1,2);
        Point x7 = new Point(3,1);
        Point x8 = new Point(4,4);


        //System.out.println(x8.distanceTo(x5));
        //System.out.println(x8.distanceTo(x6));



        TwoDTree test = new TwoDTree();

        test.insert(x1);
        test.insert(x2);
        test.insert(x3);
        test.insert(x4);
        test.insert(x5);
        test.insert(x6);
        test.insert(x7);
        //test.insert(x8);

        if(test.search(x3)){
            System.out.println("Contains");
        }else {
            System.out.println("not contains");
        }



       //test.printPostorder(test.getHead());
        System.out.println(test.nearestNeighbor(x8).toString());
        test.printPostorder(test.getHead());
    }
}

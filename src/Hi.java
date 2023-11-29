import java.sql.DatabaseMetaData;
import java.util.Scanner;

import static java.lang.Math.pow;
/*
class t1{
    synchronized void table(int n){
        int i;
        for( i=1;i<=10;i++)
        System.out.println(n + "*" +i +"= "+n*i);
    }
}*/

class q1 {
    public void series1(int a, int b, int n) {

        int s = (int) (a + pow(2, 0) * b);
        // System.out.println(s);

        int s1 = (int) (a + pow(2, 0) * b + pow(2, 1) * b);
        //System.out.println(s1);

        for (int j = 1; j < n; j++) {
            //s=(a +s^0 x b + s^1 x b + s^2 xb+.....+)
            int s0 = (int) (a + pow(2, 0) * b + pow(2, 1) * b + pow(2, j) * b);
            //  System.out.println(s0);
        }
    }

    public void series2(int a, int b, int n) {

        int s21 = (int) (a + pow(2, 0) * b);
        //System.out.println(s21);

        int s22 = (int) (s21 + pow(2, 1) * b);
        //System.out.println(s22);

        for (int j = 1; j <n ; ++j) {

            //s=(a +s^0 x b + s^1 x b + s^2 xb+.....+)
            a+=a +pow(2,j)*b;
        }
    }
}
/*
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T = sc.nextInt();
        for (int t=0;t<T;++t){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int s = a;
            for (int i=0;i<n;++i){
                s+=Math.pow(2,i)*b;
                System.out.print(s + " ");
            }
            System.out.print("\n");
        }
    }
}*/



public class Hi {
    public static void main(String[] args) {

        /*t1 obj=new t1();
        Thread a=new Thread(){
            @Override
            public void run() {
                obj.table(5);
            }
        };

        Thread b=new Thread(){
            @Override
            public void run() {
                obj.table(2);
            }
        };
        a.start();
        b.start();
    }*/

        /*Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        }
        in.close();*/
        q1 obj=new q1();
        obj.series1(0,2,10);obj.series2(5,3,5);

        }
        }





package edu.neu.coe.info6205.union_find;

import java.util.Random;
import java.util.Scanner;

public class UF_Client {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println("Please enter a number: ");
        int n = in.nextInt();
        for(int i=0;i<50;i++)
        {
            sum = sum + count(n);
        }
        System.out.println("The number of connections are: "+sum/50);
    }
    public static int count(int n)
    {
        Random random = new Random();
        int counter = 0;
        UF_HWQUPC ob = new UF_HWQUPC(n);
        while(ob.components()>1)
        {
            int node1 = random.nextInt(n);
            int node2 = random.nextInt(n);
            ob.connect(node1,node2);
            counter++;
        }
        return counter;
    }
}

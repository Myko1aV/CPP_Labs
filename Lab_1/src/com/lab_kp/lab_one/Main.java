package com.lab_kp.lab_one;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =0;

        n = scan.nextInt();
        if(n<15){
            double drib = 0.0;
            int ch=0;
            int zn=1;
            for (int i = 0; i < n ; i++) {
            ch= i;
            zn= i+1;
            drib += ch/Double.valueOf(zn);
            System.out.println("Чисельник: " + ch + " Знаменник: " + zn + " Сума ряду :" + drib );

        }
        }
        else{
            BigInteger ch = BigInteger.ZERO;
            BigInteger zn = BigInteger.ZERO;
            BigDecimal drib = BigDecimal.valueOf(0.0);
            for (int i = 0; i < n; i++) {
                  ch=BigInteger.valueOf(i);
                  zn=BigInteger.valueOf(i+1);
                  drib = drib.add(BigDecimal.valueOf(ch.longValue()).divide(BigDecimal.valueOf(zn.longValue()),20, RoundingMode.HALF_UP));
                System.out.println("Чисельник: " + ch + " Знаменник: " + zn + " Сума ряду :" + drib );
            }
        }
        }
    }
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller2;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class App {

    public static void main(String[] args) {
        double vp;
        String col;
        Scanner ent=new Scanner(System.in);
        System.out.print("ingresa el color: ");
        col = ent.nextLine();
        System.out.print("Ingrese el valor de la compra:");
        vp=ent.nextDouble();
        if(col.equals("verde")){
            vp=vp*0.9;  
        }
        if(col.equals("amarillo")){
            vp=vp*0.75;
        }
        if(col.equals("azul")){
            vp=vp*0.5;
        }
        if(col.equals("amarillo")){
            vp=vp*0;
        }
        System.out.println(" EL CLIENTE DEBE PAGAR:$"+vp);
    }
}
 
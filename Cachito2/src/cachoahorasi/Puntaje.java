/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cachoahorasi;
import java.util.*;
/**
 *
 * @author pabloneitor
 */
public class Puntaje {
    Scanner sc = new Scanner(System.in);
    public void contarPuntos(){
        menu();
        int selec = seleccionado();
    }
    public void menu(){
        System.out.println("1--Balas");
        System.out.println("2--Tontos");
        System.out.println("3--Trenes");
        System.out.println("4--Cuadras");
        System.out.println("5--Quinas");
        System.out.println("6--Senas");
        System.out.println("7--Escalera");
        System.out.println("8--Full");
        System.out.println("9--Poker");
        System.out.println("10--Grande");
        System.out.println("11--Grande2");
    }
    public int seleccionado(){
        int res = sc.nextInt();
        return res;
    }
}

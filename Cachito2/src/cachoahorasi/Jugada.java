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
public class Jugada extends Cubilete {
    Scanner sc = new Scanner(System.in);
    Cubilete cubilete = new Cubilete();
    Dado dado = new Dado();
    int[] cont;
    int contador = 0;
    public void usarCubilete(){
        cont = cubilete.cubileteLanza();
        for(int i = 0;i < cont.length;i++){
            System.out.print(cont[i]+" ");
        }
    }
    public void volverALanzar(){
        int bb = 1;
        System.out.println("Ingrese posicion del dado");
        //debe ser menor a la cantidad de dados <5
        int x = sc.nextInt();
        
        while(bb == 1 && x <= cont.length+1){
            cont[x-1] = dado.lanzarDado();
            
            System.out.println("Para seguir seleccionando dados presione 1");
            bb = sc.nextInt();
            if(bb == 1){
                System.out.println("Ingrese posicion del dado");
                x = sc.nextInt();
            }
            
        }
        for(int i = 0;i < 5;i++){
            System.out.print(cont[i]+" ");
        }
    }
    public void voltearSeleccionados(){
        int acum = 0;
        int bb = 1;
        System.out.println("Ingrese posicion del dado");
        //debe ser menor a la cantidad de dados <5
        int x = sc.nextInt();
        while(bb == 1 && acum <=1){
            cont[x-1] = dado.voltearDado(cont[x-1]);
            System.out.println("Para voltear otro dados presione 1");
            bb = sc.nextInt();
            acum++;
            if(bb == 1){
                System.out.println("Ingrese posicion del dado");
                x = sc.nextInt();
            }
        }
        for(int i = 0;i < 5;i++){
            System.out.print(cont[i]+" ");
        }
    }
     public void contar(){
        Puntaje puntaje = new Puntaje();
        puntaje.menu();
        int selec = puntaje.seleccionado();
        int c = 0;
        int d = 0;
        int cant = 0;
        if(selec<=6){
            //balas, tontos, trenes, cuadras, quinas, senas.
            for(int i = 0;i < 5;i++){
                if(selec == cont[i])
                    c = c + cont[i];
            }
            
        }else if(selec == 7){//escalera
             for(int i = 0;i < 5;i++){
                
            }  
            
        }else if(selec == 8){//full
            
                
        }else if(selec == 9){//poker
            for (int i = 0;i<5;i++){
                d = cont[i];
                if(d == cont[i])
                    cant++; 
                for (int x = 0;x<5;x++){
                    if(cant == 5)
                        c = 0;
                    else if(cant ==4 ) 
                        c = c +cont[i];                }
            }
            
        }else if(selec == 10 || selec == 11){//grandes
            for(int i = 0;i<5;i++){
                if(cont[0] == cont[i]){
                    c = c + cont[i];
                }
            }
        }
        /*for(int i = 0;i < 5;i++){
            if(selec == cont[i])
                c = c + cont[i];
        }*/
        System.out.println(c);
    }
     public static void main(String[] args) {
        // TODO code application logic here
    }
}

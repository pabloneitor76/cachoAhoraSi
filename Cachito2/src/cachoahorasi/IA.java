/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cachoahorasi;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jict3493
 */
public class IA {
    
    public int[] dados;
    public int[][] cartilla;
    public List<Integer> numbers;

    public IA() {
        
        this.dados = new int[5];
        this.cartilla = new int[11][5];
        numbers = new ArrayList<Integer>(5);
    }
    
    public IA(int[]dadosLanzados){
        this.dados = dadosLanzados;
        this.cartilla = new int[11][5];
        numbers = new ArrayList<Integer>(5);
    }
    
    public int lanzarDado(){
        SecureRandom sr = new SecureRandom();
        int dado = sr.nextInt(6)+1;
        return dado;
    }
    
    public int voltearDado(int n, int pos){
        n = n -7;
        return (n*-1);
    }
    
    public void llenarDados(){
        for(int x=0; x<5; x++)
            dados[x] = lanzarDado();
    }
    
    public void ordenar(){
        for(int x=0; x<5; x++)
            numbers.add(dados[x]);
        numbers.sort(null);
    }
    //====================LOS METODOS isEscala y isFullOrPokerOrGrande SOLO ESTAN HECHOS PARA EVALUAR SI HAY DE MANO=========
    public boolean isEscala(){
        ArrayList<String> opciones = new ArrayList<String>(3);
        opciones.add("13456");
        opciones.add("12345");
        opciones.add("23456");
        String auxString = "";
        for(int g=0; g<5; g++){
            auxString+=numbers.get(g).toString();
        }
        return opciones.contains(auxString);
    }
    
    public int isFullOrPokerOrGrande(){  //0 -- ninguno  ||  1 -- full  ||  2 -- poker  ||  3 -- grande
        int res = 0;
        ArrayList<Integer> temp = new ArrayList<Integer>(6);
        for(int p=0; p<6; p++){
            temp.add(0);
        }
        for(int x=0; x<5; x++){
            switch (numbers.get(x)){
                case 1: {temp.set(0,(temp.get(0)+1)); System.out.println(temp.get(0)); break;}
                case 2: {temp.set(1,(temp.get(1)+1)); System.out.println(temp.get(1)); break;}
                case 3: {temp.set(2,(temp.get(2)+1)); System.out.println(temp.get(2)); break;}
                case 4: {temp.set(3,(temp.get(3)+1)); System.out.println(temp.get(3)); break;}
                case 5: {temp.set(4,(temp.get(4)+1)); System.out.println(temp.get(4)); break;}
                case 6: {temp.set(5,(temp.get(5)+1)); System.out.println(temp.get(5)); break;}
            }
        }
        int indexPart = 0;
        for (int i = 0; i < temp.size(); i++) {
            //System.out.println(temp.get(i));
            if(temp.get(i)==0){
                indexPart = i;
            }
        }
        ArrayList<Integer> nuevoTemp = new ArrayList<Integer>(indexPart);
        for(int n = 0; n < temp.size(); n++) {
            if(temp.get(n)!=0){
                nuevoTemp.add(temp.get(n));
            }else{
                break; 
            }

        }
        /*for(int h=0; h<6;){
            if(temp.get(h)==0){
                temp.subList(0, h);
            }else{
                h++;
            }
            
            System.out.print(temp.get(h) + " ");
        }
        System.out.println("");
        /*ArrayList<Integer> aux2 = new ArrayList<Integer>(6);
        aux2.addAll(temp);
        aux2*/
        //temp.trimToSize();
        System.out.println(nuevoTemp.size()+"ssdfwe");
        int nroDigDifer = nuevoTemp.size();
        if(nroDigDifer==1){
            res = 3;
        }else if(nroDigDifer==2){
            int a = numbers.get(0);
            int cantA = 1;
            for(int z=1; z<4; z++){
                if(numbers.get(z)==a)
                    cantA++;
            }
            if(cantA==4){
                res = 2;
            }else if(cantA==3){
                res = 1;
            }
        }
        return res;
    }

    public static void iniciar(){
        int[] azar = {1,1,1,1,1};
        IA ads = new IA(azar);
        for(int v=0; v<5; v++){
            System.out.print(ads.dados[v] + " ");
        }
        System.out.println("");
        ads.ordenar();
        for(int r=0; r<5; r++){
            System.out.print(ads.numbers.get(r) + " ");
        }
        System.out.println("");
        System.out.println(ads.isEscala());
        System.out.println(ads.isFullOrPokerOrGrande());
        //System.out.println(ads.lanzarDado());
        //return ads.lanzarDado();
    }
    
    public static void main(String[] args) {
        iniciar();
        //ordenar();
    }
}
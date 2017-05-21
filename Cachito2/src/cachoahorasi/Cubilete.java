/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cachoahorasi;

/**
 *
 * @author pabloneitor
 */
public class Cubilete extends Dado {
    int[] cont = new int[5];
    Dado dado = new Dado();
    public int[] cubileteLanza(){
        int n;
        for(int i = 0;i < 5;i++){
            n = dado.lanzarDado();
            cont[i] = n;
            System.out.print(cont[i]+" ");
        }
        return cont;
        
    }
    public void volteo(int x){
        cont[x-1] = dado.voltearDado(cont[x-1]);
        for(int i = 0;i < 5;i++){
            System.out.print(cont[i]+" ");
        }
    }
    
}

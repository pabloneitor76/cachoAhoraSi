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
public class Dado {
    public int lanzarDado(){
        int dado;
        dado = (int)(Math.random()*6)+1;
        return dado;
    }
    public int voltearDado(int n){
        n = n -7;
        return (n*-1);
    }
}

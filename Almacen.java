/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cachoahorasi;

import javax.swing.JLabel;

/**
 * 
 * @author pabloneitor
 */
public class Almacen {
    int[] cont = new int[6];
    Dado dado = new Dado();
    public int[] matrizRes(){
        int n;
        for(int i = 0;i < 6;i++){
            
            cont[0] = Integer.parseInt(puntajeT.jLabel1.getText());
            cont[1] = Integer.parseInt(puntajeT.jLabel2.getText());
            cont[2] = Integer.parseInt(puntajeT.jLabel3.getText());
            cont[3] = Integer.parseInt(puntajeT.jLabel4.getText());
            cont[4] = Integer.parseInt(puntajeT.jLabel5.getText());
            cont[5] = Integer.parseInt(puntajeT.jLabel6.getText());
         
            System.out.print(cont[i]+" ");
        }
        return cont;
    }
     //DadosGen.getClass(0);
}

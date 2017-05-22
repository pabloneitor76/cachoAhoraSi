/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cachoahorasi;
import java.security.SecureRandom; //Ofrece mayor seguridad de que sera al azar
/**
 *
 * @author pabloneitor
 */
public class Dado {
    public int lanzarDado(){
        SecureRandom sr = new SecureRandom();
        int dado = sr.nextInt(6)+1;
        return dado;
    }
    public int voltearDado(int n){
        n = n -7;
        return (n*-1);
    }
}

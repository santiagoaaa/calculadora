/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadorafis.operation;
/**
 * 
 * 
 */
public class Modulo {
    public double modulo(double dividendo, double divisor){
      double residuo=0.0;
        try{
        residuo=dividendo%divisor;
        }catch(Exception e){
        }
        return residuo;
    }
}

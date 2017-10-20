/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadorafis.operation;

/**
 * 
 * @author Santiago
 */
public class tanh {
    public double tanh(double exponente){
        double tanh;
        double base = 2.7182818284590452354;
        tanh = (exponentes(base,exponente) - exponentes(base,-exponente))/( exponentes(base,exponente) + exponentes(base, exponente));
        return tanh;
    }
}

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
public class lnBaseN {
    
    public double log(double base, double x)
        {
        return ln(x)/ln(base);
        }
    
   public double ln(double x)
    {
            int cont;
            double suma=0;
            if(x <= 0)
            return Double.NaN;
            for(cont=1;cont<=100;cont++)
            suma+=(1.0/(cont*2-1)) * pow((x-1)/(x+1),cont*2-1);
            return suma*2;
    }
}

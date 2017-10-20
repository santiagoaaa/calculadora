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
public class lnBaseDiez {
        public double log10(double x) throws Exception{
        if(x <= 0)
            throw new Exception("Entrada no valida");
        return log(x,10);
    };
        
        
    private double log(double a, double b) {
        double res;
        int entero;
        String decimal;
        if (a == 1.0) {
            return 0;
        }

        if (a < 1 && a > 0) {
            decimal = "" + a;
            entero = Integer.parseInt("" + decimal.subSequence(decimal.indexOf(".") + 1, decimal.length()));
            return (nDigitos("" + a) - log(entero, b)) * -1;
        }
        if (a == b) {
            res = 1;
        } else if (a > b) {
            res = log(a / b, b) + 1;
        } else {
            res = 1 / log(b, a);
        }
        return res;
    }

    private int nDigitos(String n) {
        return n.length() - n.indexOf(".") - 1;
    }

}

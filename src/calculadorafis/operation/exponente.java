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
public class exponente {
    public static Double exponentes(Double x, Double y) {
        int validaSigno;
        double xInt = x + (x % 1);
        if (x < 0 && xInt % 2 != 0 && y % 2 > 1) {
            validaSigno = -1;
        } else {
            validaSigno = 1;
        }
        Double valor = x;
        if (y == 0) {
            return 1.0;
        }
        if (y < 0) {
            y = y * -1;
            for (int i = 0; i < y - 1; i++) {
                x = x * valor;
            }
            return 1 / x * validaSigno;
        } else {
            for (int i = 0; i < y - 1; i++) {
                x = x * valor;
            }
            return x * validaSigno;
        }
    }
    
    public double exponente2(Double x, Double y) {
        double numerador, denominador = 1, entero;
        int contador = 0; //String[]datos; 
        String decimal;
        if (y % 1 != 0) {
            decimal = "" + y;
            String datos[] = decimal.split("\\.");
             entero = Double.parseDouble(datos[0]);
        numerador = Double.parseDouble(datos[1]);
            while (contador < datos[1].length()) {
                contador = contador + 1;
                denominador = denominador * 10;
            }
          if (y < 0) {
            int validaSigno;
            double xInt = x + (x % 1);
            if (x < 0) {
                validaSigno = -1;
            } else {
                validaSigno = 1;
            }
            entero = entero * -1;
            System.out.println(x + " " + numerador + " " + denominador + " " + entero);
            return (1 / Math.pow((x * validaSigno), (numerador / denominador) + entero)) * validaSigno;//podria salir directo pero esta preparado para la programacion de la raiz n } 
          }else 
                return Math.pow(x,(numerador/denominador)+entero);
          }
        else return exponentes(x,y); 
       }

}//clase

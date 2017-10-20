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
public class Factorial {
   public double factorial(double x){
       double fact=1;
       Factorial f = new Factorial();    
       if(x<0)
           return Double.NaN;
       else
            if(x==0 || x==1){
                //System.out.println("El factorial es: "+fact);
                return fact;
            }
            else
            if(x%1>0)
            {
                //return Double.NaN;
                /*Si quitamos los comentarios de las lineas de abajo y ponemos en comentarios la linea de arriba, el programa sera capas de sacar el factorial
                  de un numero fraccionario positivo.
                  Se decidio ponerse en comentario porque la funcion la_gamma utiliza la libreria math.*/  
                
                fact = f.la_gamma(x) * x;
                return fact;
                //System.out.println("factorial extendido: "+fact);
            }
            else   
            {
                 while(x>0){
                     fact = fact *x;
                     x--;
                 }
                 return fact;
            }
   }
  
    	public double la_gamma(double x){
		double[] p = {0.99999999999980993, 676.5203681218851, -1259.1392167224028,
			     	  771.32342877765313, -176.61502916214059, 12.507343278686905,
			     	  -0.13857109526572012, 9.9843695780195716e-6, 1.5056327351493116e-7};
		int g = 7;
		if(x < 0.5) return 3.1416 / (Math.sin(3.1416 * x)*la_gamma(1-x));
 
		x -= 1;
		double a = p[0];
		double t = x+g+0.5;
		for(int i = 1; i < p.length; i++){
			a += p[i]/(x+i);
		}
 
		return Math.sqrt(2*3.1416)*Math.pow(t, x+0.5)*Math.exp(-t)*a;
	}
    
}

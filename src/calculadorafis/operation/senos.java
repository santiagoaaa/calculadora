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
public class senos {
    public  double E = 2.7182818284590452354;
    public  double PI = 3.14159265358979323846;

    public double sen(double grado) throws Exception {
        int i, signo = 1;
        double s = 0;
        boolean cuadrante = false;
        if ((grado > -1) && (grado < 360)) {
            grado = aRadianes(grado);
            if (grado == PI) {
                return 0;
            }
            if (grado >= PI + PI / 2) {
                grado -= PI;
                cuadrante = true;
            }
            if (grado > PI) {
                grado -= PI / 2;
                cuadrante = true;
            }
            for (i = 1; i < 10; i += 2) {
                s += signo * exponentes(grado, (double) i) / factorial(i);
                signo *= -1;
            }
        } else {
            if (grado < 0) {
                throw new Exception("El grado no puede ser negativo");
            }
            if (grado > 359) {
                throw new Exception("El grado no puede ser mayor a 359");
            }
        }
        if (cuadrante) {
            return s * -1;
        } else {
            return s;
        }
    }

    public double senh(double x) {
        return (exponentes(E, x) - exponentes(E, -x)) / 2;
    }

    public double aRadianes(double angulo) {
        return angulo / 180.0 * PI;
    }
}

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
public class Coseno {
    public double Cos(double x)
{
double coseno=0.d;
int signo = 1;
for(int i=0; i<100; i+=2)
{
coseno+=signo*elevar(x, i) / factorial(i);
signo*=-1;
}
return coseno;
}
public double Cosh(double num)
{
return ((elevar(2.71828, num)+elevar(2.71828, -num)))/2 ;
}
public double elevar(double x, double n)
{
double mult=1.0d;
for(int i=0;i<n;i++)
{
mult=mult*x;
}
return mult;
}
public double factorial(int numero) {
double factorial=1.0d;
for(int i=1;i<=numero;i++)
{
factorial*=i;
}
return factorial;
}
}

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
public class baseDiez {
    public double metodoBase10(double numero)
{
int base = 10;
double result=0.1;
double acum=1;
double n=0;
double raiz;
long potencia;
String m=String.valueOf(numero);
String[] separador;
separador = m.split("\\.");
if(separador[1].equals("0")||(separador.equals("00")))
{
if(numero<0)
{
if(numero<-1)
{
for(int i=-1; i>=numero; i--)
{
acum =acum*base;
}
result= 1/acum;
}
} else {
if(numero==1.0)
result = base;
else if(numero>1.0)
{
numero=numero-1;
result = base*metodoBase10(numero);
}
else
result = 1;
}
}
else
{
String tamdec=separador[1];
int tamaño=tamdec.length();
int poten=1;
if(numero<0)
{
potencia = Integer.parseInt(separador[0]+""+separador[1]);
for(int i=-1; i>=potencia; i--)
{
acum =acum*base;
}
raiz=acum;
for(int k=0;k<tamaño;k++)
{
poten=poten*10;
}
//El método exponente se tomó de los compañeros que les toco ese método
result= 1 / Exponente(raiz,1.0/poten);
}
else {
potencia = Integer.parseInt(separador[0]+""+separador[1]);
for(int i=0; i<potencia; i++)
{
acum =acum*base;
}
raiz=acum;
for(int k=0;k<tamaño;k++)
{
poten=poten*10;
}
//El método exponente se tomó de los compañeros que les toco ese método
result= Exponente(raiz,1.0/poten);
}
}
return result;
}

}

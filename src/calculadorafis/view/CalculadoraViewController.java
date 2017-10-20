/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorafis.view;

import calculadorafis.NumberTextField;
import calculadorafis.operation.Factorial;
import calculadorafis.operation.Modulo;
import calculadorafis.operation.baseDiez;
import calculadorafis.operation.lnBaseDiez;
import calculadorafis.operation.lnBaseN;
import calculadorafis.operation.senos;
import calculadorafis.operation.tan;
import calculadorafis.operation.tanh;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
/**
 * FXML Controller class
 *
 * @author Santiago
 */
public class CalculadoraViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    Factorial fact;
    Modulo mod;
    baseDiez bd;
    lnBaseN ln;
    lnBaseDiez log;
    tan tang;
    tanh tangh;
    senos sin;
    Double  primerTermino;
    //NumberTextField edt;
    @FXML
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    @FXML
    Button btnDel, btnPunto,btnLimpiar,  btnPorcentaje, btnDivision, btnMultiplicacion,
        btnResta, btnSuma, btnIgual, btnAbreParentesis, btnCierraParentesis, 
        btnInverso, btnMod,btnLog, btnXcuadrado, btnRaizCuadrada, btnLn, btnXcubico,
        btnRaizCubica, btn10X, btnTan, btnSen, btnCos, btnFactorial, btnTanh, btnSenh,
        btnCosh, btnXaY;
//    @FXML
//    Button btnLimpiar;
    
    @FXML
    NumberTextField edtNumeros;
    
    String bandera, cadena;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
       btnLimpiar.setOnAction(event -> edtNumeros.clear());
       
       btn1.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               cadena=null;
               cadena = edtNumeros.getText()+"1";
               edtNumeros.setText(cadena);           
           }
       });
              btn2.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
                cadena=null;
               cadena = edtNumeros.getText()+"2";
               edtNumeros.setText(cadena);           
           }
       });
              btn3.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
                cadena=null;
               cadena = edtNumeros.getText()+"3";
               edtNumeros.setText(cadena);           
           }
       });
                 btn4.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               cadena=null;
               cadena = edtNumeros.getText()+"4";
               edtNumeros.setText(cadena);           
           }
       });
          btn5.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
                cadena=null;
               cadena = edtNumeros.getText()+"5";
               edtNumeros.setText(cadena);           
           }
       });
          
                 btn6.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
                cadena=null;
               cadena = edtNumeros.getText()+"6";
               edtNumeros.setText(cadena);           
           }
       });
          btn7.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
                cadena=null;
               cadena = edtNumeros.getText()+"7";
               edtNumeros.setText(cadena);          
           }
       });
                 btn8.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
                cadena=null;
               cadena = edtNumeros.getText()+"8";
               edtNumeros.setText(cadena);           
           }
       });
                        btn9.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
                cadena=null;
               cadena = edtNumeros.getText()+"9";
               edtNumeros.setText(cadena);           
           }
       });
              btn0.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
                cadena=null;
               cadena = edtNumeros.getText()+"0";
               edtNumeros.setText(cadena);           
           }
       });
      
       
       btnPunto.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
                cadena=null;
               cadena = edtNumeros.getText()+".";
               edtNumeros.setText(cadena);
           }
       });
       
       btnSuma.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
                cadena=null;
               cadena = edtNumeros.getText()+"+";
               edtNumeros.setText(cadena);
           }
       });
       
       btnResta.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
                cadena=null;
               cadena = edtNumeros.getText()+"-";
               edtNumeros.setText(cadena);           
           }
       });
       
              
       btnIgual.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               if (bandera.equals("mod")){
               mod = new Modulo();
               String [] numbers = cadena.split(bandera); 
               double primerTermino, segundoTermino; 
               primerTermino =Double.parseDouble( numbers [0]);
               segundoTermino= Double.parseDouble( numbers [1]);
                edtNumeros.setText(""+mod.modulo(primerTermino, segundoTermino));
               }//if mod
               
               if(bandera.equals("ln")){
                   ln = new lnBaseN();
                   String [] numbers = cadena.split(bandera); 
                   double primerTermino, segundoTermino; 
                primerTermino =Double.parseDouble( numbers [0]);
                segundoTermino= Double.parseDouble( numbers [1]);
                edtNumeros.setText(""+ln.log(primerTermino, segundoTermino));
                
               }//if ln base n
               
               if(bandera.equals("log")){
                   log = new lnBaseDiez();
                   String [] numbers = cadena.split(bandera); 
                   double termino;
                   termino = Double.parseDouble( numbers [0]);
                   edtNumeros.setText(""+ log.log10(termino));
               }//if log base 10
               
               if (bandera.equals("tan")){
                   tang = new tan ();
                   String [] numbers = cadena.split(bandera); 
                   double termino;
                   termino = Double.parseDouble( numbers [0]);
                   edtNumeros.setText(""+ tang.tan(termino));                   
               }//if tan
               
              if (bandera.equals("tanh")){
                   tang = new tan ();
                   String [] numbers = cadena.split(bandera); 
                   double termino;
                   termino = Double.parseDouble( numbers [0]);
                   edtNumeros.setText(""+ tangh.tanh(termino));                   
               }//if tan
              
              if (bandera.equals("sen")){
                  sin = new senos();
                  String [] numbers = cadena.split(bandera); 
                   double termino;
                   termino = Double.parseDouble( numbers [0]);
                   edtNumeros.setText(""+ sin.sen(termino));    
              }
           }
       });
       
       
       /************EMPIEZAN LAS OPERACIONES*****************/
       
       btnFactorial.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               double x;
               x = Double.parseDouble(edtNumeros.getText());
               fact = new Factorial();
               edtNumeros.setText(""+fact.factorial(x));
           }
       });
       
       btnMod.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
                cadena=null;
               bandera="mod";
              // primerTermino = Double.parseDouble( edtNumeros.getText());
               cadena = edtNumeros.getText()+"mod";
               edtNumeros.setText(cadena);    
           }
       });
       
       btn10X.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               double num;
               bd = new baseDiez();
               cadena=null;
               cadena = edtNumeros.getText();
               num= Double.parseDouble(cadena);
               edtNumeros.setText(""+bd.metodoBase10(num));
           }
       });
       
       btnLn.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               cadena=null;
               bandera="ln";
               cadena = edtNumeros.getText()+"ln";
               edtNumeros.setText(cadena); 
           }
       });
       
       btnLog.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               cadenas("log");
           }
       });
       
       btnTan.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               cadenas("tan");
           }
       });
       
             btnTanh.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               cadenas("tanh");
           }
       });
             
        btnSen.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               cadenas("sen");
           }
       });
        
              btnSenh.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               cadenas("senh");
           }
       });

       
    }//initialize
    
    public void cadenas(String nombre){
        cadena=null;
               bandera = nombre;
               edtNumeros.setText(nombre);
    }
    
    
    
}//class

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorafis.view;

import calculadorafis.NumberTextField;
import calculadorafis.operation.Factorial;
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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       btnLimpiar.setOnAction(event -> edtNumeros.clear());
       
       btnPunto.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               String cadena;
               cadena = edtNumeros.getText()+".";
               edtNumeros.setText(cadena);
           }
       });
       
       btnSuma.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               String cadena;
               cadena = edtNumeros.getText()+"+";
               edtNumeros.setText(cadena);
           }
       });
       
       btnResta.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               String cadena;
               cadena = edtNumeros.getText()+"-";
               edtNumeros.setText(cadena);           
           }
       });
       
       btnFactorial.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               double x;
               x = Double.parseDouble(edtNumeros.getText());
               System.out.println("este valor tiene x= "+x*2);
               fact = new Factorial();
               edtNumeros.setText(""+fact.factorial(x));
           }
       });
       
    }//initialize
    
    
}//class

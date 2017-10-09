/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorafis;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 *
 * @author Santiago
 */
public class CalculadoraFIS extends Application {
    Stage _primaryStage;
    NumberTextField edtNumeros;
    
    
    @Override
    public void start(Stage primaryStage) {
         _primaryStage=primaryStage;
        inicializaComponentes(); 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private void inicializaComponentes() {
        BorderPane panelPrincipal=new BorderPane();
        panelPrincipal.setCenter(cal());
        StackPane root = new StackPane();
        root.getChildren().add(panelPrincipal);
        Scene scene = new Scene(root, 600, 500);
      // scene.getStylesheets().add("label.css");
        _primaryStage.setTitle("Calculadora");
        _primaryStage.setScene(scene);
        _primaryStage.show(); 
    }

    private VBox cal() {
        VBox panelMenuDatosGenerales = new VBox(5);
         FXMLLoader loader=new FXMLLoader();
         Parent fxmlMenu=null;
         try{
         fxmlMenu=loader.load(getClass().getResource("view/calculadoraView.fxml"));
         
         }catch(IOException e){
             e.printStackTrace();
         }
         panelMenuDatosGenerales
                 .getChildren()
                 .addAll(fxmlMenu);
        return panelMenuDatosGenerales;
    }
    
    

    
}

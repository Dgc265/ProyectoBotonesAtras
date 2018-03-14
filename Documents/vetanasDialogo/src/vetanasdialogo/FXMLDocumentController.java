/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetanasdialogo;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;

/**
 *
 * @author 53253095e
 */
public class FXMLDocumentController implements Initializable {
    
  
    @FXML
    private Button botonnformacion;
    @FXML
    private Button botonWarning;
    @FXML
    private Button botonInputDialog;
    @FXML
    private Button botonConfirmationVarios;
    @FXML
    private Button botonConfirmation;
    @FXML
    private Label mostrarMensaje;
    @FXML
    private Button botonChoice;
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void alertaInformacion(ActionEvent event) {
        Alert alerta = new Alert (AlertType.INFORMATION);
        alerta.setTitle("Modulo de Programacion");
        alerta.setHeaderText("Bienvenido al curso de JAVA FX");
        alerta.setContentText("En este tema veremos las ventanas de dialogo");
        alerta.showAndWait();
        
    }

    @FXML
    private void mostrarAlertaWarning(ActionEvent event) {
        Alert warning = new Alert(AlertType.WARNING);
        warning.setTitle("Módulo de Programacion");
        warning.setHeaderText("Ventana de aviso de algun preligro (warning)");
        warning.setContentText("Si te equivocas saldrá esta ventana");
        warning.showAndWait();
    }


    @FXML
    private void mostrarInputDialog(ActionEvent event) {
     
     TextInputDialog dialog = new TextInputDialog(""); 
     dialog.setTitle("Módulo de programacion");
     dialog.setHeaderText("Vetana para solicitar tu nombre");
     dialog.setContentText("nombre:");
     
     
     Optional <String> result = dialog.showAndWait();
     if(result.isPresent()){
      mostrarMensaje.setText("Gracias");
     
     }else {
     mostrarMensaje.setText("Debe escribir un nombre");
     }
    }

    @FXML
    private void mostrarAlertaConfirmationVarios(ActionEvent event) {
    }

    @FXML
    private void mostrarAlertaConfirmation(ActionEvent event) {
    
     
      Alert confirmacion = new Alert(AlertType.CONFIRMATION);
      ButtonType si = new ButtonType("Si");
      ButtonType no = new ButtonType("No");
      ButtonType meAbstengo = new ButtonType("Me abstengo");
      confirmacion.getButtonTypes().setAll(si,no,meAbstengo);
      confirmacion.setTitle("");
      confirmacion.setHeaderText("Módulo de Programacion");
      confirmacion.setContentText("Encuesta sobre el curso Java FX");
      
      Optional <ButtonType> result = confirmacion.showAndWait();
      if(result.get() == si){
       Alert alerta = new Alert (AlertType.INFORMATION);
        alerta.setTitle("Le informamos");
        alerta.setHeaderText(null);
        alerta.setContentText("Me alegro");
        alerta.showAndWait();
      
      }
     else if(result.get() == no){
      Alert alertaError = new Alert (AlertType.ERROR);
        alertaError.setTitle("Le informamos");
        alertaError.setHeaderText(null);
        alertaError.setContentText("Intentaremos mejorar");
        alertaError.showAndWait();
      
      
      }
     else if(result.get() == meAbstengo){
        Alert warning = new Alert(AlertType.WARNING);
        warning.setTitle("Le informamos");
        warning.setHeaderText(null);
        warning.setContentText("Necesitamos tu opinión");
        warning.showAndWait();
      
      
      }
   
      
    }

    @FXML
    private void mostrarChoice(ActionEvent event) {
      List <String> choices = new ArrayList <>();
      choices.add("Muy Malo");
      choices.add("Malo");
      choices.add("Bueno");
      choices.add("Muy Bueno");
      ChoiceDialog <String> dialog = new ChoiceDialog <> ("Bueno",choices);
      dialog.setTitle("Módulo de programacion");
      dialog.setHeaderText("Deseamos tu opinion");
      dialog.setContentText("elige una opcion");
      
      Optional <String> result = dialog.showAndWait();
      
      if(result.isPresent()){
      mostrarMensaje.setText(result.get());
      
      }else{
      mostrarMensaje.setText("Nos importa tu opinion......");
      }
      
    }
    
}

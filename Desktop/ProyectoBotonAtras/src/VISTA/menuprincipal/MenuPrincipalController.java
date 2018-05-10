
package VISTA.menuprincipal;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import VISTA.calendario.CALENDARIOController;
import VISTA.crearpaquetes.CREARPAQUETESController;
import VISTA.paquetescontratados.PAQUETESCONTRATADOSController;
import VISTA.perfil.PERFILController;


public class MenuPrincipalController implements Initializable {

    @FXML
    private Button btPaquetesContratado;
    @FXML
    private Button btPaquetes;
    @FXML
    private Button btCalendario;
    @FXML
    private Button btPerfil;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void paquetesContratados(ActionEvent event) {
        Parent root;

        try {
               FXMLLoader loader = new FXMLLoader();
          
            loader.setLocation(getClass().getResource("/VISTA/paquetescontratados/PAQUETESCONTRATADOS.fxml"));
            root = loader.load(); 

            
            Stage escenarioVentana = (Stage) btPaquetesContratado.getScene().getWindow();
            escenarioVentana.setTitle("Paquetes contratados");
            
            escenarioVentana.setScene(new Scene(root)); 
        } catch (IOException ex) {
            System.out.println("ERROR IOExcepction:  No se encuentra la ventana de login");
        }
    }

    @FXML
    private void mostrarPaquetes(ActionEvent event) {
        Parent root;
        try {
                 FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/VISTA/crearpaquetes/CREARPAQUETES.fxml"));
            root = loader.load();
            CREARPAQUETESController datosLogin = loader.getController();
            
            Stage escenarioVentana = (Stage) btPaquetesContratado.getScene().getWindow();
            escenarioVentana.setTitle("Creacion de Paquetes");
            
            escenarioVentana.setScene(new Scene(root)); 
        } catch (IOException ex) {
            System.out.println("ERROR IOExcepction:  No se encuentra la ventana de login");
        }
    }

    @FXML
    private void mostrarCalendario(ActionEvent event) {
        Parent root;
        try {
                FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/VISTA/calendario/CALENDARIO.fxml"));
            root = loader.load();
            CALENDARIOController datosLogin = loader.getController();
            Stage escenarioVentana = (Stage) btPaquetesContratado.getScene().getWindow();
            escenarioVentana.setTitle("Calendario Eventos");
            
            escenarioVentana.setScene(new Scene(root));
        } catch (IOException ex) {
            System.out.println("ERROR IOExcepction:  No se encuentra la ventana de login");
        }
    }

    @FXML
    private void mostrarPerfil(ActionEvent event) {
        Parent root;
        try {
        FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/VISTA/perfil/PERFIL.fxml"));
            root = loader.load();
            PERFILController datosLogin = loader.getController();
           Stage escenarioVentana = (Stage) btPerfil.getScene().getWindow();
           escenarioVentana.setTitle("Perfil");
           escenarioVentana.setScene(new Scene(root));
        } catch (IOException ex) {
            System.out.println("ERROR IOExcepction:  No se encuentra la ventana de login");
        }
    }

}

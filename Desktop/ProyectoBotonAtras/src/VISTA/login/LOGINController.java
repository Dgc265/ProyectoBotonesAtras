
package VISTA.login;

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
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import VISTA.registro.REGISTROController;
import VISTA.menuprincipal.MenuPrincipalController;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

/**
 * FXML Controller class
 *
 * @author 53752269g
 */
public class LOGINController implements Initializable {

    @FXML
    private Pane PanelLateral;
    @FXML
    private Pane login;
    @FXML
    private Button btRegistrarse;
    @FXML
    private Button btEntrar;
    @FXML
    private JFXTextField txNombreUsuario;
    @FXML
    private JFXPasswordField txContraseña;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void entrarAplicacion(ActionEvent event) {
       Parent root;

        try {
            
        FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/VISTA/menuprincipal/MenuPrincipal.fxml"));
            root = loader.load();
            
          
            MenuPrincipalController datosLogin = loader.getController();
            Stage escenarioVentana = (Stage) btEntrar.getScene().getWindow();
            escenarioVentana.hide();

            Stage escenario = new Stage();
            escenario.setTitle("Ventana de elección");
            escenario.initModality(Modality.APPLICATION_MODAL);  // NO PERMITE ACCESO A LA VENTANA PRINCIPAL
            escenario.setScene(new Scene(root));
            escenario.showAndWait();
            
          
           
            
        } catch (IOException ex) {            
            System.out.println("ERROR IOExcepction:  No se encuentra la ventana de login");
        }
    }

    @FXML
    private void registrarse(ActionEvent event) {
            Parent root;

        try {
            
                FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/VISTA/registro/REGISTRO.fxml"));
            root = loader.load();
            
          
            REGISTROController datosLogin = loader.getController();

            Stage escenario = new Stage();
            escenario.setTitle("Ventana de Registro");
            escenario.initModality(Modality.APPLICATION_MODAL);  // NO PERMITE ACCESO A LA VENTANA PRINCIPAL
            escenario.setScene(new Scene(root));
            escenario.showAndWait();
          
           
            
        } catch (IOException ex) {            
            System.out.println("ERROR IOExcepction:  No se encuentra la ventana de login");
        }
    }
    
}

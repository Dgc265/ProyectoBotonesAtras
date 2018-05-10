/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATOS;

import VISTA.login.LOGINController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kokekui
 */
public class GestionBD {

    private Connection conn;
    private final String usuario = "root";
    private final String password = "root";
// RESTO DE METODOS CUANDO SE ACLARE LA BD
    public GestionBD() {
    }

    public boolean conexion() {
        boolean conectado = false;
        String urlJDBC = "jdbc:mysql://localhost:3306/" + "parques";//He puesto parques porque aun no tenemos el nombre de nuestra BD
        try {
            conn = DriverManager.getConnection(urlJDBC, usuario, password);
            if (conn.isValid(0)) {
                conectado = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LOGINController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conectado;
    }

}

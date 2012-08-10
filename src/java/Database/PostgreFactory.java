/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import modelo.Pessoa;

/**
 *
 * @author samuel
 */
public class PostgreFactory {

  
    
    public DataSource getUnivi() throws NamingException {
        Context c = new InitialContext();
        return (DataSource) c.lookup("java:comp/env/univi");
    }


}

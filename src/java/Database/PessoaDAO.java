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
import javax.naming.NamingException;
import modelo.Pessoa;

/**
 *
 * @author samuel
 */
public class PessoaDAO extends PostgreFactory {

    //Consultas
    final String PessoaByName = "select * from pessoa where rg = ";
    final String insertPessoaQuery = "insert into pessoa (nome, email...) values ";

    public Pessoa findPessoaByRg(int rg) {
        Pessoa pessoa = new Pessoa(rg);
        try {
            Connection con = getUnivi().getConnection();
            PreparedStatement ps = con.prepareStatement(PessoaByName + rg + ";");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                pessoa.setNome(rs.getString("nome"));
                pessoa.setSexo(rs.getString("sexo"));
                pessoa.setNivel_De_Acesso(rs.getInt("nivel_de_acesso"));
                pessoa.setEmail(rs.getString("email"));
                pessoa.setLogin(rs.getString("login"));
                pessoa.setSenha(rs.getString("senha"));
            }

            con.close();

        } catch (NamingException ex) {
            Logger.getLogger(PostgreFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PostgreFactory.class.getName()).log(Level.SEVERE, null, ex);
        }

        return pessoa;
    }

    public void insertPessoa(Pessoa pessoa) {
        String st = insertPessoaQuery;

        st += "'" + pessoa.getNome() + "', '" + pessoa.getEmail() + "'...;";
        try {
            Connection con = getUnivi().getConnection();
            PreparedStatement ps = con.prepareStatement(st);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NamingException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.Cadastros;

import Bean.Pessoa;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author samuel
 */
@ManagedBean
@SessionScoped
public class CadastrarProfessorX extends Pessoa {

    Pessoa pessoa;

    /**
     * Construtor padrão da classe CadastrarUsuarioComun
     */
    public CadastrarProfessorX() {
    }

    /**
     * Construtor instanciavel da classe CadastrarUsuarioComun
     *
     * @param nome
     * @param email
     * @param sexo
     * @param rg
     * @param login
     * @param senha
     * @param reSenha
     */
    public CadastrarProfessorX(String nome, String email, boolean sexo, String rg, String login, String senha, String reSenha) {
        super(nome, email, sexo, rg, login, senha, reSenha);
    }

    boolean testarNull(CadastrarProfessorX cadastro) {
        if (cadastro.pessoa.getEmail() == null) {
            return false;
        }
        if (cadastro.pessoa.getLogin() == null) {
            return false;
        }
        if (cadastro.pessoa.getNome() == null) {
            return false;
        }
        if (cadastro.pessoa.getReSenha() == null) {
            return false;
        }
        if (cadastro.pessoa.getRg() == null) {
            return false;
        }
        if (cadastro.pessoa.getSenha() == null) {
            return false;
        }
        return true;
    }
}

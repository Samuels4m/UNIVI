/**
 * Classe Pessoa Sistema UNIVI Gerencia de produção. Programadores: Alexandre
 * Henrique Unfried - alexandre_unfried@hotmail.com Samuel Blum Vorpagel -
 * samuels4m@gmailcom
 */
package Bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Pessoa {

    /**
     * Atributos da classe Pessoa
     */
    String nome;
    String email;
    boolean sexo;
    String rg;
    String login;
    String senha;
    String reSenha;

    /**
     * Construtor padrão
     */
    public Pessoa() {
    }
    
    public boolean salvar (){
        
        return false;
    }

    /**
     * Construtor por Cópia
     *
     * @param nome
     * @param email
     * @param sexo
     * @param rg
     * @param login
     * @param senha
     * @param reSenha
     */
    public Pessoa(String nome, String email, boolean sexo, String rg, String login, String senha, String reSenha) {
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.rg = rg;
        this.login = login;
        this.senha = senha;
        this.reSenha = reSenha;
    }

    /**
     * Metodos pertencentes a classe Pessoa
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getReSenha() {
        return reSenha;
    }

    public void setReSenha(String reSenha) {
        this.reSenha = reSenha;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
}

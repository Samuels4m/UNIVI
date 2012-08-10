/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author samuel
 */
public class Pessoa {
    int rg;
    String nome;
    String sexo;
    int Nivel_De_Acesso;
    String Email;
    String Login;
    String Senha;

    public Pessoa(int rg) {
        this.rg = rg;
        //inicializa as outras variaveis vazias
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNivel_De_Acesso() {
        return Nivel_De_Acesso;
    }

    public void setNivel_De_Acesso(int Nivel_De_Acesso) {
        this.Nivel_De_Acesso = Nivel_De_Acesso;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
}

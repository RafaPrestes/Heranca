/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herança;

/**
 *
 * @author Usuário
 */
public class PessoaJuridica extends Pessoa{
    private String razao;
    private String cnpj;
    
    public PessoaJuridica(){
        
    }
    
    public PessoaJuridica(String razao, String cnpj, String email, String celular){
        super(email, celular);
        this.razao = razao;
        this.cnpj = cnpj;
    }
    
    public String imprimir(){
        return "Razão: " + razao + "\n" +
                "CNPJ: " + cnpj + "\n" + 
                "Email: " + getEmail() + "\n" + 
                "Celular: " + getCelular(); 
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
    
}

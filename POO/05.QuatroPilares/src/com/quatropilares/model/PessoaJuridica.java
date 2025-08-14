package com.quatropilares.model;

final public class PessoaJuridica extends Pessoa{
    private String razaosocial;
    private String nomefantaisa;
    private String cnpj;

    

    public PessoaJuridica(String razaosocial, String nomefantaisa, String cnpj, String email, String telefone, String endereco) {
        super(email, telefone, endereco); 
        this.razaosocial = razaosocial;
        this.nomefantaisa = nomefantaisa;
        this.cnpj = cnpj;
    }
    
      public String getRazaosocial() {
        return this.razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public String getNomefantasia() {
        return this.nomefantaisa;
    }

    public void setNomefantasia(String nomefantaisa) {
        this.nomefantaisa = nomefantaisa;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


}

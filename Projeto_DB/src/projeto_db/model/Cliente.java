
package projeto_db.model;


public class Cliente implements Elemento{
    public int codCli;
    public String nome;
    public String endereco;
    public String bairro;
    public String cidade;
    public String cep;
    public String uf;
    public String email;
    public String telefone;
    public String celular;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public int getCodCli() {
        return codCli;
    }

    public void setCodCli(int codCli) {
        this.codCli = codCli;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codCli=" + codCli + ", nome=" + nome + ", endereco=" + endereco + ", bairro=" + bairro + ", cidade=" + cidade + ", cep=" + cep + ", uf=" + uf + ", email=" + email + ", telefone=" + telefone + ", celular=" + celular + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.codCli;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        
        final Cliente other = (Cliente) obj;
        
        if(this.codCli != other.codCli){
            return false;
        }
        return true;
    }
    
    
    
    
}

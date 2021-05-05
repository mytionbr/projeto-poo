
package projeto_db.model;

import java.util.Date;





public class Produto {
      
        private int codProd;
        private String descricao;
        private double preco;
        private String unidade;
        private int qtde_inicial;
        private int qtde_atual;
        private Date data_cad;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    

    public int getQtde_inicial() {
        return qtde_inicial;
    }

    public void setQtde_inicial(int qtde_inicial) {
        this.qtde_inicial = qtde_inicial;
    }

    public int getQtde_atual() {
        return qtde_atual;
    }

    public void setQtde_atual(int qtde_atual) {
        this.qtde_atual = qtde_atual;
    }

    public Date getData_cad() {
        return data_cad;
    }

    public void setData_cad(Date data_cad) {
        this.data_cad = data_cad;
    }



    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }
        
        
}

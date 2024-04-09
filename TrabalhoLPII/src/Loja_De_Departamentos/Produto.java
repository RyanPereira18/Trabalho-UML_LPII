package Loja_De_Departamentos;

import java.util.Objects;


public class Produto {
    private Integer codProduto;
    private String descricao;
    private double precoCusto;
    private double precoVenda;

    public Produto() {
        
    }
    
    public Produto(String descricao, double pCusto, double pVenda) {
        this.descricao = descricao;
        this.precoCusto = pCusto;
        this.precoVenda = pVenda;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Integer getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Integer codProduto) {
        this.codProduto = codProduto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.codProduto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.codProduto, other.codProduto)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return descricao;
    }
}

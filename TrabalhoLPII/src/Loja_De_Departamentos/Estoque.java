package Loja_De_Departamentos;

import Loja_De_Departamentos.Produto;
import java.beans.Transient;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

public class Estoque {
    private Integer codEstoque;
    private Produto produto;
    private double quantidade;
    private Calendar dataValidade;
    private String lote;
    
    public Estoque() {
    
    }
    
    public Estoque(Produto produto, double quantidade, Calendar dataValidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;
    }
         
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Calendar getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Calendar dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Integer getCodEstoque() {
        return codEstoque;
    }

    public void setCodEstoque(Integer codEstoque) {
        this.codEstoque = codEstoque;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }
    
    @Transient
    public String getValidadeFormatado() {
        if(dataValidade != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            return sdf.format(dataValidade.getTime());
        } else {
            return "Sem Data de Validade";
        }
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(codEstoque, produto, quantidade, dataValidade, lote);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Estoque estoque = (Estoque) obj;
        return Double.compare(estoque.quantidade, quantidade) == 0 &&
               Objects.equals(codEstoque, estoque.codEstoque) &&
               Objects.equals(produto, estoque.produto) &&
               Objects.equals(dataValidade, estoque.dataValidade) &&
               Objects.equals(lote, estoque.lote);
    }
    
    @Override
    public String toString() {
        return "Estoque{" +
                "codEstoque=" + codEstoque +
                ", produto=" + produto +
                ", quantidade=" + quantidade +
                ", dataValidade=" + getValidadeFormatado() +
                ", lote='" + lote + '\'' +
                '}';
    }
}

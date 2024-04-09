package Loja_De_Departamentos;

import java.beans.Transient;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

public class Venda {
    private Integer codVenda;
    private Cliente cliente;
    private Funcionario funcionario;
    private double valorVenda;
    private Calendar dataVenda;

    public Venda() {
        
    }
    
    public Venda(Integer codVenda, Cliente cliente, Funcionario funcionario, double valorVenda, Calendar dataVenda) {
        this.codVenda = codVenda;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.valorVenda = valorVenda;
        this.dataVenda = dataVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Calendar getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Calendar dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Integer getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(Integer codVenda) {
        this.codVenda = codVenda;
    }
    
    @Transient
    public String getDataFormatada() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(dataVenda.getTime());
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.codVenda);
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
        final Venda other = (Venda) obj;
        if (!Objects.equals(this.codVenda, other.codVenda)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Venda [codVenda=" + codVenda + ", cliente=" + cliente + ", funcionario=" + funcionario + ", valorVenda="
                + valorVenda + ", dataVenda=" + getDataFormatada() + "]";
    }
}
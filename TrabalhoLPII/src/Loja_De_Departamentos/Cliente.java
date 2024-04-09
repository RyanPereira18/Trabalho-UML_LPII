package Loja_De_Departamentos;

import java.beans.Transient;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

public class Cliente implements Pessoa{
    private Integer codCliente;
    private String nome;
    private String cpf;
    private Calendar dataNascimento;
    private String telefone;
    private String endereco;
    
    public Cliente() {
        
    }
    
    public Cliente(String nome, String CPF, Calendar dataNasc, String telefone, String endereco){
        this.nome = nome;
        this.cpf = CPF;
        this.dataNascimento = dataNasc;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.codCliente);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.codCliente, other.codCliente)) {
            return false;
        }
        return true;
    }

    @Transient
    public String getNascimentoFormatado() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(dataNascimento.getTime());
    }
    
    @Override
    public String toString() {
        return nome + "; CPF: " + cpf;
    }
}

package Loja_De_Departamentos;

import java.beans.Transient;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Funcionario implements Pessoa{
    Integer codFuncionario;
    private String nome;
    private String cpf;
    private Calendar dataAdmissao;
    private Calendar dataRescisao;
    private String departamento;
    private String cargo;
    private double salario;
    
    public Funcionario() {
        
    }

    public Funcionario(String nome, String cpf, String dep, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.departamento = dep;
        this.salario = salario;
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

    public Calendar getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Calendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Calendar getDataRescisao() {
        return dataRescisao;
    }

    public void setDataRescisao(Calendar dataRescisao) {
        this.dataRescisao = dataRescisao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void bonifica(double aumento){
       this.salario = salario + aumento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Integer codFuncionario) {
        this.codFuncionario = codFuncionario;
    }
    
    @Transient
    public String getAdmissaoFormatado() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(dataAdmissao.getTime());
    }
    
    @Transient
    public String getRescisaoFormatado() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(dataRescisao.getTime());
    }
    
    @Override
    public String toString() {
        return nome + "; CPF: " + cpf;
    }
}

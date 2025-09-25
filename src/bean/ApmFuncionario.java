/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author win10
 */
@Entity
@Table(name="apm_funcionario"
    ,catalog="sistema_athilio"
)
public class ApmFuncionario  implements java.io.Serializable {


     private int apmIdFuncionario;
     private String apmNome;
     private String apmApelido;
     private String apmCpf;
     private Date apmDataNascimento;
     private String apmSenha;
     private int apmNivel;
     private String apmAtivo;

    public ApmFuncionario() {
    }

    public ApmFuncionario(int apmIdFuncionario, String apmNome, String apmApelido, String apmCpf, Date apmDataNascimento, String apmSenha, int apmNivel, String apmAtivo) {
       this.apmIdFuncionario = apmIdFuncionario;
       this.apmNome = apmNome;
       this.apmApelido = apmApelido;
       this.apmCpf = apmCpf;
       this.apmDataNascimento = apmDataNascimento;
       this.apmSenha = apmSenha;
       this.apmNivel = apmNivel;
       this.apmAtivo = apmAtivo;
    }
   
     @Id 

    
    @Column(name="apm_idFuncionario", unique=true, nullable=false)
    public int getApmIdFuncionario() {
        return this.apmIdFuncionario;
    }
    
    public void setApmIdFuncionario(int apmIdFuncionario) {
        this.apmIdFuncionario = apmIdFuncionario;
    }

    
    @Column(name="apm_nome", nullable=false, length=50)
    public String getApmNome() {
        return this.apmNome;
    }
    
    public void setApmNome(String apmNome) {
        this.apmNome = apmNome;
    }

    
    @Column(name="apm_apelido", nullable=false, length=25)
    public String getApmApelido() {
        return this.apmApelido;
    }
    
    public void setApmApelido(String apmApelido) {
        this.apmApelido = apmApelido;
    }

    
    @Column(name="apm_cpf", nullable=false, length=15)
    public String getApmCpf() {
        return this.apmCpf;
    }
    
    public void setApmCpf(String apmCpf) {
        this.apmCpf = apmCpf;
    }

    
    @Column(name="apm_dataNascimento", nullable=false, length=45)
    public Date getApmDataNascimento() {
        return this.apmDataNascimento;
    }
    
    public void setApmDataNascimento(Date apmDataNascimento) {
        this.apmDataNascimento = apmDataNascimento;
    }

    
    @Column(name="apm_senha", nullable=false, length=20)
    public String getApmSenha() {
        return this.apmSenha;
    }
    
    public void setApmSenha(String apmSenha) {
        this.apmSenha = apmSenha;
    }

    
    @Column(name="apm_nivel", nullable=false)
    public int getApmNivel() {
        return this.apmNivel;
    }
    
    public void setApmNivel(int apmNivel) {
        this.apmNivel = apmNivel;
    }

    
    @Column(name="apm_ativo", nullable=false, length=1)
    public String getApmAtivo() {
        return this.apmAtivo;
    }
    
    public void setApmAtivo(String apmAtivo) {
        this.apmAtivo = apmAtivo;
    }




}

package com.api.helpergov.model;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class FormularioVacina {
    private String nome;
    private String dataAdmin;
    private String dose;
    private String local;

    // Construtor vazio (necessário para formulários)
    public FormularioVacina() {}

    
    @NotBlank(message = "O nome da vacina é obrigatório.")
    @Size(max = 100, message = "O nome da vacina deve ter no máximo 100 caracteres.")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataAdmin() {
        return dataAdmin;
    }

    public void setDataAdmin(String dataAdmin) {
        this.dataAdmin = dataAdmin;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}

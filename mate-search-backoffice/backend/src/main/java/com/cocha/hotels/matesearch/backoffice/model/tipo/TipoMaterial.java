package com.cocha.hotels.matesearch.backoffice.model.tipo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.cocha.hotels.matesearch.backoffice.model.BackEndEntity;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TipoMaterial extends BackEndEntity {

    private static final long serialVersionUID = 1033348952152982832L;

    private String codigo;
    private String valor;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}

package src.model;

import java.util.Date;

import src.utils.DataUtil;

public class Movimentacao {
    private String descrição;

    private Date data;

    private Double valor;
 
    public Movimentacao(String descrição, Double valor) {
        this.descrição = descrição;
        this.data = new Date();
        this.valor = valor;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public Date getData() {
        return data;
    }
 
    public Double getValor() {
        return valor;
    }

    @Override
    public String toString(){
        String dataFormatada = DataUtil.converterDateParaDataEHora(this.getData());
        return this.getDescrição() + "\n" + dataFormatada + " - R$" + this.valor;
    }

}

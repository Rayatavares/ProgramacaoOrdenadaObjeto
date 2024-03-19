package model;

public enum EnumTipo {

  BASICO("Básico"),
  MASTER("Master"),
  PRESIDENCIAL("Suite Presidencial");

    private String valor;

    private EnumTipo(String valor){
        this.valor = valor;
    }
    
    public String getValor() {
        return valor;
    }
}

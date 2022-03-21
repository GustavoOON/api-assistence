package apiassistence.com.example.apiassistence.domain.enums;

public enum StatusCalled {

    INICIADO(1, "Iniciado"),
    GUINCHOACAMINHO(2, "Guincho a caminho"),
    FINALIZADO(3, "Finalizado");

    private int cod;

    private String descricao;

   private StatusCalled(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static StatusCalled toEnum(Integer cod) throws IllegalAccessException {
        if(cod == null){
            return null;
        }

        for(StatusCalled x : StatusCalled.values()){
            if(cod.equals(x.getCod())){  // se o codigo for 1 retorna pessoa fisica, se 2 pessoa juridica
                return x;
            }
        }

        throw new IllegalAccessException("id Invalido" + cod);
    }

}

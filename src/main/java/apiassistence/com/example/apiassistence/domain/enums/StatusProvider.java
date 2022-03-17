package apiassistence.com.example.apiassistence.domain.enums;

public enum StatusProvider {


    ONLINE(1, "Online"),
    OFFLINE(2, "Offline"),
    AUSENTE(3, "Ausente");

    private Integer cod;
    private String descricao;

    private StatusProvider(Integer cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public Integer getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static StatusProvider toEnum(Integer cod) throws IllegalAccessException {
        if(cod == null){
            return null;
        }

        for(StatusProvider x : StatusProvider.values()){
            if(cod.equals(x.getCod())){  // se o codigo for 1 retorna pessoa fisica, se 2 pessoa juridica
                return x;
            }
        }

        throw new IllegalAccessException("id Invalido" + cod);
    }
}

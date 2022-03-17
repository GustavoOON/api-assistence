package apiassistence.com.example.apiassistence.domain.enums;

public enum TypeProvider {

    GUINCHO(1, "Guincho"),
    REBOQUE(2, "Reboque"),
    BORRACHEIRO(3, "Borracheiro"),
    MOTOBOY(4, "Motoboy");

    private int cod;
    private String Descricao;

    private TypeProvider(int cod, String descricao) {
        this.cod = cod;
        Descricao = descricao;
    }

    public int getCod() {return cod;}

    public String getDescricao() {return Descricao;}

    public static TypeProvider toEnum(Integer cod) throws IllegalAccessException {
        if(cod == null){
            return null;
        }

        for(TypeProvider x : TypeProvider.values()){
            if(cod.equals(x.getCod())){  // se o codigo for 1 retorna pessoa fisica, se 2 pessoa juridica
                return x;
            }
        }

        throw new IllegalAccessException("id Invalido" + cod);
    }
}

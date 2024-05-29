public class Glaceon extends Eevee{
    private String tipo;

    //metodo construtor
    public Glaceon(String tipo){
        this.tipo = tipo;
    }

    public Glaceon(){
        
    }

    //getters e setters
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    //metodos
    public String ataque(){
        return ataque();
    }
    public String especial(){
        return especial();
    }
    public String defesa(){
        return defesa();
    }
}

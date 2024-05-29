public class Espeon extends Eevee{
    private String tipo;

    //getters e setters
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //metodo construtor
    public Espeon(double peso, int altura, int hp, String tipo){
        super(peso, altura, hp);
        this.tipo = tipo;
    }

    public Espeon(){
        
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

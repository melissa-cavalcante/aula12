
 public class Espeon extends Eevee {   
    public Espeon(String tipo, int altura, int hp, double peso) {
        super(tipo, altura, hp, peso);
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }
    
    @Override
    public String ataque(){
        return "Syncronize";
    }
    @Override
    public String defesa(){
        return "Defesa psiquica";
    }
    @Override
    public String especial(){
        return "Magic Bounce";
    }
}

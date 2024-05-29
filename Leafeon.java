public class Leafeon extends Eevee{
    public Leafeon(String tipo, int altura, int hp, double peso) {
        super(tipo, altura, hp, peso);
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }
    
    @Override
    public String ataque(){
        return "Leaf guard";
    }
    @Override
    public String defesa(){
        return "Defesa de planta";
    }
    @Override
    public String especial(){
        return "Chlorophyll";
    }
}

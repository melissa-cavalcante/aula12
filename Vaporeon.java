public class Vaporeon extends Eevee{
    public Vaporeon(String tipo, int altura, int hp, double peso) {
        super(tipo, altura, hp, peso);
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }
    
    @Override
    public String ataque(){
        return "Water absorb";
    }
    @Override
    public String defesa(){
        return "Defesa de agua";
    }
    @Override
    public String especial(){
        return "Hydration";
    }
}

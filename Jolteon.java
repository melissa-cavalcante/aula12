public class Jolteon extends Eevee {
    public Jolteon(String tipo, int altura, int hp, double peso) {
        super(tipo, altura, hp, peso);
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }
    
    @Override
    public String ataque(){
        return "Trovoada- Thunder Shock";
    }
    @Override
    public String defesa(){
        return "Carga- Wild Charge";
    }
    @Override
    public String especial(){
        return "Raio- Thunder";
    }
}

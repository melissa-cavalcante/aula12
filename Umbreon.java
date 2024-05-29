public class Umbreon extends Eevee{
    public Umbreon(String tipo, int altura, int hp, double peso) {
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
        return "Defesa noturna";
    }
    @Override
    public String especial(){
        return "Inner focus";
    }
}

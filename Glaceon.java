public class Glaceon extends Eevee{
    public Glaceon(String tipo, int altura, int hp, double peso) {
        super(tipo, altura, hp, peso);
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }

    @Override
    public String ataque(){
        return "Snow cloak";
    }
    @Override
    public String defesa(){
        return "Defesa de gelo";
    }
    @Override
    public String especial(){
        return "Ice Body";
    }
}

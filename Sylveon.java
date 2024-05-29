public class Sylveon extends Eevee{
    public Sylveon(String tipo, int altura, int hp, double peso) {
        super(tipo, altura, hp, peso);
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }

    @Override
    public String ataque(){
        return "Cute charm";
    }
    @Override
    public String defesa(){
        return "Defesa de fada";
    }
    @Override
    public String especial(){
        return "Pixilate";
    }
}

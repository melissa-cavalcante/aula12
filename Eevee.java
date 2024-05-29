public class Eevee {
    protected double peso;
    protected int altura;
    protected int hp;
    protected String tipo;

    //metodo construtor
    public Eevee(String tipo, int altura, int hp, double peso){
        this.peso = peso;
        this.altura = altura;
        this.hp = hp;
        this.tipo = tipo;
    }

    public Eevee(){

    }

    //getters e setters
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
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

    public void imprimir(){
        System.out.println("Tipo: " + getTipo());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
        System.out.println("Hp: " + getHp());
    }
}

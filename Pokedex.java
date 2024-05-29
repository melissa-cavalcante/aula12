public class Pokedex extends Eevee{
    public static void main(String[] args) throws Exception {
        
        Eevee e = new Eevee("Normal", 3, 55, 6.5);
        Jolteon j = new Jolteon("Elétrico", 10, 65, 25);
        Espeon es = new Espeon("Psiquico", 10, 65, 25);
        Floreon f = new Floreon("Fogo", 10, 65, 25);
        Glaceon g = new Glaceon("Gelo", 10, 65, 25);
        Leafeon l = new Leafeon("Folha", 10, 65, 25);
        Sylveon s = new Sylveon("Fairy", 10, 95, 25);
        Umbreon u = new Umbreon("Noturno", 10, 95, 25);
        Vaporeon v = new Vaporeon("Áquatico", 10, 130, 25);

        //Eevee
        System.out.println("Eu sou Eevee");  
        System.out.println("Ataque: "+e.ataque());
        System.out.println("Defesa: "+e.defesa());
        System.out.println("Especial: "+e.especial());
        e.imprimir();

        System.out.println("");

        //Jolteon
        System.out.println("Eu sou Jolteon");
        System.out.println("Ataque: "+j.ataque());
        System.out.println("Defesa: "+j.defesa());
        System.out.println("Especial: "+j.especial());
        j.imprimir();

        System.out.println("");
        

        //Espeon
        System.out.println("Eu sou Espeon");
        System.out.println("Ataque: "+es.ataque());
        System.out.println("Defesa: "+es.defesa());
        System.out.println("Especial: "+es.especial());
        es.imprimir();

        System.out.println("");

        //Glaceon
        System.out.println("Eu sou Glaceon");
        System.out.println("Ataque: "+g.ataque());
        System.out.println("Defesa: "+g.defesa());
        System.out.println("Especial: "+g.especial());
        g.imprimir();

        System.out.println("");

        //Leafeon
        System.out.println("Eu sou Leafeon");
        System.out.println("Ataque: "+l.ataque());
        System.out.println("Defesa: "+l.defesa());
        System.out.println("Especial: "+l.especial());
        l.imprimir();

        System.out.println("");

        //Sylveon
        System.out.println("Eu sou Sylveon");
        System.out.println("Ataque: "+s.ataque());
        System.out.println("Defesa: "+s.defesa());
        System.out.println("Especial: "+s.especial());
        s.imprimir();

        System.out.println("");

        //Umbreon
        System.out.println("Eu sou Umbreon");
        System.out.println("Ataque: "+u.ataque());
        System.out.println("Defesa: "+u.defesa());
        System.out.println("Especial: "+u.especial());
        u.imprimir();

        System.out.println("");

        //Vaporeon
        System.out.println("Eu sou Vaporeon");
        System.out.println("Ataque: "+v.ataque());
        System.out.println("Defesa: "+v.defesa());
        System.out.println("Especial: "+v.especial());
        v.imprimir();

        System.out.println("");

        //Flareon
        System.out.println("Eu sou Flareon");
        System.out.println("Ataque: "+f.ataque());
        System.out.println("Defesa: "+f.defesa());
        System.out.println("Especial: "+f.especial());
        f.imprimir();

        
        
    }
    }

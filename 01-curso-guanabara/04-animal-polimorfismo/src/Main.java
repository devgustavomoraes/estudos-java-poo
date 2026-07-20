public class Main {
    public static void main(String[] args) {

        Mamifero m = new Mamifero();

        m.setPeso(85.3f);
        m.setCorPelo("Marrom");
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();

        Reptil r = new Reptil();

        r.setPeso(0.95f);
        r.setIdade(1);
        r.setMembros(4);
        r.locomover();
        r.alimentar();
        r.emitirSom();

        Peixe p = new Peixe();

        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();

        Ave a = new Ave();

        a.setPeso(0.89f);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();

        Canguru c = new Canguru();

        c.setPeso(55.30f);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover(); // Saltando (Aplica-se o polimorfismo de sobreposição)
        c.alimentar(); // Mamando
        c.emitirSom(); // Som de Mamífero
        c.usarBolsa(); // Usando bolsa

        Cachorro k = new Cachorro();

        k.setPeso(3.94f);
        k.setIdade(5);
        k.setMembros(4);
        k.locomover(); // Correndo
        k.alimentar(); // Mamando
        k.emitirSom(); // Som de Mamífero
        k.abanarRabo(); // Abanando o rabo

        // Exemplo de sobrecarga (variás formas de chamar um metodo)
        k.reagir("Olá");
        k.reagir("Vai apanhar");
        k.reagir(11, 45);
        k.reagir(21, 00);
        k.reagir(true);
        k.reagir(false);
        k.reagir(2, 12.5f);
        k.reagir(17, 4.5f);

        Cobra j = new Cobra();

        Tartaruga t = new Tartaruga();

        GoldFish g = new GoldFish();

        Arara e = new Arara();


    }
}
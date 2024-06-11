import java.util.ArrayList;

public class Main {

    public String name;

    static String nomeDoPrograma = "introducao a POO";

    public int salary;

    public static void main(String[] args) {
        Ser meuSerAnimal = new Cachorro("Biscoito", 4, "Jean");
        Ser meuSerHumano = new Pessoa("Jean", 30, "Fogaca");
        meuSerAnimal.setNome("Jean");
        System.out.println(meuSerAnimal.saudacao());
        System.out.println(meuSerHumano.saudacao());
        System.out.println(nomeDoPrograma);
    }

    private void atualizaSalario(){
        this.salary = 4000;
    }

    public int getSalary(){
        this.atualizaSalario();
        return this.salary;
    }
}
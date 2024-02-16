package primeiro_exemplo;

import primeiro_exemplo.modelos.Pessoa ;


public class Hello {
    public static void main(String[] args) {
        int cont = 10;
        String nome = "Marco";
        System.out.println("Olá Mundo!!!");

        System.out.println(nome + " é um  " + cont);

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        Pessoa p4 = new Pessoa();
        
        p1.nome = "Marco";
        p1.idade = 43 ;
    
        p2.nome = "Rafael";
        p2.idade = 17;

        p3.idade =  p1.idade +  p2.idade;
        System.out.println("Seu professor é o  " + p1.nome + ".  Ele que tem que idade?   "  );

        System.out.println( + p1.idade);

        System.out.println("O Aluno é o  " + p2.nome + ".  Ele que tem que idade?   "  );

        System.out.println( + p2.idade);

        System.out.println("Juntando as idade eles tem    "  );
        System.out.println( +  p3.idade);

        System.out.println(p1.verificarMaioridade()  );
        System.out.println(p2.verificarMaioridade()  );
    }
}
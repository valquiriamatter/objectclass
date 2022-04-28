public class Principal{

    public static void main(String[] args){

        Pessoa pessoa1 = new Pessoa();

        Pessoa pessoa2 = pessoa1.clone();
        System.out.println("A pessoa 2 é: " + pessoa2);

        //Cria uma outra pessoa para poder comparar
        Pessoa pessoa3 = new Pessoa();

        //Compara se os objetos são iguais.
        boolean eIgual = pessoa2.equals(pessoa3);
        System.out.println("Pessoa 2 e 3 são iguais? " + eIgual);

        //Compara se os objetos são iguais e já imprime o resultado tudo numa mesma linha
        //Observe que o resultado será verdadeiro, já que a pessoa 2 é um clone da pessoa 1
        System.out.println("Pessoa 1 e 2 são iguais? " + pessoa1.equals(pessoa2));

        //Retorna a classe e o pacote que originou o objeto.
        Class classe = pessoa1.getClass();
        System.out.println("O nome da classe é: " + classe);

        //Retorna um número inteiro que identifica o objeto.
        int hashCode = pessoa1.hashCode();
        System.out.println("O código de dentificação do objeto é: " + hashCode);

        //Retorna uma String de representação do objeto.
        String descricaoObjeto = pessoa1.toString();
        System.out.println("Esse é o toString() original herdado de Object: " + descricaoObjeto);

        //Quando você imprime o objeto, automaticamente o toString é chamado, observe:
        System.out.println("Esse é o toString() original herdado de Object chamado diretamente: " + pessoa1);

        //Interrompe a thread atual do objeto em questão colocando-a em espera.
        //pessoa2.wait();
        //Interrompe a thread atual do objeto em questão colocando-a em espera por um determinado tempo passado como parâmetro.
        //pessoa3.wait(100);
        //Interrompe a thread atual do objeto em questão colocando-a em espera por um determinado tempo passados como parâmetros.
        //pessoa3.wait(50, 10);

        //Retoma a execução da thread em questão.
        //pessoa2.notify();
        //Retoma a execução de todas as threads.
        //pessoa2.notifyAll();






    }


}

import javax.swing.*;

public class main {
    public static void main(String[] args) {

        //Tamanho da String, ou quantidade de caracteres
        String nome = new String("Italo Hugo");
        int tam = nome.length();
        System.out.println("O nome "+nome+" tem "+tam+" caracteres ");

        //posição de um caractere
        int indice = nome.indexOf(" ");
        System.out.println("Posicao do espaco: "+indice+" ");

        //Separando nome e sobre nome
        String nome_= nome.substring(0, indice);
        String sobrenome = nome.substring(indice+1, tam);
        System.out.println("Nome: "+nome_+" ");
        System.out.println("Sobrenome: "+sobrenome+"");

        //Entrada de dados
        //Scanner teclado = new Scanner(System.in);
        //String s = teclado.next("Digite seu nome:");

        //Interface Grafica, Leitura e print
        String nome_tela = JOptionPane.showInputDialog("Digite um nome:");
        JOptionPane.showMessageDialog(null, "Voçe digitou "+nome_tela);
    }
}
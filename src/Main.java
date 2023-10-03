import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random ran = new Random();
    static ArrayList<Filme> filmes = new ArrayList<>();
    public static void main(String[] args) {
        int escolha = 0;
        do{
            System.out.print("""
                    --- bem vindo ao jogo do adivinha ---
                        [1] Jogar jogo de adivinhar numero
                        [2] Jogar jogo de adivinhar Filme
                        [3] Sair
                    >\t""");
            escolha = sc.nextInt();
            switch (escolha){
                case 1 ->{
                    jogar();
                }
                case 2->{
                    precadastroFilmes();
                    jogarJogoAdivinhaFilme();
                }
                case 3->{
                    System.out.println("Voce escolheu sair...");
                    System.exit(0);
                }
            }
        }while (escolha!=3);
    }

    private static void jogarJogoAdivinhaFilme() {
        Filme filmeCerto = filmes.get(ran.nextInt(3));
        String nomeFilmeUsuario = "";
        for (int i = 4;(!filmeCerto.getNome().equals(nomeFilmeUsuario)) && i!=0;) {
            if(i!=4){
                System.out.print("Dica: ");
                if (filmeCerto.getNome().equals("o lobo de wall street") && i==3){
                    System.out.println("Um rico corretor de wall street");
                }else if (filmeCerto.getNome().equals("avatar") && i==3){
                    System.out.println("os homi é azul");
                }else if(filmeCerto.getNome().equals("velozes e furiosos") && i==3){
                    System.out.println("ja é uma saga de 10 filmes sobre carros");
                }

                if (filmeCerto.getNome().equals("o lobo de wall street") && i==2){
                    System.out.println("O nome do corretor é Jordan Belfort");
                }else if (filmeCerto.getNome().equals("avatar") && i==2){
                    System.out.println("São muito altos, tem caldas e os homi é azul");
                }else if(filmeCerto.getNome().equals("velozes e furiosos") && i==2){
                    System.out.println("São furiosos");
                }

                if (filmeCerto.getNome().equals("o lobo de wall street") && i==1){
                    System.out.println("o filme não pode ser assistido em familia");
                }else if (filmeCerto.getNome().equals("avatar") && i==1){
                    System.out.println("Lutam pelos seus direitos");
                }else if(filmeCerto.getNome().equals("velozes e furiosos") && i==1){
                    System.out.println("São velozes e apresentam estado de furia");
                }
                System.out.println("Voce só tem mais: "+i+" chances");
                System.out.println("Digite o nome de um filme: ");
            }
            nomeFilmeUsuario = sc.nextLine();
            if (filmeCerto.getNome().equals(nomeFilmeUsuario)){
                System.out.println("Voce ganhou!");
                i=0;
            }else {
                i--;
            }
        }

    }

    private static void precadastroFilmes() {
        Filme filme1 = new Filme("velozes e furiosos");
        Filme filme2 = new Filme("avatar");
        Filme filme3 = new Filme("o lobo de wall street");
    }

    private static void jogar() {
        int numeroAleatorio = ran.nextInt(1000);
        do {
            System.out.println("Digite um número: ");
            int num = sc.nextInt();
            if (num==numeroAleatorio){
                System.out.println("Joga muito");
                System.exit(0);
            }else if (num<numeroAleatorio){
                System.out.println("Numero maior");
            }else {
                System.out.println("Numero menor");
            }
        }while (true);

    }
}

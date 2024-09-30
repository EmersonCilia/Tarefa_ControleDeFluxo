

public class Main {
    public static void main(String[] args) {

        int media1 = 7;
        int media2 = 10;
        int media3 = 5;
        int media4 = 8;
        double mediaFinal = (double) (media1 + media2 + media3 + media4) / 4;

        if(mediaFinal > 7) {
            System.out.printf("O aluno foi aprovado com a nota %.2f", mediaFinal);
        } else if (mediaFinal >=5 && mediaFinal < 7) {
            System.out.printf("O aluno está de recuperação com a nota %.2f", mediaFinal);
        } else if (mediaFinal <5) {
            System.out.printf("O aluno foi reprovado com a nota %.2f", mediaFinal);
        }
    }
}
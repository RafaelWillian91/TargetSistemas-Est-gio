import java.util.Scanner;

public class Exercicio_5 {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite uma string para inverter: ");
            String input = scanner.nextLine();

            String invertedString = inverterString(input);

            System.out.println("String invertida: " + invertedString);

            scanner.close();
        }

        // Função para inverter uma string
        public static String inverterString (String str){
            char[] caracteres = str.toCharArray();
            int tamanho = caracteres.length;

            // Inverte a string
            for (int i = 0; i < tamanho / 2; i++) {
                char temp = caracteres[i];
                caracteres[i] = caracteres[tamanho - 1 - i];
                caracteres[tamanho - 1 - i] = temp;
            }

            return new String(caracteres);
        }
    }

import javax.swing.*;

public class ExercicioA {
    public static void main(String[] args) {

        int n = 10;
        int valores [] = new int[10];

        for (int i = 0; i<n; i++) {
            valores [i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        }

        String saida = "Os valores em ordem inversa a entrada são:\n";
        for (int i = n-1;i>0;i--) {
            saida = saida + valores[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, saida);
    }

}
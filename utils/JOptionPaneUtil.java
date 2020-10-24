package utils;

import static javax.swing.JOptionPane.DEFAULT_OPTION;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;

import javax.swing.JOptionPane;

public class JOptionPaneUtil {

    public static int exibirJanelaDeConfirmacao(String titulo, String msg) {
        return JOptionPane.showConfirmDialog(null, msg, titulo, YES_NO_OPTION);
    }

    public static int exibirJanelaDeOpcoesBotao(String titulo, String msg, String[] options) {
        return JOptionPane.showOptionDialog(null, msg, titulo, DEFAULT_OPTION, WARNING_MESSAGE, null, options,
                options[0]);
    }

    public static String exibirJanelaDeEntrada(String msg) {
        return JOptionPane.showInputDialog(msg);
    }

    public static void exibirJanela(String titulo, String msg, int tipo) {
        JOptionPane.showMessageDialog(null, msg, titulo, tipo);
    }

    public static void exibirJanelaInformacao(String titulo, String msg) {
        JOptionPane.showMessageDialog(null, msg, titulo, INFORMATION_MESSAGE);
    }

    public static void exibirJanelaDeErro(String titulo, String msg) {
        JOptionPane.showMessageDialog(null, msg, titulo, ERROR_MESSAGE);
    }

    public static Object exibirJanelaDeOpcoesLista(String titulo, String msg, Object[] possibleValues) {
        return JOptionPane.showInputDialog(null, msg, titulo, INFORMATION_MESSAGE, null, possibleValues,
                possibleValues[0]);
    }
}

package gui.util;

import javafx.scene.control.TextField;

public class ValidacoesUtils {

	private static final String REGEX_INTEGER_NUMEROS = "\\d*";
	private static final String REGEX_DOUBLE_NUMEROS = "\\d*([\\.]\\d*)?";

	/**
	 * Metodo responsavel por escutar o campo do primeiro numero no momento que o
	 * usuario está digitando e validar se o número digitado é Inteiro
	 * 
	 * @param textField
	 */
	public static void validaNumerosInteiros(TextField textField) {
		textField.textProperty().addListener((observacao, antigoValor, novoValor) -> {
			if (novoValor != null && !novoValor.matches(REGEX_INTEGER_NUMEROS)) {
				textField.setText(antigoValor);
			}
		});
	}

	/**
	 * Metodo responsavel por escutar o campo do primeiro numero no momento que o
	 * usuario está digitando e validar se o número digitado são pontos flutuante
	 * (Double)
	 * 
	 * @param textField
	 */
	public static void validaNumerosFlutuante(TextField textField) {
		textField.textProperty().addListener((observacao, antigoValor, novoValor) -> {
			if (novoValor != null && !novoValor.matches(REGEX_DOUBLE_NUMEROS)) {
				textField.setText(antigoValor);
			}
		});
	}

	/**
	 * Metodo responsavel por validar o tamanho do numero digitado no campo em tempo
	 * de edição e adicionar o ultimo valor abaixo do valor maximo
	 * 
	 * @param textField
	 * @param maximo
	 */
	public static void validaTamanhoValor(TextField textField, int maximo) {
		textField.textProperty().addListener((observacao, antigoValor, novoValor) -> {
			if (novoValor != null && novoValor.length() > maximo) {
				textField.setText(antigoValor);
			}
		});
	}

}

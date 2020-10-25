package gui.controller;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.AlertasUtils;
import gui.util.ValidacoesUtils;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController implements Initializable {

	@FXML
	private TextField textPrimeiroNumero;

	@FXML
	private TextField textSegundoNumero;

	@FXML
	private Label labelResultado;

	@FXML
	private Button buttonCalcular;

	@FXML
	public void onBotaoCalcular() {
		try {
			Locale.setDefault(Locale.US);
			Double primeiroValor = Double.parseDouble(textPrimeiroNumero.getText());
			Double segundoValor = Double.parseDouble(textSegundoNumero.getText());

			Double soma = primeiroValor + segundoValor;
			labelResultado.setText(String.format("%.2f", soma));
		} catch (Exception e) {
			AlertasUtils.mensagemAlerta("Erro de exceção", null, e.getMessage(), AlertType.ERROR);
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ValidacoesUtils.validaNumerosFlutuante(textPrimeiroNumero);
		ValidacoesUtils.validaNumerosFlutuante(textSegundoNumero);

	}
}

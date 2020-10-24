package gui.controller;

import gui.util.AlertasUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {

	@FXML
	private Button botao;

	@FXML
	public void onBotaoClique() {
		AlertasUtils.mensagemAlerta("Titulo do alerta", "Cabeçalho do alerta", "Mensagem de texto no corpo",
				AlertType.INFORMATION);
	}
}

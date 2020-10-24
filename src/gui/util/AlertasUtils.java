package gui.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AlertasUtils {

	public static void mensagemAlerta(String titulo, String cabecalho, String conteudo, AlertType tipoAlerta) {
		Alert alert = new Alert(tipoAlerta);
		alert.setTitle(titulo);
		alert.setHeaderText(cabecalho);
		alert.setContentText(conteudo);
		alert.show();
	}
}

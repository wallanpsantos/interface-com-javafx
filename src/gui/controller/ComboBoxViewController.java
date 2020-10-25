package gui.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import gui.util.FormatacaoUtils;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import model.entities.PessoaModelEntity;

public class ComboBoxViewController implements Initializable {

	@FXML
	private ComboBox<PessoaModelEntity> comboBoxPessoaModelEntity;

	@FXML
	private ObservableList<PessoaModelEntity> observableListaPessoas;

	@FXML
	public void onComboBoxPessoaSelecionada() {
		PessoaModelEntity pessoaModelEntity = comboBoxPessoaModelEntity.getSelectionModel().getSelectedItem();
		JOptionPane.showMessageDialog(null, "Nome selecionado: " + pessoaModelEntity.getNome());
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		List<PessoaModelEntity> listaPessoas = new ArrayList<>();

		listaPessoas.add(new PessoaModelEntity(1, "Nami", "nami@gmail.com"));
		listaPessoas.add(new PessoaModelEntity(2, "Luffy", "luffy@gmail.com"));
		listaPessoas.add(new PessoaModelEntity(3, "Zoro", "zoro@gmail.com"));

		observableListaPessoas = FXCollections.observableArrayList(listaPessoas);

		comboBoxPessoaModelEntity.setItems(observableListaPessoas);

		FormatacaoUtils.listaComboBoxParaString(comboBoxPessoaModelEntity);

	}
}

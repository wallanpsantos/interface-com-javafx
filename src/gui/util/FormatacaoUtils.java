package gui.util;

import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import model.entities.PessoaModelEntity;

public class FormatacaoUtils {

	/**
	 * Metodo responsavel por refatorar lista apresentada no ComboBox para String
	 * pegando apenas o nome da pessoa
	 * 
	 * @param comboBoxPessoaModelEntity
	 */
	public static void listaComboBoxParaString(ComboBox<PessoaModelEntity> comboBoxPessoaModelEntity) {

		Callback<ListView<PessoaModelEntity>, ListCell<PessoaModelEntity>> refatoracao = listaPessoa -> new ListCell<PessoaModelEntity>() {
			@Override
			protected void updateItem(PessoaModelEntity pessoa, boolean vazio) {
				super.updateItem(pessoa, vazio);
				setText(vazio ? "" : pessoa.getNome());
			}
		};
		comboBoxPessoaModelEntity.setCellFactory(refatoracao);
		comboBoxPessoaModelEntity.setButtonCell(refatoracao.call(null));
	}

}

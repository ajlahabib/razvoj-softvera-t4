package ba.unsa.etf.rs.tut4;

import javafx.scene.control.ChoiceBox;
import javafx.fxml.Initializable;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
   public ChoiceBox<Artikal> IzborArtikla;
   private  ObservableList<Artikal>artikal=FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        artikal.add(new Artikal("HLB001","Hljeb",0.9));
        IzborArtikla.setItems(artikal);
    }

}

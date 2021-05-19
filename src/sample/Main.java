package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        StatistiekGegeven melding = new StatistiekGegeven();
        Account ac1 = new Account("Jordy");
        Account ac2 = new Account("Dylan");
        Account ac3 = new Account("Sven");
        Account ac4 = new Account("Thijmen");
        Account ac5 = new Account("Jesper");
        melding.afspraakKlaar(ac1);
        melding.afspraakKlaar(ac2);
        melding.afspraakNietKlaar(ac3);
        melding.afspraakNietKlaar(ac4);
        melding.afspraakKlaar(ac5);
        ac1.bepaaldeMelding(melding);
        ac2.bepaaldeMelding(melding);
        ac3.bepaaldeMelding(melding);
        ac4.bepaaldeMelding(melding);
        ac5.bepaaldeMelding(melding);



        AfspraakSituatie afspraakSituatie = new GeplandeAfspraak();
        afspraakSituatie.afspraak();
        System.out.println("De afspraak is succesvol afgerond!");






    }
}



module uz.bakhromjon.javafxtreeview {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens uz.bakhromjon.javafxtreeview to javafx.fxml;
    exports uz.bakhromjon.javafxtreeview;
}
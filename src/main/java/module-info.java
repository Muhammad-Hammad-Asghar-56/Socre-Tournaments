module com.example.fourfourtwopedia {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.fourfourtwopedia to javafx.fxml;
    opens com.example.fourfourtwopedia.DBHandler to javafx.fxml;
    opens com.example.fourfourtwopedia.Controllers to javafx.fxml;
    opens com.example.fourfourtwopedia.Model to javafx.graphics;
    exports com.example.fourfourtwopedia;
}
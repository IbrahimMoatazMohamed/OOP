module ba.edu.ibu.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.controlsfx.controls;
//    requires org.controlsfx.controls;

    opens ba.edu.ibu.javafx to javafx.fxml;
    exports ba.edu.ibu.javafx;
}
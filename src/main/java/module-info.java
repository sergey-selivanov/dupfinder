module hellofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    //opens org.openjfx to javafx.fxml;
    opens org.openjfx to javafx.fxml, javafx.graphics;

    opens org.svs.dupfinder to javafx.fxml, javafx.graphics;

    exports org.openjfx;
}

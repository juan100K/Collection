module uq.collection {
    requires javafx.controls;
    requires javafx.fxml;


    opens uq.collection to javafx.fxml;
    exports uq.collection;
}
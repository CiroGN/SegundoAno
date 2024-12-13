module ciro.nass.desktop {
    requires javafx.controls;
    requires javafx.fxml;


    opens ciro.nass.desktop to javafx.fxml;
    exports ciro.nass.desktop;
}
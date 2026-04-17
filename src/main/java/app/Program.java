package app;

import java.util.InvalidPropertiesFormatException;
import views.AltaVehiculoView;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        AltaVehiculoView v1 = new AltaVehiculoView();
        v1.setVisible(true);
    }
}

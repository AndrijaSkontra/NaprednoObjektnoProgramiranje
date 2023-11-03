package homework.vjezba1.zadatak1;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import homework.vjezba1.zadatak1.Utility.InterfaceImplementationFinder;
import homework.vjezba1.zadatak1.view.MainFrame;
import javax.swing.*;
import java.util.List;

public class TestApp {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
        });

    }
}

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import javax.swing.*;

public class Controller {
    public TextArea storyBox;
    public JFXButton ageUpButton;
    public TextField nameAgeField;
    public TextField healthField;
    public TextField happinessField;
    public TextField smartsField;
    public TextField looksField;

    public int age;
    public String name;
    public int health, happiness, smarts, looks;
    public Pane startingPane;
    public TextField nameInputField;
    public Rectangle lockScreen;
    public Text gameName;
    public Text notarutabaga;

    public void initializeGame(ActionEvent event) {
        name = nameInputField.getText();
        nameInputField.setVisible(false);
        lockScreen.setVisible(false);
        gameName.setVisible(false);
        notarutabaga.setVisible(false);

        age = 0;
        health = randPercent(); happiness = randPercent(); smarts = randPercent(); looks = randPercent();

        nameAgeField.setText(name + ", age " + age);

        healthField.setText("health: " + health + "%");
        happinessField.setText("happiness: " + happiness + "%");
        smartsField.setText("smarts: " + smarts + "%");
        looksField.setText("looks: " + looks + "%");

        storyBox.setText("AGE " + age + ":\n\tI am born.");
    }

    public int randPercent() {
        return (int)(Math.random() * 101);
    }

    public void ageUpClicked(ActionEvent actionEvent) {
        age++;
        nameAgeField.setText(name + ", age " + age);
        storyBox.appendText("\n\nAGE " + age + ":");
    }


    // hi
    //HIIIII -hammy


}

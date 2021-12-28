import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

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

    public void initialize() {
        age = 0;
        health = 80; happiness = 100; smarts = 40; looks = 64;

        healthField.setText("health: " + health + "%");
        happinessField.setText("happiness: " + happiness + "%");
        smartsField.setText("smarts: " + smarts + "%");
        looksField.setText("looks: " + looks + "%");

        storyBox.setText("AGE " + age + ":\n\tI am born.");
    }

    public void ageUpClicked(ActionEvent actionEvent) {
        age++;
        nameAgeField.setText(name + ", age " + age);
        storyBox.appendText("\n\nAGE " + age + ":");
    }

    public void getPlayerName(ActionEvent actionEvent) {
        name = nameInputField.getText();
        nameInputField.setVisible(false);
        startingPane.setVisible(false);
        nameAgeField.setText(name + ", age " + age);
    }

    // hi
    //HIIIII -hammy


}

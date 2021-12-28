import com.jfoenix.controls.JFXButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Controller {
    public TextArea storyBox;
    public JFXButton ageUpButton;
    public TextField nameAgeField;
    public TextField healthField;
    public TextField happinessField;
    public TextField smartsField;
    public TextField looksField;

    public Rectangle lockScreen;
    public Text gameName;
    public Text notarutabaga;
    public TextField lastNameInputField;
    public TextField firstNameInputField;
    public JFXButton startButton;

    public int age;
    public String firstName, lastName, fullName;
    public int health, happiness, smarts, looks;

    public void initializeGame() {
        if (validName()) {
            firstName = firstNameInputField.getText();
            lastName = lastNameInputField.getText();
            fullName = firstName.concat(" " + lastName);

            firstNameInputField.setVisible(false);
            lastNameInputField.setVisible(false);
            lockScreen.setVisible(false);
            gameName.setVisible(false);
            notarutabaga.setVisible(false);
            startButton.setVisible(false);

            age = 0;
            health = randPercent(); happiness = randPercent(); smarts = randPercent(); looks = randPercent();

            nameAgeField.setText(fullName + ", age " + age);

            healthField.setText("health: " + health + "%");
            happinessField.setText("happiness: " + happiness + "%");
            smartsField.setText("smarts: " + smarts + "%");
            looksField.setText("looks: " + looks + "%");

            storyBox.setText("AGE " + age + ":\n\tI am born.");
        }
    }

    public int randPercent() {
        return (int)(Math.random() * 101);
    }

    public boolean validName() {
        if (firstNameInputField.getText().isEmpty()) return false;
        if (lastNameInputField.getText().isEmpty()) return false;
        if (firstNameInputField.getText().startsWith(" ")) return false;
        if (lastNameInputField.getText().startsWith(" ")) return false;

        else return true;
    }

    public void ageUpClicked() {
        age++;
        nameAgeField.setText(fullName + ", age " + age);
        storyBox.appendText("\n\nAGE " + age + ":");
    }


    // hi
    //HIIIII -hammy


}

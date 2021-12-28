import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Controller {
    public TextArea storyBox;
    public JFXButton ageUpButton;
    public TextField nameAgeField;
    public Circle profile;
    public Text sexID;
    public TextField healthField;
    public TextField happinessField;
    public TextField smartsField;
    public TextField looksField;

    public Rectangle lockScreen;
    public Text gameName;
    public Text notarutabaga;
    public TextField lastNameInputField;
    public TextField firstNameInputField;
    public CheckBox mChoice;
    public CheckBox femChoice;
    public JFXButton randomButton;
    public JFXButton startButton;

    public int age;
    public String firstName, lastName, fullName;
    public int health, happiness, smarts, looks;
    char sex;

    public void initializeGame() {
        if (validName() && validSex()) {
            firstName = firstNameInputField.getText();
            lastName = lastNameInputField.getText();
            fullName = firstName.concat(" " + lastName);

            if (femChoice.isSelected()) sex = 'f';
            if (mChoice.isSelected()) sex = 'm';

            firstNameInputField.setVisible(false);
            lastNameInputField.setVisible(false);
            femChoice.setVisible(false);
            mChoice.setVisible(false);
            lockScreen.setVisible(false);
            gameName.setVisible(false);
            notarutabaga.setVisible(false);
            startButton.setVisible(false);
            randomButton.setVisible(false);

            age = 0;
            health = randPercent(); happiness = randPercent(); smarts = randPercent(); looks = randPercent();

            nameAgeField.setText(fullName + ", age " + age);
            if (sex == 'f') sexID.setText("\u2640");
            if (sex == 'm') sexID.setText("\u2642");

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

    public boolean validSex() {
        if (femChoice.isSelected() || mChoice.isSelected()) return true;
        else return false;
    }

    public void ageUpClicked() {
        age++;
        nameAgeField.setText(fullName + ", age " + age);
        storyBox.appendText("\n\nAGE " + age + ":");
    }

    public void randomInfo(ActionEvent actionEvent) {
        //randomize content
    }


    // hi
    //HIIIII -hammy


}

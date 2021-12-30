import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Controller {
    public TextArea storyBox;
    public JFXButton ageUpButton;
    public TextField nameAgeField;
    public TextField bankField;
    public Circle profile;
    public Text sexID;
    public TextField healthField;
    public TextField happinessField;
    public TextField smartsField;
    public TextField looksField;

    public Pane startPane;
    public Text gameName;
    public Text notarutabaga;
    public TextField lastNameInputField;
    public TextField firstNameInputField;
    public CheckBox mChoice;
    public CheckBox femChoice;
    public JFXButton randomButton;
    public JFXButton startButton;

    public int age, bank;
    public String firstName, lastName, fullName, nameAge;
    public int health, happiness, smarts, looks;
    char sex;

    private final double MAX_TEXT_WIDTH = 229;
    private final double defaultFontSize = 18;
    private final Font defaultFont = Font.font(defaultFontSize);

    public void initializeGame() {
        if (validName() && validSex()) {
            firstName = firstNameInputField.getText();
            lastName = lastNameInputField.getText();
            fullName = firstName.concat(" " + lastName);

            if (femChoice.isSelected()) sex = 'f';
            if (mChoice.isSelected()) sex = 'm';

            startPane.setVisible(false);

            age = 0;
            bank = 0;
            health = randPercent(); happiness = randPercent(); smarts = randPercent(); looks = randPercent();

            nameAge = fullName + ", age " + age;
            Text tmpText = new Text(nameAge);
            tmpText.setFont(defaultFont);
            double textWidth = tmpText.getLayoutBounds().getWidth();
            if (textWidth >= MAX_TEXT_WIDTH) {
                double newFontSize = defaultFontSize * MAX_TEXT_WIDTH / textWidth;
                nameAgeField.setFont(Font.font(defaultFont.getFamily(), newFontSize));
            }

            nameAgeField.setText(nameAge);
            if (sex == 'f') sexID.setText("\u2640");
            if (sex == 'm') sexID.setText("\u2642");
            bankField.setText("$" + bank);

            healthField.setText("health: " + health + "%");
            happinessField.setText("happiness: " + happiness + "%");
            smartsField.setText("smarts: " + smarts + "%");
            looksField.setText("looks: " + looks + "%");

            storyBox.setText("AGE " + age + ":\n\tI am born.");
        }
    }

    public void ageUpClicked() {
        age++;

        nameAge = fullName + ", age " + age;
        Text tmpText = new Text(nameAge);
        tmpText.setFont(defaultFont);
        double textWidth = tmpText.getLayoutBounds().getWidth();
        if (textWidth >= MAX_TEXT_WIDTH) {
            double newFontSize = defaultFontSize * MAX_TEXT_WIDTH / textWidth;
            nameAgeField.setFont(Font.font(defaultFont.getFamily(), newFontSize));
        }

        nameAgeField.setText(nameAge);

        storyBox.appendText("\n\nAGE " + age + ":");
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

    public int randPercent() {
        return (int)(Math.random() * 101);
    }

    public void randomInfo(ActionEvent actionEvent) {
        //randomize content
    }


    // hi
    //HIIIII -hammy


}

package com.example.android.quizaboutlemurs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    // email


    RadioButton radioButtonGambia;
    RadioButton radioButtonEurope;
    RadioButton radioButtonMadagascar;
    RadioButton radioButtonSriLanka;

    // Q2
    RadioButton radioButtonAncestorsYes;
    RadioButton radioButtonAncestorsNo;

    // Q3
    CheckBox checkbox30g;
    CheckBox checkbox9kg;
    CheckBox checkbox200kg;

    // Q4
    CheckBox checkboxInsects;
    CheckBox checkboxFruitAndVegetables;
    CheckBox checkboxPlants;
    CheckBox checkboxFish;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Q1
        radioButtonGambia = (RadioButton) findViewById(R.id.radio_gambia);
        radioButtonEurope = (RadioButton) findViewById(R.id.radio_europe);
        radioButtonMadagascar = (RadioButton) findViewById(R.id.radio_madagascar);
        radioButtonSriLanka = (RadioButton) findViewById(R.id.radio_sri_lanka);
        // Q2
        radioButtonAncestorsYes = (RadioButton) findViewById(R.id.radio_ancestors_yes);
        radioButtonAncestorsNo = (RadioButton) findViewById(R.id.radio_ancestors_no);
        // Q3
        checkbox30g = (CheckBox) findViewById(R.id.checkbox_30g);
        checkbox9kg = (CheckBox) findViewById(R.id.checkbox_9kg);
        checkbox200kg = (CheckBox) findViewById(R.id.checkbox_200kg);
        // Q4
        checkboxInsects = (CheckBox) findViewById(R.id.checkbox_insects);
        checkboxFruitAndVegetables = (CheckBox) findViewById(R.id.checkbox_fruit_vegetables);
        checkboxPlants = (CheckBox) findViewById(R.id.checkbox_plants);
        checkboxFish = (CheckBox) findViewById(R.id.checkbox_fish);


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("score", score);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        score = savedInstanceState.getInt("score");
    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.radio_madagascar:
                if (checked)
                    score++;
                    break;
            case R.id.radio_ancestors_no:
                if (checked)
                    score++;
                    break;
        }
    }

    public void countScore (View view){

        boolean hasCheckbox30g = checkbox30g.isChecked();
        boolean hasCheckbox9kg = checkbox9kg.isChecked();
        boolean hasCheckbox200kg = checkbox200kg.isChecked();
        boolean hasCheckboxInsects = checkboxInsects.isChecked();
        boolean hasCheckboxFruitAndVegetables = checkboxFruitAndVegetables.isChecked();
        boolean hasCheckboxPlants = checkboxPlants.isChecked();
        boolean hasCheckboxFish = checkboxFish.isChecked();

        if (hasCheckbox30g){
            score++;
        }
        if (hasCheckbox9kg){
            score++;
        }
        if (hasCheckbox200kg && (score > 0)){
            score--;
        }
        if (hasCheckboxInsects){
            score++;
        }
        if (hasCheckboxFruitAndVegetables){
            score++;
        }
        if (hasCheckboxPlants){
            score++;
        }
        if (hasCheckboxFish && (score > 0)){
            score--;
        }
        Toast.makeText(this, "Your score is: " + score + "/7", Toast.LENGTH_SHORT).show();
        displayMessage("Your score is: " + score + "/7");
        resetScore(view);
    }

    public void resetScore (View view){
        score = 0;

        // reset radio buttons
        if (radioButtonGambia.isChecked()){
            radioButtonGambia.setChecked(false);
        }
        if (radioButtonEurope.isChecked()){
            radioButtonEurope.setChecked(false);
        }
        if (radioButtonMadagascar.isChecked()){
            radioButtonMadagascar.setChecked(false);
        }
        if (radioButtonSriLanka.isChecked()){
            radioButtonSriLanka.setChecked(false);
        }
        if (radioButtonAncestorsYes.isChecked()){
            radioButtonAncestorsYes.setChecked(false);
        }
        if (radioButtonAncestorsNo.isChecked()){
            radioButtonAncestorsNo.setChecked(false);
        }

        //reset all checkboxes
        if (checkbox30g.isChecked()) {
            checkbox30g.setChecked(false);
        }
        if (checkbox9kg.isChecked()) {
            checkbox9kg.setChecked(false);
        }
        if (checkbox200kg.isChecked()) {
            checkbox200kg.setChecked(false);
        }
        if (checkboxInsects.isChecked()) {
            checkboxInsects.setChecked(false);
        }
        if (checkboxFruitAndVegetables.isChecked()) {
            checkboxFruitAndVegetables.setChecked(false);
        }
        if (checkboxPlants.isChecked()) {
            checkboxPlants.setChecked(false);
        }
        if (checkboxFish.isChecked()) {
            checkboxFish.setChecked(false);
        }

       // Toast.makeText(this, "Your score is: " + score + "/7", Toast.LENGTH_SHORT).show();
       // displayMessage("Your score is: " + score + "/7");
    }

    private void displayMessage(String message) {
        TextView scoreTextView = (TextView) findViewById(R.id.score_text_view);
        scoreTextView.setText(message);
    }

}

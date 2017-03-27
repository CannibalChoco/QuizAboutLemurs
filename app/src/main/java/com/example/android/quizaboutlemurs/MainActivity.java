package com.example.android.quizaboutlemurs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    String rightAnswer1 = "Animal";
    //Q1
    EditText answer1;
    //Q2
    RadioButton radioButtonVatican;
    RadioButton radioButtonEurope;
    RadioButton radioButtonMadagascar;
    RadioButton radioButtonSriLanka;

    // Q3
    RadioButton radioButtonAncestorsYes;
    RadioButton radioButtonAncestorsNo;

    // Q4
    CheckBox checkbox30g;
    CheckBox checkbox9kg;
    CheckBox checkbox50kg;
    CheckBox checkbox200kg;

    // Q5
    CheckBox checkboxInsects;
    CheckBox checkboxFruitAndVegetables;
    CheckBox checkboxPlants;
    CheckBox checkboxFish;

    // Q6
    RadioButton radioButtonVerySocial;
    RadioButton radioButtonNotVerySocial;
    RadioButton radioButtonNotSocial;

    // Q7
    RadioButton radioButton18;
    RadioButton radioButton16;
    RadioButton radioButton20;
    RadioButton radioButton22;

    // Q8
    RadioButton radioButtonLemurYes;
    RadioButton radioButtonLemurNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Q1
        answer1 = (EditText) findViewById(R.id.edit_text_answer1);
        // Q2
        radioButtonVatican = (RadioButton) findViewById(R.id.radio_gambia);
        radioButtonEurope = (RadioButton) findViewById(R.id.radio_europe);
        radioButtonMadagascar = (RadioButton) findViewById(R.id.radio_madagascar);
        radioButtonSriLanka = (RadioButton) findViewById(R.id.radio_sri_lanka);
        // Q3
        radioButtonAncestorsYes = (RadioButton) findViewById(R.id.radio_ancestors_yes);
        radioButtonAncestorsNo = (RadioButton) findViewById(R.id.radio_ancestors_no);
        // Q4
        checkbox30g = (CheckBox) findViewById(R.id.checkbox_30g);
        checkbox9kg = (CheckBox) findViewById(R.id.checkbox_9kg);
        checkbox50kg = (CheckBox) findViewById(R.id.checkbox_50kg);
        checkbox200kg = (CheckBox) findViewById(R.id.checkbox_200kg);
        // Q5
        checkboxInsects = (CheckBox) findViewById(R.id.checkbox_insects);
        checkboxFruitAndVegetables = (CheckBox) findViewById(R.id.checkbox_fruit_vegetables);
        checkboxPlants = (CheckBox) findViewById(R.id.checkbox_plants);
        checkboxFish = (CheckBox) findViewById(R.id.checkbox_fish);
        // Q6
        radioButtonVerySocial = (RadioButton) findViewById(R.id.radio_live_in_groups);
        radioButtonNotVerySocial = (RadioButton) findViewById(R.id.radio_live_in_pairs);
        radioButtonNotSocial = (RadioButton) findViewById(R.id.radio_live_alone);
        // Q7
        radioButton18 = (RadioButton) findViewById(R.id.radio_18_fingers);
        radioButton16 = (RadioButton) findViewById(R.id.radio_16_fingers);
        radioButton20 = (RadioButton) findViewById(R.id.radio_20_fingers);
        radioButton22 = (RadioButton) findViewById(R.id.radio_22_fingers);
        // Q8
        radioButtonLemurYes = (RadioButton) findViewById(R.id.radio_is_lemur);
        radioButtonLemurNo = (RadioButton) findViewById(R.id.radio_not_lemur);
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

    public void submitAnswers (View view){

        boolean hasRadioButtonMadagascar = radioButtonMadagascar.isChecked();
        boolean hasRadioButtonAncestorsNo = radioButtonAncestorsNo.isChecked();
        boolean hasCheckbox30g = checkbox30g.isChecked();
        boolean hasCheckbox9kg = checkbox9kg.isChecked();
        boolean hasCheckbox50kg = checkbox50kg.isChecked();
        boolean hasCheckbox200kg = checkbox200kg.isChecked();
        boolean hasCheckboxInsects = checkboxInsects.isChecked();
        boolean hasCheckboxFruitAndVegetables = checkboxFruitAndVegetables.isChecked();
        boolean hasCheckboxPlants = checkboxPlants.isChecked();
        boolean hasCheckboxFish = checkboxFish.isChecked();
        boolean hasRadioButtonVerySocial = radioButtonVerySocial.isChecked();
        boolean hasRadioButton20 = radioButton20.isChecked();
        boolean hasRadioButtonLemurYes = radioButtonLemurYes.isChecked();

        if (answer1.getText().toString().equals(rightAnswer1)){
            score++;
        }
        if (hasRadioButtonMadagascar){
            score++;
        }
        if (hasRadioButtonAncestorsNo){
            score++;
        }
        if (hasCheckbox30g){
            score++;
        }
        if (hasCheckbox9kg){
            score++;
        }
        if (hasCheckbox50kg && (score > 0)){
            score--;
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
        if (hasRadioButtonVerySocial){
            score++;
        }
        if (hasRadioButton20){
            score++;
        }
        if (hasRadioButtonLemurYes){
            score++;
        }

        Toast.makeText(this, "Your score is: " + score + "/11", Toast.LENGTH_SHORT).show();
        //displayMessage("Your score is: " + score + "/10");
        //resetScore(view);
    }

    public void resetScore (View view){
        score = 0;

        // reset radio buttons
        if (radioButtonVatican.isChecked()){
            radioButtonVatican.setChecked(false);
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
        if (radioButtonVerySocial.isChecked()){
            radioButtonVerySocial.setChecked(false);
        }
        if (radioButtonNotVerySocial.isChecked()){
            radioButtonNotVerySocial.setChecked(false);
        }
        if (radioButtonNotSocial.isChecked()){
            radioButtonNotSocial.setChecked(false);
        }
        if (radioButton18.isChecked()){
            radioButton18.setChecked(false);
        }
        if (radioButton16.isChecked()){
            radioButton16.setChecked(false);
        }
        if (radioButton20.isChecked()){
            radioButton20.setChecked(false);
        }
        if (radioButton22.isChecked()) {
            radioButton22.setChecked(false);
        }
        if (radioButtonLemurYes.isChecked()){
            radioButtonLemurYes.setChecked(false);
        }
        if (radioButtonLemurNo.isChecked()) {
            radioButtonLemurNo.setChecked(false);
        }

        //reset all checkboxes
        if (checkbox30g.isChecked()) {
            checkbox30g.setChecked(false);
        }
        if (checkbox9kg.isChecked()) {
            checkbox9kg.setChecked(false);
        }
        if (checkbox50kg.isChecked()) {
            checkbox50kg.setChecked(false);
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
        answer1.setText("");

        Toast.makeText(this, "Answers are reset", Toast.LENGTH_SHORT).show();
       //displayMessage("Answers are reset");
    }


/*
    private void displayMessage(String message) {
        TextView scoreTextView = (TextView) findViewById(R.id.score_text_view);
        scoreTextView.setText(message);
    }
*/
}

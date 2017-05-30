package com.example.android.quizaboutlemurs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int score = 0;
    String rightAnswer;

    //Q1
    EditText answer1;
    //Q2
    RadioButton radioButtonVatican;
    RadioButton radioButtonEurope;
    RadioButton radioButtonMadagascar;
    RadioButton radioButtonSriLanka;
    // Q3
    RadioButton radioButtonMonkeysYes;
    RadioButton radioButtonMonkeysNo;
    // Q4
    CheckBox checkbox30g;
    CheckBox checkbox9kg;
    CheckBox checkbox50kg;
    CheckBox checkbox200kg;
    // Q5
    CheckBox checkboxInsects;
    CheckBox checkboxFruit;
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
    //Q1
    ImageView question1;
    //Q2
    ImageView question2Answer1;
    ImageView question2Answer2;
    ImageView question2Answer3;
    ImageView question2Answer4;
    //Q3
    ImageView question3Answer1;
    ImageView question3Answer2;
    //Q4
    ImageView question4Answer1;
    ImageView question4Answer2;
    ImageView question4Answer3;
    ImageView question4Answer4;
    //Q5
    ImageView question5Answer1;
    ImageView question5Answer2;
    ImageView question5Answer3;
    ImageView question5Answer4;
    //Q6
    ImageView question6Answer1;
    ImageView question6Answer2;
    ImageView question6Answer3;
    //Q7
    ImageView question7Answer1;
    ImageView question7Answer2;
    ImageView question7Answer3;
    ImageView question7Answer4;
    //Q8
    ImageView question8Answer1;
    ImageView question8Answer2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Q1
        answer1 = (EditText) findViewById(R.id.edit_text_answer1);
        rightAnswer = getString(R.string.q1_a);

        // Q2
        radioButtonVatican = (RadioButton) findViewById(R.id.radio_vatican);
        radioButtonEurope = (RadioButton) findViewById(R.id.radio_europe);
        radioButtonMadagascar = (RadioButton) findViewById(R.id.radio_madagascar);
        radioButtonSriLanka = (RadioButton) findViewById(R.id.radio_sri_lanka);
        // Q3
        radioButtonMonkeysYes = (RadioButton) findViewById(R.id.radio_monkeys_yes);
        radioButtonMonkeysNo = (RadioButton) findViewById(R.id.radio_monkeys_no);
        // Q4
        checkbox30g = (CheckBox) findViewById(R.id.checkbox_30g);
        checkbox9kg = (CheckBox) findViewById(R.id.checkbox_9kg);
        checkbox50kg = (CheckBox) findViewById(R.id.checkbox_50kg);
        checkbox200kg = (CheckBox) findViewById(R.id.checkbox_200kg);
        // Q5
        checkboxInsects = (CheckBox) findViewById(R.id.checkbox_insects);
        checkboxFruit = (CheckBox) findViewById(R.id.checkbox_fruit);
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

        //Q1
        question1 = (ImageView) findViewById(R.id.image_view_q1);
        //Q2
        question2Answer1 = (ImageView) findViewById(R.id.image_view_q2_a1);
        question2Answer2 = (ImageView) findViewById(R.id.image_view_q2_a2);
        question2Answer3 = (ImageView) findViewById(R.id.image_view_q2_a3);
        question2Answer4 = (ImageView) findViewById(R.id.image_view_q2_a4);
        //Q3
        question3Answer1 = (ImageView) findViewById(R.id.image_view_q3_a1);
        question3Answer2 = (ImageView) findViewById(R.id.image_view_q3_a2);
        //Q4
        question4Answer1 = (ImageView) findViewById(R.id.image_view_q4_a1);
        question4Answer2 = (ImageView) findViewById(R.id.image_view_q4_a2);
        question4Answer3 = (ImageView) findViewById(R.id.image_view_q4_a3);
        question4Answer4 = (ImageView) findViewById(R.id.image_view_q4_a4);
        //Q5
        question5Answer1 = (ImageView) findViewById(R.id.image_view_q5_a1);
        question5Answer2 = (ImageView) findViewById(R.id.image_view_q5_a2);
        question5Answer3 = (ImageView) findViewById(R.id.image_view_q5_a3);
        question5Answer4 = (ImageView) findViewById(R.id.image_view_q5_a4);
        //Q6
        question6Answer1 = (ImageView) findViewById(R.id.image_view_q6_a1);
        question6Answer2 = (ImageView) findViewById(R.id.image_view_q6_a2);
        question6Answer3 = (ImageView) findViewById(R.id.image_view_q6_a3);
        //Q7
        question7Answer1 = (ImageView) findViewById(R.id.image_view_q7_a1);
        question7Answer2 = (ImageView) findViewById(R.id.image_view_q7_a2);
        question7Answer3 = (ImageView) findViewById(R.id.image_view_q7_a3);
        question7Answer4 = (ImageView) findViewById(R.id.image_view_q7_a4);
        //Q8
        question8Answer1 = (ImageView) findViewById(R.id.image_view_q8_a1);
        question8Answer2 = (ImageView) findViewById(R.id.image_view_q8_a2);
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

    /**
     * This method checks the selected answers and sets visibility to corresponding
     * correct/incorrect image
     */
    public void submitAnswers(View view) {
        score = 0;

        //Q1
        if (answer1.getText().toString().equals(rightAnswer)) {
            score++;
            question1.setImageResource(R.drawable.correct);
            question1.setVisibility(View.VISIBLE);
        } else {
            question1.setImageResource(R.drawable.incorrect);
            question1.setVisibility(View.VISIBLE);
        }

        //Q2
        if (radioButtonVatican.isChecked()) {
            question2Answer1.setVisibility(View.VISIBLE);
        }
        if (radioButtonEurope.isChecked()) {
            question2Answer2.setVisibility(View.VISIBLE);
        }
        if (radioButtonMadagascar.isChecked()) {
            score++;
            question2Answer3.setVisibility(View.VISIBLE);
        }
        if (radioButtonSriLanka.isChecked()) {
            question2Answer4.setVisibility(View.VISIBLE);
        }

        //Q3
        if (radioButtonMonkeysYes.isChecked()) {
            question3Answer1.setVisibility(View.VISIBLE);
        }
        if (radioButtonMonkeysNo.isChecked()) {
            score++;
            question3Answer2.setVisibility(View.VISIBLE);
        }

        //Q4
        if (checkbox30g.isChecked()) {
            score++;
            question4Answer1.setVisibility(View.VISIBLE);
        }
        if (checkbox9kg.isChecked()) {
            score++;
            question4Answer2.setVisibility(View.VISIBLE);
        }
        if (checkbox50kg.isChecked()) {
            // user doesn't get maximum points by checking all the checkboxes
            if (score > 0) {
                score--;
            }
            question4Answer3.setVisibility(View.VISIBLE);
        }
        if (checkbox200kg.isChecked()) {
            // user doesn't get maximum points by checking all the checkboxes
            if (score > 0) {
                score--;
            }
            question4Answer4.setVisibility(View.VISIBLE);
        }

        //Q5
        if (checkboxInsects.isChecked()) {
            score++;
            question5Answer1.setVisibility(View.VISIBLE);
        }
        if (checkboxFruit.isChecked()) {
            score++;
            question5Answer2.setVisibility(View.VISIBLE);
        }
        if (checkboxPlants.isChecked()) {
            score++;
            question5Answer3.setVisibility(View.VISIBLE);
        }
        if (checkboxFish.isChecked()) {
            if (score > 0) {
                // user doesn't get maximum points by checking all the checkboxes
                score--;
            }
            question5Answer4.setVisibility(View.VISIBLE);
        }

        //Q6
        if (radioButtonVerySocial.isChecked()) {
            score++;
            question6Answer1.setVisibility(View.VISIBLE);
        }
        if (radioButtonNotVerySocial.isChecked()) {
            question6Answer2.setVisibility(View.VISIBLE);
        }
        if (radioButtonNotSocial.isChecked()) {
            question6Answer3.setVisibility(View.VISIBLE);
        }

        //Q7
        if (radioButton18.isChecked()) {
            question7Answer1.setVisibility(View.VISIBLE);
        }
        if (radioButton16.isChecked()) {
            question7Answer2.setVisibility(View.VISIBLE);
        }
        if (radioButton20.isChecked()) {
            score++;
            question7Answer3.setVisibility(View.VISIBLE);
        }
        if (radioButton22.isChecked()) {
            question7Answer4.setVisibility(View.VISIBLE);
        }

        //Q8
        if (radioButtonLemurYes.isChecked()) {
            score++;
            question8Answer1.setVisibility(View.VISIBLE);
        }
        if (radioButtonLemurNo.isChecked()) {
            question8Answer2.setVisibility(View.VISIBLE);
        }

        String message1 = getString(R.string.toast_submit1);
        String message2 = getString(R.string.toast_submit2);
        Toast.makeText(this, message1 + " " + score + message2, Toast.LENGTH_SHORT).show();
    }

    /**
     * Method to clear answers. It also sets the correct/incorrect images
     * to invisible
     */
    public void resetAll(View view) {
        score = 0;

        //Q1
        answer1.setText("");
        question1.setVisibility(View.INVISIBLE);

        //Q2
        if (radioButtonVatican.isChecked()) {
            radioButtonVatican.setChecked(false);
            question2Answer1.setVisibility(View.INVISIBLE);
        }
        if (radioButtonEurope.isChecked()) {
            radioButtonEurope.setChecked(false);
            question2Answer2.setVisibility(View.INVISIBLE);
        }
        if (radioButtonMadagascar.isChecked()) {
            radioButtonMadagascar.setChecked(false);
            question2Answer3.setVisibility(View.INVISIBLE);
        }
        if (radioButtonSriLanka.isChecked()) {
            radioButtonSriLanka.setChecked(false);
            question2Answer4.setVisibility(View.INVISIBLE);
        }

        //Q3
        if (radioButtonMonkeysYes.isChecked()) {
            radioButtonMonkeysYes.setChecked(false);
            question3Answer1.setVisibility(View.INVISIBLE);
        }
        if (radioButtonMonkeysNo.isChecked()) {
            radioButtonMonkeysNo.setChecked(false);
            question3Answer2.setVisibility(View.INVISIBLE);
        }

        //Q4
        if (checkbox30g.isChecked()) {
            checkbox30g.setChecked(false);
            question4Answer1.setVisibility(View.INVISIBLE);
        }
        if (checkbox9kg.isChecked()) {
            checkbox9kg.setChecked(false);
            question4Answer2.setVisibility(View.INVISIBLE);
        }
        if (checkbox50kg.isChecked()) {
            checkbox50kg.setChecked(false);
            question4Answer3.setVisibility(View.INVISIBLE);
        }
        if (checkbox200kg.isChecked()) {
            checkbox200kg.setChecked(false);
            question4Answer4.setVisibility(View.INVISIBLE);
        }

        //Q5
        if (checkboxInsects.isChecked()) {
            checkboxInsects.setChecked(false);
            question5Answer1.setVisibility(View.INVISIBLE);
        }
        if (checkboxFruit.isChecked()) {
            checkboxFruit.setChecked(false);
            question5Answer2.setVisibility(View.INVISIBLE);
        }
        if (checkboxPlants.isChecked()) {
            checkboxPlants.setChecked(false);
            question5Answer3.setVisibility(View.INVISIBLE);
        }
        if (checkboxFish.isChecked()) {
            checkboxFish.setChecked(false);
            question5Answer4.setVisibility(View.INVISIBLE);
        }

        //Q6
        if (radioButtonVerySocial.isChecked()) {
            radioButtonVerySocial.setChecked(false);
            question6Answer1.setVisibility(View.INVISIBLE);
        }
        if (radioButtonNotVerySocial.isChecked()) {
            radioButtonNotVerySocial.setChecked(false);
            question6Answer2.setVisibility(View.INVISIBLE);
        }
        if (radioButtonNotSocial.isChecked()) {
            radioButtonNotSocial.setChecked(false);
            question6Answer3.setVisibility(View.INVISIBLE);
        }

        //Q7
        if (radioButton18.isChecked()) {
            radioButton18.setChecked(false);
            question7Answer1.setVisibility(View.INVISIBLE);
        }
        if (radioButton16.isChecked()) {
            radioButton16.setChecked(false);
            question7Answer2.setVisibility(View.INVISIBLE);
        }
        if (radioButton20.isChecked()) {
            radioButton20.setChecked(false);
            question7Answer3.setVisibility(View.INVISIBLE);
        }
        if (radioButton22.isChecked()) {
            radioButton22.setChecked(false);
            question7Answer4.setVisibility(View.INVISIBLE);
        }

        //Q8
        if (radioButtonLemurYes.isChecked()) {
            radioButtonLemurYes.setChecked(false);
            question8Answer1.setVisibility(View.INVISIBLE);
        }
        if (radioButtonLemurNo.isChecked()) {
            radioButtonLemurNo.setChecked(false);
            question8Answer2.setVisibility(View.INVISIBLE);
        }

        String message = getString(R.string.toast_reset);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}
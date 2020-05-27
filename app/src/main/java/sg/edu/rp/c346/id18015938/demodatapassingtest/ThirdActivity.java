package sg.edu.rp.c346.id18015938.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    //Step 1
    TextView tvAnswer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //Step 2
        tvAnswer2 = findViewById(R.id.textView2);
        Intent intentReceived = getIntent();
        char character = intentReceived.getCharExtra("character",'a');
        tvAnswer2.setText("Character value received is: "+character);
    }
}

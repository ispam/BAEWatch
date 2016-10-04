package tech.destinum.baewatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class GenderSelection extends AppCompatActivity {

    private ImageButton womanImgBtn;
    private ImageButton manImgBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender_selection);

        womanImgBtn = (ImageButton) findViewById(R.id.imageButtonWoman);
        manImgBtn = (ImageButton) findViewById(R.id.imageButtonMan);

        womanImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntentWoman = new Intent(GenderSelection.this, WomanActivities.class);
                startActivity(mIntentWoman);
            }
        });

        manImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntentMan = new Intent(GenderSelection.this, ManActivities.class);
                startActivity(mIntentMan);
            }
        });
    }
}

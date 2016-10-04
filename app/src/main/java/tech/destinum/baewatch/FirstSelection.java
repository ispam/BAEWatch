package tech.destinum.baewatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FirstSelection extends AppCompatActivity {

    private ImageButton partnerImgBtn;
    private ImageButton familyImgBtn;
    private ImageButton friendsImgBtn;
    private ImageButton petsImgBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_selection);

        partnerImgBtn = (ImageButton) findViewById(R.id.imageButtonPartner);
        familyImgBtn = (ImageButton) findViewById(R.id.imageButtonFamily);
        friendsImgBtn = (ImageButton) findViewById(R.id.imageButtonFriends);
        petsImgBtn = (ImageButton) findViewById(R.id.imageButtonPets);

        partnerImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntentPartner = new Intent(FirstSelection.this, GenderSelection.class);
                startActivity(mIntentPartner);
            }
        });

        familyImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mFamilyIntent = new Intent(FirstSelection.this, GenderSelection.class);
                startActivity(mFamilyIntent);
            }
        });

        friendsImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mFriendsIntent = new Intent(FirstSelection.this, GenderSelection.class);
                startActivity(mFriendsIntent);
            }
        });

        petsImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mPetsIntent = new Intent(FirstSelection.this, GenderSelection.class);
                startActivity(mPetsIntent);
            }
        });

    }
}

package lk.dinuka.doggomatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class IdentifyDogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identify_dog);

        try
        {
            this.getSupportActionBar().hide();              // remove title bar of app
        }
        catch (NullPointerException e){}

        setContentView(R.layout.activity_identify_dog);
    }
}

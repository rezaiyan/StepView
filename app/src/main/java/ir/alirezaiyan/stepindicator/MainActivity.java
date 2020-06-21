package ir.alirezaiyan.stepindicator;

import androidx.appcompat.app.AppCompatActivity;
import ir.alirezaiyan.stepview.StepIndicator;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    int step = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StepIndicator stepIndicator = findViewById(R.id.stepIndicator);
        String[] icons = {getResources().getString(R.string.step1),
                getResources().getString(R.string.step2),
                getResources().getString(R.string.step3),
                getResources().getString(R.string.step4), ""};
        stepIndicator.setIcons(icons);
        stepIndicator.setCurrentStepPosition(0);

        findViewById(R.id.button).setOnClickListener(v -> {
            step++;
            if (step > 4)
                step = 0;
            stepIndicator.setCurrentStepPosition(step);
        });

    }
}
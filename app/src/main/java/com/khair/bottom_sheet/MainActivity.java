package com.khair.bottom_sheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button showBottomSheetButton = findViewById(R.id.show_bottom_sheet_button);
        showBottomSheetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomSheetDialog();
            }
        });

    }

    private void showBottomSheetDialog() {
        // Inflate the layout for the Bottom Sheet
        View bottomSheetView = LayoutInflater.from(this).inflate(R.layout.bottom_sheet_layout, null);

        // Create the Bottom Sheet Dialog
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(bottomSheetView);

        // Set up views in the Bottom Sheet
        TextView textView = bottomSheetView.findViewById(R.id.textView);
        Button button = bottomSheetView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Button Clicked!");
            }
        });

        // Show the Bottom Sheet Dialog
        bottomSheetDialog.show();
    }


}
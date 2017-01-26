package edu.dtcc.cis282student.assignment01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickConfirm(View view) {
        EditText etName = (EditText) findViewById(R.id.etName);
        String name = etName.getText().toString();
        Toast.makeText(this, name, Toast.LENGTH_LONG).show();
        TextView tvGreeting = (TextView) findViewById(R.id.tvGreeting);
        tvGreeting.setText().toString();
    }
}
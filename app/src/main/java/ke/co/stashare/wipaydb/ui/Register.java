package ke.co.stashare.wipaydb.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import ke.co.stashare.wipaydb.R;

/**
 * Created by Ken Wainaina on 05/04/2017.
 */

public class Register extends AppCompatActivity {

    List<String> countries;
    Spinner spinner;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_page);

        spinner=(Spinner)findViewById(R.id.spinnerLazz);

        countries= new ArrayList<>();

        countries.add("+254");
        countries.add("+255");
        countries.add("+1");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                Register.this,
                android.R.layout.simple_spinner_dropdown_item,
                countries);

        spinner.setAdapter(arrayAdapter);
    }
}

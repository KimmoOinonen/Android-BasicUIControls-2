package fi.jamk.basicuicontrols_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // AutoCompleteTextView
        AutoCompleteTextView actv = (AutoCompleteTextView)
                findViewById(R.id.login); // add stings to control
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,
                new String[]
                        {"Pasi","Juha","Kari","Jouni","Esa","Hannu"});
        actv.setAdapter(aa);
    }

    public void loginButtonClicked(View view) {
// find autocomplete
        AutoCompleteTextView logintext = (AutoCompleteTextView) findViewById(R.id.login);
// get autocomplete text
        String text = logintext.getText().toString();
// find password
        EditText passtext = (EditText) findViewById(R.id.passEditText);
// get password text
        String txt = passtext.getText().toString();
// toast message to screen
        Toast.makeText(getApplicationContext(), text + " " + txt,
                Toast.LENGTH_SHORT).show();
    }
}

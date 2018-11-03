package vegas.com.alejandro.panaderia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnOne, btnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = (Button)findViewById(R.id.btnOne);
        btnTwo = (Button)findViewById(R.id.btnTwo);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NavigationActivity.class);
                startActivity(intent);
                finish();

            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this,RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

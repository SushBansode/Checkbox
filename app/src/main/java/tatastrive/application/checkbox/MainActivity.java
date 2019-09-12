package tatastrive.application.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public abstract class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        checkBox = findViewById( R.id.checkBox );

       checkBox.setOnCheckedChangeListener( new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onClick();

            }
        } );
    }
    public  void onClick()
    {
        if(checkBox.isChecked())
        {
            Toast.makeText( this, "Clicked", Toast.LENGTH_SHORT ).show();
        }else
        {
            Toast.makeText( this, "Unclicked", Toast.LENGTH_SHORT ).show();
        }
    }
}

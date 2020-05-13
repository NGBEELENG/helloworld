package tw.edu.pu.o1073010.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txv = (TextView) findViewById(R.id.txv);
        txv.setText("Hello tcyang");
        TestDev();
        TestMaster();
    }

    public void TestMaster(){
        TextView txv = (TextView) findViewById(R.id.txv);
        txv.setText("Master分支");
    }
    public void TestDev(){
        TextView txv = (TextView) findViewById(R.id.txv);
        txv.setText("Dev分支");
    }

}

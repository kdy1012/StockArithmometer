package kr.co.tjeit.stockarithmometer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    private android.widget.EditText startNumEdt;
    private android.widget.EditText endNumEdt;
    private android.widget.TextView onelineTxt;
    private android.widget.TextView secondlineTxt;
    private android.widget.TextView thirdlineTxt;
    private android.widget.TextView fourthlineTxt;
    private android.widget.TextView fifthlineTxt;
    private android.widget.Button startBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setValuse();
        setupEvents();


    }

    public void setupEvents() {
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int oneNum = Integer.parseInt(startNumEdt.getText().toString());
                int twoNum = Integer.parseInt(endNumEdt.getText().toString());

                int x = twoNum - oneNum;
                int centerLine = (oneNum + twoNum) / 2;
                int aveNum = (oneNum - centerLine) / 2;

                onelineTxt.setText(Integer.toString(oneNum));

                int line2 = oneNum - aveNum;
                secondlineTxt.setText(Integer.toString(line2));

                thirdlineTxt.setText(Integer.toString(centerLine));

                int line4 = centerLine - aveNum;
                fourthlineTxt.setText(Integer.toString(line4));

                int line5 = line4 - aveNum;
                fifthlineTxt.setText(Integer.toString(twoNum));

            }
        });

    }

    public void setValuse() {

    }

    public void bindViews() {
        this.fifthlineTxt = (TextView) findViewById(R.id.fifthlineTxt);
        this.fourthlineTxt = (TextView) findViewById(R.id.fourthlineTxt);
        this.thirdlineTxt = (TextView) findViewById(R.id.thirdlineTxt);
        this.secondlineTxt = (TextView) findViewById(R.id.secondlineTxt);
        this.onelineTxt = (TextView) findViewById(R.id.onelineTxt);
        this.startBtn = (Button) findViewById(R.id.startBtn);
        this.endNumEdt = (EditText) findViewById(R.id.endNumEdt);
        this.startNumEdt = (EditText) findViewById(R.id.startNumEdt);
    }
}

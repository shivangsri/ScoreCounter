package android.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0;
    int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void incrementThree(View view){
        scoreA+=3;
        displayA(scoreA);
    }
    public void incrementTwo(View view){
        scoreA+=2;
        displayA(scoreA);
    }
    public void Free(View view){
        scoreA+=0;
        displayA(scoreA);
    }
    public void incrementThreeB(View view){
        scoreB+=3;
        displayB(scoreB);
    }
    public void incrementTwoB(View view){
        scoreB+=2;
        displayB(scoreB);
    }
    public void FreeB(View view){
        scoreB+=0;
        displayB(scoreB);
    }
    public void Reset(View v){
        scoreA=0;
        scoreB=0;
        displayA(scoreA);
        displayB(scoreB);
    }



    private void displayA(int number)
    {
        TextView score=(TextView)findViewById(R.id.score);
        score.setText(" "+number);
    }
    private void displayB(int number){
        TextView score=(TextView)findViewById(R.id.scoreB);
        score.setText(" "+number);
    }
}

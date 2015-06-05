package ryanduvall.multi_threadassignment;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class MainActivity extends ActionBarActivity {

    public void onCreateClick(View view) {
        Context myContext;
        String filename = "numbers.txt";
        File file = new File(myContext.getFilesDir(), filename);
        FileOutputStream outputStream;

        BufferedWriter output;
        try {
            output = new BufferedWriter(new FileWriter(filename, true));

            for(int i = 1; i <= 10; i++) {
                String temp;
                getString(temp).valueOf(i);
                output.append(temp);
                output.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void onLoadClick(View view) {
        ;
    }

    public void onClearClick(View view) {
        ;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

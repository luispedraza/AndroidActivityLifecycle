package es.luispedraza.androidactivitylifecycle;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    static private final String LOG_TAG = MainActivity.class.getSimpleName();

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

    // Lifecycle methods:

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(LOG_TAG, "Executing onCreate");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Log.v(LOG_TAG, "Executing onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.v(LOG_TAG, "Executing onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.v(LOG_TAG, "Executing onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.v(LOG_TAG, "Executing onStop");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.v(LOG_TAG, "Executing onRestart");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.v(LOG_TAG, "Executing onDestroy");
        super.onDestroy();
    }
}

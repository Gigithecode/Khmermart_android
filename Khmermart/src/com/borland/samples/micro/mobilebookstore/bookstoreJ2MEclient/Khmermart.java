package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient.MainMenu;
import java.io.IOException;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;


public class Khmermart extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khmermart);
        
        static khmermart instance;
        private static Display display;
        private MainMenu mainMenu = new MainMenu();


        public khmermart() {
           instance = this;
           display = Display.getDisplay(this);
        }

        public void startApp() {
           display.setCurrent(this.mainMenu);
        }

        public void pauseApp() {}

        public void destroyApp(boolean unconditional) {}

        public static void quitApp() {
           instance.destroyApp(true);
           instance.notifyDestroyed();
           instance = null;
        }

        public static void showAlert(Exception e) {
           showAlert(e.getMessage());
        }

        public static void showAlert(String message) {
           Image image = null;

           try {
              image = Image.createImage("/ErrorClaim.png");
           } catch (IOException var3) {
              ;
           }

           Alert alert = new Alert("Error", "", image, AlertType.ERROR);
           alert.setTimeout(-2);
           alert.setString(message);
           display.setCurrent(alert);
        }
     }

     
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.khmermart, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
       
}

package co.mz.importproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.dhis2.android.rtsm.ui.home.HomeActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}
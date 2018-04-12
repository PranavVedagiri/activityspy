package activityspy.pranavv.washington.edu.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    companion object {
        private val mainTag = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(mainTag, "onCreate fired")
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.i(mainTag, "onStart fired")
    }

    override fun onResume() {
        super.onResume()

        Log.i(mainTag, "onResume fired")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(mainTag, "onRestart fired")
    }

    override fun onPause() {
        super.onPause()

        Log.i(mainTag, "onPause fired")

    }

    override fun onStop() {
        super.onStop()

        Log.i(mainTag, "onStop fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(mainTag, "We're going down, captain!")
    }
}

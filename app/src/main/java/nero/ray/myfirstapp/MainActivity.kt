package nero.ray.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG="MainActivity"
fun formatString(s:String, len:Int): String {
    var i=0
    var sn:String=s
    while (sn.length<len){
        i++
        if (i%2==1) {
            sn = " $sn"
        }
        else {
            sn= "$sn "
        }
    }
    return sn
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, formatString("8 марта",30))
        Log.d(TAG, formatString("****",30))
        Log.d(TAG, formatString("Дорогие женщины!",30))
        Log.d(TAG, formatString("Разрешите вас поздравить",30))
        Log.d(TAG, formatString("С главным праздником весны",30))
    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG, formatString("В этом мире, всем известно,",30))
        Log.d(TAG, formatString("Вы - вершина красоты!",30))
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, formatString("Все природные пейзажи,",30))
        Log.d(TAG, formatString("Живопись и города",30))
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG, formatString("Не разрушат моё мнение,",30))
        Log.d(TAG, formatString("Скажу прямо, никогда!",30))
    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG, formatString("Восхищению не предела!",30))
        Log.d(TAG, formatString("Словно ангел во плоти!",30))
    }

    override fun onRestart() {
        super.onRestart()

        Log.d(TAG, formatString("****",30))
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, formatString("Каждая и все вы в целом",30))
        Log.d(TAG, formatString("Совершенны и чисты!",30))
        Log.d(TAG, formatString("****",30))
        Log.d(TAG, formatString("Башкатов Р.Ю.",30))
    }
    
}
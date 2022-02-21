package statandroid.ru.lessonsqlitekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import statandroid.ru.lessonsqlitekotlin.db.MyDbManager

class MainActivity : AppCompatActivity() {
    val myDbManager = MyDbManager(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickSave(view: View) {
        myDbManager.openDb()
        myDbManager.insertToDb(edTitle.text)

    }
}
package jp.techacademy.kuroda.tatsuaki.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log   // ここを追加
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     //   Log.d("kotlintest", "ログへの出力テスト")
        var human = Human("tatsu", 68)
        human.say()
    }
}

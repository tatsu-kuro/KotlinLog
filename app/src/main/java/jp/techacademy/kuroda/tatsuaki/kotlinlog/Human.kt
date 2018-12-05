package jp.techacademy.kuroda.tatsuaki.kotlinlog
import android.util.Log
class Human: Animal{
    constructor(name: String,age: Int):super(name,age){

    }
    override fun say(){
        Log.d("kotlinHuman","私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }
}
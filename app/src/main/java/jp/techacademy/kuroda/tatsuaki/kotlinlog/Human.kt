package jp.techacademy.kuroda.tatsuaki.kotlinlog
import android.util.Log
class Human: Animal,Thinkable{
    var hobby:String = ""

    constructor(name: String,age: Int):super(name,age){
    }
    override fun think(){
        Log.d("kotlinHuman","私は" + this.hobby + "について考える")
    }
    override fun say(){
        Log.d("kotlinHuman","私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }
}
package jp.techacademy.kuroda.tatsuaki.kotlinlog
import android.util.Log
/*
//Thinkableインターフェースの無いバージョン
class Human: Animal{
    var hobby:String = ""

    constructor(name: String,age: Int,hobby:String):super(name,age){
        this.hobby = hobby
    }
    fun think(){
        Log.d("kotlinHuman","私は" + this.hobby + "について考える")
    }
    override fun say(){
        Log.d("kotlinHuman","私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }
}
*/
//Thinkableインターフェース使用バージョン・Thinkableを使用する利点はなんだろう
class Human: Animal,Thinkable{
    var hobby:String

    constructor(name: String,age: Int,hobby:String):super(name,age){
        this.hobby = hobby
    }

    override fun think(){
        Log.d("kotlinHumanThinkable","私は" + this.hobby + "について考える")
    }
    override fun say(){
        Log.d("kotlinHumanThinkable","私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }
}

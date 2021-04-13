package jp.techacademy.yui.kuwahara.kotlinlog
import android.util.Log

open class Human: Animal ,Thinkable{
    // 引数付きコンストラクタ
    constructor(name: String, age: Int): super(name, age) {
    }

    var hobby :String = ""

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "私の名前は"+ this.name + "です。年は" + this.age + "歳です。")
    }

    // Movableインターフェイスのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest","私は" + hobby + "について考える")
    }
}
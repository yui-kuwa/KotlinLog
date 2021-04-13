package jp.techacademy.yui.kuwahara.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1
        /*
        Log.d("kotlintest", "ログへの出力テスト")

        //整数型の変数をnumをいう名前で作成して、10を代入する
        var num = 10
        Log.d("kotlintest", Integer.toString(num))

        //numに50を代入する
        //変数や定数に　.toString()を記述する方法もある
        num = 50
        Log.d("kotlintest", num.toString())

        //2
        val num1 = 10 + 5 - 2 * 4 / 2
        Log.d("kotlintest", "10 + 5 - 2 * 4 / 2 = " + num1)

        val flag1 = true
        val flag2 = false
        Log.d("kotlintest", "flag1 && flag2 = " + (flag1 && flag2))
        Log.d("kotlintest", "flag1 || flag2 = " + (flag1 || flag2))

        val num2 = 10
        val num3 = 20
        Log.d("kotlintest", "num2 < num3 = " + (num2 < num3))

        //3
        num = 60

        if(num >= 90){
            Log.d("kotlintest", "優")
        } else if (num >= 75) {
            Log.d("kotlintest", "良")
        } else if (num >= 60) {
            Log.d("kotlintest", "可")
        } else {
            Log.d("kotlintest", "不可")
        }

        //4
        val drink = 1

        when(drink){
            0 -> {
                Log.d("kotlintest", "コーヒーを注文しました")
            }
            1 -> Log.d("kotlintest", "紅茶を注文しました")
            2 -> Log.d("kotlintest", "ミルクを注文しました")
            else -> Log.d("kotlintest", "オーダーミスです")
        }
        //別の書き方
        val message = when (drink) {
            0 -> "コーヒーを注文しました"
            1 -> "紅茶を注文しました"
            2 -> "ミルクを注文しました"
            else -> "オーダーミスです"
        }
        Log.d("kotlintest", message)

        //5
        for (i in 1 until 6) {
            Log.d("kotlintest", "for文の " + i + "回目")
        }

        var num = 1 //事前にvar num の定義が残っている場合は、エラーがでるので、var を削除しましょう。

        while (num < 6) {
            Log.d("kotlintest", "while文の " + num + "回目")
            num++
        }

        //6
        // Array<Int>型の配列が作成される
        val points = arrayOf(10, 6, 15, 23, 17)

        for (i in points) {
            Log.d("kotlintest", i.toString())
        }

        //7
        val numA = 100
        val numB = 0
        var ans = 0

        try{
            ans = numA / numB
        } catch (e : Exception) {
            Log.d("kotlintest", "0で割ろうとしました")
            // 例外情報から、メッセージを表示
            Log.d("kotlintest", e.message.toString())
        } finally {
            Log.d("kotlintest", "ans = " + ans.toString())
        }

        //8
        // 引数に50と1000を指定してtotal関数を呼び出す
        //total(50, 1000)

        // 引数の値を変えることで処理内容を簡単に変更できる
        //total(1, 1111)

        val t = total(50, 1000)   // ここでtotalからsumを返してもらう
        Log.d("kotlintest", t.toString())*/
        //}

        //8
        // firstとlast、2つの引数を指定する
        /*private fun total(first: Int, last: Int):Int {
        var sum = 0
        for (i in first..last) {
            sum += i
        }

        return sum
    }*/

        /*val dog = Dog("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        dog.say()
        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")

        val bigdog = BigDog("ヨーゼフ", 15)     // 名前をヨーゼフ、年齢15歳で、BigDogのインスタンスを作る

        bigdog.say()
        Log.d("kotlintest", "犬の名前は" + bigdog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + bigdog.age + "歳です。")*/

        //val dog = Dog("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        val human1 = Human("由衣",22)
        val human2 = Human("桑原",22)
        human1.hobby = "ダンス"
        human2.hobby = "ウクレレ"

        human1.say()
        human2.say()

        human1.think()
        human2.think()

        //dog.move()
    }
}

package dev.chirii.twitterrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.chirii.twitterrecycler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweeter()
    }

    fun displayTweeter() {
        var person1 = Twetter(
            "Mercy Kemboi",
            "Programming is fun",
            "",
            "",
            "@mercy_kemboi",
            "",
            "",
            "",
            123,
            1000,
            785
        )
        var person2 = Twetter(
            "Benson Ajuma",
            "Enjoy your life,",
            "",
            "",
            "@ben_kem",
            "",
            "",
            "",
            1230,
            100,
            75
        )
        var person3 = Twetter(
            "Lucy Karimi",
            "God lift those who humble themselves",
            "",
            "",
            "@chirii",
            "",
            "",
            "",
            1203,
            10,
            78
        )
        var person4 = Twetter(
            "John Owuor",
            "Kotlin Language is easy , make peace with the past",
            "",
            "",
            "@John_Owuor",
            "",
            "",
            "",
            1203,
            1000,
            799
        )
        var TweeterList=
            listOf(person1,person2,person3,person4)
        var TweetAdapter = TweeterAdapter(TweeterList)
        binding.rvTweets.layoutManager = LinearLayoutManager(this)
        binding.rvTweets.adapter = TweetAdapter

    }
}
package com.example.testovoe24

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.Gravity
import android.view.KeyEvent
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.bumptech.glide.Glide

class PlayActivity : AppCompatActivity() {

    private lateinit var imageViewFon3: ImageView
    private lateinit var imageHome: ImageView
    private lateinit var imageCardBack: ImageView
    private lateinit var imageCardFront: ImageView
    private lateinit var imageBankir: ImageView
    private lateinit var imageBankir2: ImageView
    private lateinit var imageBankir3: ImageView
    private lateinit var imageBankir4: ImageView
    private lateinit var imageBankir5: ImageView
    private lateinit var imageBankir6: ImageView
    private lateinit var imageBankir7: ImageView
    private lateinit var imageBankir8: ImageView
    private lateinit var imageBankir9: ImageView
    private lateinit var imageUser: ImageView
    private lateinit var imageUser2: ImageView
    private lateinit var imageUser3: ImageView
    private lateinit var imageUser4: ImageView
    private lateinit var imageUser5: ImageView
    private lateinit var imageUser6: ImageView
    private lateinit var imageUser7: ImageView
    private lateinit var imageUser8: ImageView
    private lateinit var imageUser9: ImageView
    private lateinit var buttonMore: AppCompatButton
    private lateinit var buttonPass: AppCompatButton
    private lateinit var textViewUser: TextView
    private lateinit var textViewBankir: TextView
    private lateinit var textViewScore: TextView
    private lateinit var textViewStavka: TextView
    private lateinit var sharedPreferences: SharedPreferences

    var score = 0
    var stavka = 0
    var kolvoMore = 0
    var scoreUser = 0
    var scoreUserCard = 0
    var scoreBankir = 0
    var scoreBankirCard = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        imageViewFon3 = findViewById(R.id.imageViewFon3)
        imageHome = findViewById(R.id.imageHome)
        imageCardBack = findViewById(R.id.imageCardBack)
        imageCardFront = findViewById(R.id.imageCardFront)
        imageBankir = findViewById(R.id.imageBankir)
        imageBankir2 = findViewById(R.id.imageBankir2)
        imageBankir3 = findViewById(R.id.imageBankir3)
        imageBankir4 = findViewById(R.id.imageBankir4)
        imageBankir5 = findViewById(R.id.imageBankir5)
        imageBankir6 = findViewById(R.id.imageBankir6)
        imageBankir7 = findViewById(R.id.imageBankir7)
        imageBankir8 = findViewById(R.id.imageBankir8)
        imageBankir9 = findViewById(R.id.imageBankir9)
        imageUser = findViewById(R.id.imageUser)
        imageUser2 = findViewById(R.id.imageUser2)
        imageUser3 = findViewById(R.id.imageUser3)
        imageUser4 = findViewById(R.id.imageUser4)
        imageUser5 = findViewById(R.id.imageUser5)
        imageUser6 = findViewById(R.id.imageUser6)
        imageUser7 = findViewById(R.id.imageUser7)
        imageUser8 = findViewById(R.id.imageUser8)
        imageUser9 = findViewById(R.id.imageUser9)
        buttonMore = findViewById(R.id.buttonMore)
        buttonPass = findViewById(R.id.buttonPass)
        textViewUser = findViewById(R.id.textViewUser)
        textViewBankir = findViewById(R.id.textViewBankir)
        textViewScore = findViewById(R.id.textViewScore)
        textViewStavka = findViewById(R.id.textViewStavka)

        sharedPreferences = getSharedPreferences("my_preferences", Context.MODE_PRIVATE)
        score = sharedPreferences.getInt("score", 5)
        textViewScore.text = "Score: " + score.toString()

        Glide.with(this)
            .load("http://135.181.248.237/24/fon3.png")
            .into(imageViewFon3)

        Glide.with(this)
            .load("http://135.181.248.237/24/rubashka.png")
            .into(imageCardBack)

        Glide.with(this)
            .load("http://135.181.248.237/24/rubashka.png")
            .into(imageCardFront)

        imageHome.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }

        showDialog()

        buttonPass.setOnClickListener {
            buttonPass.isClickable = false
            buttonMore.isClickable = false
            performCardAnimation(imageCardBack, getRandomCardImageUrl(), imageBankir, kolvoMore)
            scoreBankir += scoreBankirCard
            textViewBankir.text = scoreBankir.toString()
            if (scoreBankir < scoreUser) {
                performCardAnimation(
                    imageCardBack,
                    getRandomCardImageUrl(),
                    imageBankir2,
                    kolvoMore
                )
                scoreBankir += scoreBankirCard
                textViewBankir.text = scoreBankir.toString()
            }
            if (scoreBankir < scoreUser) {
                performCardAnimation(
                    imageCardBack,
                    getRandomCardImageUrl(),
                    imageBankir3,
                    kolvoMore
                )
                scoreBankir += scoreBankirCard
                textViewBankir.text = scoreBankir.toString()
            }
            if (scoreBankir < scoreUser) {
                performCardAnimation(
                    imageCardBack,
                    getRandomCardImageUrl(),
                    imageBankir4,
                    kolvoMore
                )
                scoreBankir += scoreBankirCard
                textViewBankir.text = scoreBankir.toString()
            }
            if (scoreBankir < scoreUser) {
                performCardAnimation(
                    imageCardBack,
                    getRandomCardImageUrl(),
                    imageBankir5,
                    kolvoMore
                )
                scoreBankir += scoreBankirCard
                textViewBankir.text = scoreBankir.toString()
            }
            if (scoreBankir < scoreUser) {
                performCardAnimation(
                    imageCardBack,
                    getRandomCardImageUrl(),
                    imageBankir6,
                    kolvoMore
                )
                scoreBankir += scoreBankirCard
                textViewBankir.text = scoreBankir.toString()
            }
            if (scoreBankir < scoreUser) {
                performCardAnimation(
                    imageCardBack,
                    getRandomCardImageUrl(),
                    imageBankir7,
                    kolvoMore
                )
                scoreBankir += scoreBankirCard
                textViewBankir.text = scoreBankir.toString()
            }
            if (scoreBankir < scoreUser) {
                performCardAnimation(
                    imageCardBack,
                    getRandomCardImageUrl(),
                    imageBankir8,
                    kolvoMore
                )
                scoreBankir += scoreBankirCard
                textViewBankir.text = scoreBankir.toString()
            }
            if (scoreBankir < scoreUser) {
                performCardAnimation(
                    imageCardBack,
                    getRandomCardImageUrl(),
                    imageBankir9,
                    kolvoMore
                )
                scoreBankir += scoreBankirCard
                textViewBankir.text = scoreBankir.toString()
            }
            if (scoreBankir > 21) {
                score += stavka * 2
                sharedPreferences.edit().putInt("score", score).apply()
                showDialogResult()
            }
            if (scoreBankir >= scoreUser && scoreBankir < 22) {
                sharedPreferences.edit().putInt("score", score).apply()
                showDialogResult()
            }
        }

        buttonMore.setOnClickListener {
            if (kolvoMore == 0) {
                performCardAnimation(imageCardBack, getRandomCardImageUrl(), imageUser, kolvoMore)
                scoreUser += scoreUserCard
                textViewUser.text = scoreUser.toString()
                kolvoMore++
            } else if (kolvoMore == 1) {
                performCardAnimation(imageCardBack, getRandomCardImageUrl(), imageUser2, kolvoMore)
                scoreUser += scoreUserCard
                textViewUser.text = scoreUser.toString()
                kolvoMore++
                if (scoreUser>21){
                    sharedPreferences.edit().putInt("score", score).apply()
                    showDialogResult()
                }
            } else if (kolvoMore == 2 && scoreUser <= 21) {
                performCardAnimation(imageCardBack, getRandomCardImageUrl(), imageUser3, kolvoMore)
                scoreUser += scoreUserCard
                textViewUser.text = scoreUser.toString()
                kolvoMore++
                if (scoreUser>21){
                    sharedPreferences.edit().putInt("score", score).apply()
                    showDialogResult()
                }
            } else if (kolvoMore == 3 && scoreUser <= 21) {
                performCardAnimation(imageCardBack, getRandomCardImageUrl(), imageUser4, kolvoMore)
                scoreUser += scoreUserCard
                textViewUser.text = scoreUser.toString()
                kolvoMore++
                if (scoreUser>21){
                    sharedPreferences.edit().putInt("score", score).apply()
                    showDialogResult()
                }
            } else if (kolvoMore == 4 && scoreUser <= 21) {
                performCardAnimation(imageCardBack, getRandomCardImageUrl(), imageUser5, kolvoMore)
                scoreUser += scoreUserCard
                textViewUser.text = scoreUser.toString()
                kolvoMore++
                if (scoreUser>21){
                    sharedPreferences.edit().putInt("score", score).apply()
                    showDialogResult()
                }
            } else if (kolvoMore == 5 && scoreUser <= 21) {
                performCardAnimation(imageCardBack, getRandomCardImageUrl(), imageUser6, kolvoMore)
                scoreUser += scoreUserCard
                textViewUser.text = scoreUser.toString()
                kolvoMore++
                if (scoreUser>21){
                    sharedPreferences.edit().putInt("score", score).apply()
                    showDialogResult()
                }
            } else if (kolvoMore == 6 && scoreUser <= 21) {
                performCardAnimation(imageCardBack, getRandomCardImageUrl(), imageUser7, kolvoMore)
                scoreUser += scoreUserCard
                textViewUser.text = scoreUser.toString()
                kolvoMore++
                if (scoreUser>21){
                    sharedPreferences.edit().putInt("score", score).apply()
                    showDialogResult()
                }
            } else if (kolvoMore == 7 && scoreUser <= 21) {
                performCardAnimation(imageCardBack, getRandomCardImageUrl(), imageUser8, kolvoMore)
                scoreUser += scoreUserCard
                textViewUser.text = scoreUser.toString()
                kolvoMore++
                if (scoreUser>21){
                    sharedPreferences.edit().putInt("score", score).apply()
                    showDialogResult()
                }
            } else if (kolvoMore == 8 && scoreUser <= 21) {
                performCardAnimation(imageCardBack, getRandomCardImageUrl(), imageUser9, kolvoMore)
                scoreUser += scoreUserCard
                textViewUser.text = scoreUser.toString()
                kolvoMore++
                if (scoreUser>21){
                    sharedPreferences.edit().putInt("score", score).apply()
                    showDialogResult()
                }
            }
        }
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        startActivity(Intent(this, MenuActivity::class.java))
        finish()
        return super.onKeyDown(keyCode, event)
    }

    private fun showDialog() {
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.stavka_layout)

        val editTextValue = dialog.findViewById<TextView>(R.id.editTextValue)
        val buttonOk = dialog.findViewById<TextView>(R.id.buttonOk)

        buttonOk.setOnClickListener {
            if (TextUtils.isEmpty(editTextValue.text)) {
                stavka = 0
            } else {
                stavka = editTextValue.text.toString().toInt()
            }
            if (stavka == 0) {

            } else if (stavka <= 50 && stavka > score) {
                stavka = score
                dialog.dismiss()
            } else if (stavka > 50 && stavka <= score) {
                stavka = 50
                dialog.dismiss()
            } else if (stavka > 50 && stavka > score) {
                if (score > 50) {
                    stavka = 50
                    dialog.dismiss()
                } else {
                    stavka = score
                    dialog.dismiss()
                }
            } else {
                dialog.dismiss()
            }
            textViewStavka.text = (stavka * 2).toString()
            score -= stavka
            textViewScore.text = "Score: " + score.toString()
        }

        val window = dialog.window
        val layoutParams = WindowManager.LayoutParams()

        layoutParams.gravity = Gravity.CENTER
        layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT
        layoutParams.height = (resources.displayMetrics.heightPixels * 0.4).toInt()
        window?.attributes = layoutParams

        dialog.setCanceledOnTouchOutside(false)
        dialog.show()
    }

    fun performCardAnimation(
        imageView: ImageView,
        targetImageUri: String,
        userImage: ImageView,
        kolvoMore: Int
    ) {
        val imageCardLocation = IntArray(2)
        val imageUserLocation = IntArray(2)

        imageView.getLocationOnScreen(imageCardLocation)
        userImage.getLocationOnScreen(imageUserLocation)

        val deltaX = imageUserLocation[0] - imageCardLocation[0]
        val deltaY = imageUserLocation[1] - imageCardLocation[1]

        val translationX = ObjectAnimator.ofFloat(imageView, "translationX", deltaX.toFloat())
        val translationY = ObjectAnimator.ofFloat(imageView, "translationY", deltaY.toFloat())
        val moveCard = AnimatorSet()
        moveCard.playTogether(translationX, translationY)
        moveCard.duration = 1000

        val rotateCard = ObjectAnimator.ofFloat(imageView, "rotationY", 0f, 180f)
        rotateCard.duration = 500
        rotateCard.startDelay = 1000

        val animators = AnimatorSet()
        animators.playSequentially(moveCard, rotateCard)

        animators.addListener(object : Animator.AnimatorListener {

            override fun onAnimationStart(p0: Animator) {
                buttonMore.isClickable = false
                buttonPass.isClickable = false
            }

            override fun onAnimationEnd(p0: Animator) {
                imageView.visibility = View.GONE

                Glide.with(imageView.context)
                    .load(targetImageUri)
                    .into(userImage)

                imageView.translationX = 0f
                imageView.translationY = 0f
                imageView.rotationY = 0f
                imageView.visibility = View.VISIBLE
                buttonMore.isClickable = true
                buttonPass.isClickable = true
            }

            override fun onAnimationCancel(p0: Animator) {
            }

            override fun onAnimationRepeat(p0: Animator) {
            }
        })

        animators.start()
    }

    fun getRandomCardImageUrl(): String {
        val imageUrls = arrayOf(
            "http://135.181.248.237/24/_6_of_clubs.png",
            "http://135.181.248.237/24/_6_of_diamonds.png",
            "http://135.181.248.237/24/_6_of_hearts.png",
            "http://135.181.248.237/24/_6_of_spades.png",
            "http://135.181.248.237/24/_7_of_clubs.png",
            "http://135.181.248.237/24/_7_of_diamonds.png",
            "http://135.181.248.237/24/_7_of_hearts.png",
            "http://135.181.248.237/24/_7_of_spades.png",
            "http://135.181.248.237/24/_8_of_clubs.png",
            "http://135.181.248.237/24/_8_of_diamonds.png",
            "http://135.181.248.237/24/_8_of_hearts.png",
            "http://135.181.248.237/24/_8_of_spades.png",
            "http://135.181.248.237/24/_9_of_clubs.png",
            "http://135.181.248.237/24/_9_of_diamonds.png",
            "http://135.181.248.237/24/_9_of_hearts.png",
            "http://135.181.248.237/24/_9_of_spades.png",
            "http://135.181.248.237/24/_10_of_clubs.png",
            "http://135.181.248.237/24/_10_of_diamonds.png",
            "http://135.181.248.237/24/_10_of_hearts.png",
            "http://135.181.248.237/24/_10_of_spades.png",
            "http://135.181.248.237/24/jack_of_clubs2.png",
            "http://135.181.248.237/24/jack_of_diamonds2.png",
            "http://135.181.248.237/24/jack_of_hearts2.png",
            "http://135.181.248.237/24/jack_of_spades2.png",
            "http://135.181.248.237/24/queen_of_clubs2.png",
            "http://135.181.248.237/24/queen_of_diamonds2.png",
            "http://135.181.248.237/24/queen_of_hearts2.png",
            "http://135.181.248.237/24/queen_of_spades2.png",
            "http://135.181.248.237/24/king_of_clubs2.png",
            "http://135.181.248.237/24/king_of_diamonds2.png",
            "http://135.181.248.237/24/king_of_hearts2.png",
            "http://135.181.248.237/24/king_of_spades2.png",
            "http://135.181.248.237/24/ace_of_clubs.png",
            "http://135.181.248.237/24/ace_of_diamonds.png",
            "http://135.181.248.237/24/ace_of_hearts.png",
            "http://135.181.248.237/24/ace_of_spades2.png"
        )

        val randomIndex = (0 until imageUrls.size).random()
        scoreUserCard = when {
            imageUrls[randomIndex].contains("jack", ignoreCase = true) -> 2
            imageUrls[randomIndex].contains("queen", ignoreCase = true) -> 3
            imageUrls[randomIndex].contains("king", ignoreCase = true) -> 4
            imageUrls[randomIndex].contains("ace", ignoreCase = true) -> 11
            imageUrls[randomIndex].contains("_6_", ignoreCase = true) -> 6
            imageUrls[randomIndex].contains("_7_", ignoreCase = true) -> 7
            imageUrls[randomIndex].contains("_8_", ignoreCase = true) -> 8
            imageUrls[randomIndex].contains("_9_", ignoreCase = true) -> 9
            imageUrls[randomIndex].contains("_10_", ignoreCase = true) -> 10
            else -> 0
        }
        scoreBankirCard = scoreUserCard
        return imageUrls[randomIndex]
    }

    private fun showDialogResult() {
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.result_layout)

        val textViewResult = dialog.findViewById<TextView>(R.id.textViewResult)
        val buttonRetry = dialog.findViewById<AppCompatButton>(R.id.buttonRetry)

        if (scoreBankir>21) {
            textViewResult.text = "YOU WON!"
        } else {
            textViewResult.text = "YOU'VE LOST!"
        }

        buttonRetry.setOnClickListener {
            recreate()
        }

        val window = dialog.window
        val layoutParams = WindowManager.LayoutParams()

        layoutParams.gravity = Gravity.CENTER
        layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT
        layoutParams.height = (resources.displayMetrics.heightPixels * 0.4).toInt()
        window?.attributes = layoutParams

        dialog.setCanceledOnTouchOutside(false)
        dialog.show()
    }
}
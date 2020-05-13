package com.proyek.akhir.timefighter

import android.os.CountDownTimer
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel() {
    private var isGameStarted = false

    private val _score = MutableLiveData(0)
    private val _time= MutableLiveData(0)

    private val countDownTimer = object : CountDownTimer(60000, 1000) {
        override fun onTick(millisUntilFinished: Long) {
            val timeLeft = millisUntilFinished / 1000
            _time.value = timeLeft.toInt()

        }

        override fun onFinish() {
            _score.value = 0
            _time.value = 0
            isGameStarted = false
        }
    }

    val score: LiveData<Int> = _score
    val time: LiveData<Int> = _time

    fun onTap() {
        if (!isGameStarted) {
            isGameStarted = true
            countDownTimer.start()
        }
        _score.value = (_score.value ?: 0) + 1

    }

}
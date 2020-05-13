package com.proyek.akhir.timefighter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel() {
    private val _score = MutableLiveData(0)

    val score: LiveData<Int> = _score

    fun onTap() {
        _score.value = (_score.value ?: 0) + 1
    }

}
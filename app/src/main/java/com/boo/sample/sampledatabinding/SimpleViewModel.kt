package com.boo.sample.sampledatabinding

import androidx.lifecycle.ViewModel

class SimpleViewModel: ViewModel() {
    val name = "Grace"
    val lastName = "Hopper"
    var likes = 0
        private set

    fun onLike(){
        likes++
    }

    val popularity: Popularity
        get(){
            return when {
                likes > 9 -> Popularity.STAR
                likes > 4 -> Popularity.POPULAR
                else -> Popularity.NORMAL
            }
        }
}

enum class Popularity {
    NORMAL,
    POPULAR,
    STAR
}

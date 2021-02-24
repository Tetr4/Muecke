package com.example.androiddevchallenge.data

import androidx.annotation.DrawableRes

data class Puppy(
    val name: String,
    @get:DrawableRes val image: Int,
    val caption: String? = null,
)
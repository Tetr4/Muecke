package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R

val PUPPIES = (1..30).map {
    Puppy("Mücke $it", R.drawable.muecke)
}
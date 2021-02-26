/*
 * Copyright 2021 The Android Open Source Project
 * Copyright 2021 Mike Klimek
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R

private var id = 0

private val prototype = Puppy(
    id = id++,
    name = "Mücke",
    description = "Just look at those ears! Also not up for adoption anymore.",
    image = R.drawable.muecke_portrait,
)

val PUPPIES = listOf(
    prototype.copy(
        id = id++,
        caption = "On a pillow",
        image = R.drawable.muecke_pillow
    ),
    prototype.copy(
        id = id++,
        caption = "In a basket",
        image = R.drawable.muecke_basket
    ),
    prototype.copy(
        id = id++,
        caption = "In a box",
        image = R.drawable.muecke_box
    ),
    prototype.copy(
        id = id++,
        caption = "In the grass",
        image = R.drawable.muecke_field
    ),
    prototype.copy(
        id = id++,
        caption = "Just happy",
        image = R.drawable.muecke_happy
    ),
    prototype.copy(
        id = id++,
        caption = "On a llama",
        image = R.drawable.muecke_llama
    ),
    prototype.copy(
        id = id++,
        name = "Mücke and Schnitzel",
        image = R.drawable.muecke_schnitzel
    ),
    prototype.copy(
        id = id++,
        caption = "Sleeping",
        image = R.drawable.muecke_sleepy
    ),
)

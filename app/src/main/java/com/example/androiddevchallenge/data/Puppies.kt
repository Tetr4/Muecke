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

val PUPPIES = listOf(
    Puppy(
        id = id++,
        name = "Mücke",
        caption = "on a pillow",
        description = "Look at those ears!",
        image = R.drawable.muecke_pillow
    ),
    Puppy(
        id = id++,
        name = "Mücke",
        caption = "in a basket",
        description = "Perfect fit!",
        image = R.drawable.muecke_basket
    ),
    Puppy(
        id = id++,
        name = "Mücke",
        caption = "in a box",
        description = "Hello there.",
        image = R.drawable.muecke_box
    ),
    Puppy(
        id = id++,
        name = "Mücke",
        caption = "in the grass",
        description = "Just chilling.",
        image = R.drawable.muecke_field
    ),
    Puppy(
        id = id++,
        name = "Mücke",
        caption = "just happy",
        image = R.drawable.muecke_happy
    ),
    Puppy(
        id = id++,
        name = "Mücke",
        caption = "on a llama",
        image = R.drawable.muecke_llama
    ),
    Puppy(
        id = id++,
        name = "Mücke and Schnitzel",
        description = "On a walk with a friend.",
        image = R.drawable.muecke_schnitzel
    ),
    Puppy(
        id = id++,
        name = "Mücke",
        caption = "sleeping",
        description = "zzzZZZzzz…",
        image = R.drawable.muecke_sleepy
    ),
)

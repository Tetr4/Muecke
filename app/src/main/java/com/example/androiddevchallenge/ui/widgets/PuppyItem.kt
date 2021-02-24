/*
 * Copyright 2021-2021 The Android Open Source Project
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
package com.example.androiddevchallenge.ui.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ListItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.PUPPIES
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.ui.theme.MyTheme

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun PuppyItem(puppy: Puppy) {
    Card(
        modifier = Modifier.padding(8.dp),
        elevation = 8.dp,
    ) {
        Column(Modifier.clickable { openDetailView(puppy) }) {
            ListItem(
                text = { Text(puppy.name) },
                secondaryText = puppy.caption?.let {
                    { Text(puppy.caption) }
                },
            )
            Image(
                painter = painterResource(puppy.image),
                contentDescription = puppy.name,
            )
        }
    }
}

fun openDetailView(puppy: Puppy) {
    // TODO
}

@Preview("Light Theme")
@Composable
fun LightPreview() {
    MyTheme {
        PuppyItem(PUPPIES.first())
    }
}

@Preview("Dark Theme")
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        PuppyItem(PUPPIES.first())
    }
}

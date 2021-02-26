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

import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ListItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.PUPPIES
import com.example.androiddevchallenge.data.Puppy
import com.google.android.material.composethemeadapter.MdcTheme
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun PuppyItem(puppy: Puppy, onClick: () -> Unit) {
    Card(
        modifier = Modifier.padding(8.dp),
        elevation = 8.dp,
    ) {
        Column(Modifier.clickable(onClick = onClick)) {
            Header(puppy)
            Thumbnail(puppy)
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun Header(puppy: Puppy) {
    ListItem(
        text = { Text(puppy.name) },
        secondaryText = puppy.caption?.let {
            { Text(puppy.caption) }
        },
    )
}

@Composable
private fun Thumbnail(puppy: Puppy) {
    // async loading image for better scroll performance
    CoilImage(
        data = puppy.image,
        contentDescription = puppy.name,
        loading = { LoadingIndicator() }
    )
}

@Composable
private fun LoadingIndicator() {
    Box(
        modifier = Modifier
            .height(80.dp)
            .fillMaxWidth(),
        contentAlignment = Alignment.Center,
    ) {
        CircularProgressIndicator()
    }
}

@Preview("Light Theme", uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun LightPreview() {
    MdcTheme {
        PuppyItem(PUPPIES.first(), onClick = {})
    }
}

@Preview("Dark Theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun DarkPreview() {
    MdcTheme {
        PuppyItem(PUPPIES.first(), onClick = {})
    }
}

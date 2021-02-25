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
package com.example.androiddevchallenge.ui.screens

import android.content.res.Configuration
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.PUPPIES
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.ui.widgets.PuppyItem
import com.google.android.material.composethemeadapter.MdcTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PuppyList(puppies: List<Puppy>, showPuppyDetails: (Puppy) -> Unit = {}) {
    LazyVerticalGrid(
        contentPadding = PaddingValues(8.dp),
        cells = GridCells.Fixed(2),
    ) {
        items(puppies) { puppy ->
            PuppyItem(
                puppy,
                onClick = { showPuppyDetails(puppy) },
            )
        }
    }
}

@Preview("Light Theme", uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun LightPreview() {
    MdcTheme {
        PuppyList(PUPPIES, showPuppyDetails = {})
    }
}

@Preview("Dark Theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun DarkPreview() {
    MdcTheme {
        PuppyList(PUPPIES, showPuppyDetails = {})
    }
}

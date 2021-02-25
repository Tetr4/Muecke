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
package com.example.androiddevchallenge

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.PUPPIES
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.ui.widgets.PuppyItem
import com.google.android.material.composethemeadapter.MdcTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MdcTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    Scaffold(
        topBar = { AppBar() },
        content = { PuppyList(PUPPIES) },
    )
}

@Composable
fun AppBar() {
    val onlyBottomCornerShape = MaterialTheme.shapes.medium.copy(
        topStart = CornerSize(0),
        topEnd = CornerSize(0),
    )
    TopAppBar(
        modifier = Modifier.clip(onlyBottomCornerShape),
        title = { Text(stringResource(R.string.app_name)) },
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PuppyList(puppies: List<Puppy>) {
    LazyVerticalGrid(
        contentPadding = PaddingValues(8.dp),
        cells = GridCells.Fixed(2),
    ) {
        items(puppies) { PuppyItem(it) }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun LightPreview() {
    MdcTheme {
        MyApp()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun DarkPreview() {
    MdcTheme {
        MyApp()
    }
}

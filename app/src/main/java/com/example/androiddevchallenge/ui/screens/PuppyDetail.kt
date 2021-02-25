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
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.data.PUPPIES
import com.example.androiddevchallenge.data.Puppy
import com.google.android.material.composethemeadapter.MdcTheme

@Composable
fun PuppyDetail(puppy: Puppy) {
    Column {
        Image(painterResource(puppy.image), contentDescription = puppy.name)
        Text(puppy.description, style = MaterialTheme.typography.body2)
    }
}

@Preview("Light Theme", uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun LightPreview() {
    MdcTheme {
        PuppyDetail(PUPPIES.first())
    }
}

@Preview("Dark Theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun DarkPreview() {
    MdcTheme {
        PuppyDetail(PUPPIES.first())
    }
}

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
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.data.PUPPIES
import com.example.androiddevchallenge.data.findPuppyById
import com.example.androiddevchallenge.ui.screens.PuppyDetail
import com.example.androiddevchallenge.ui.screens.PuppyList
import com.example.androiddevchallenge.ui.widgets.AppBar
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
    val navController = rememberNavController()
    Scaffold(
        topBar = { AppBar(stringResource(R.string.app_name)) },
        content = { NavGraph(navController) }
    )
}

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController, startDestination = "PuppyList") {
        composable("PuppyList") {
            PuppyList(
                PUPPIES,
                showPuppyDetails = { puppy -> navController.navigate("PuppyDetail/${puppy.id}") },
            )
        }
        composable(
            "PuppyDetail/{id}",
            arguments = listOf(navArgument("id") { type = NavType.IntType })
        ) {
            val id = it.arguments?.getInt("id") ?: 1
            PuppyDetail(findPuppyById(id))
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640, uiMode = UI_MODE_NIGHT_NO)
@Composable
private fun LightPreview() {
    MdcTheme {
        NavGraph(rememberNavController())
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun DarkPreview() {
    MdcTheme {
        MyApp()
    }
}

# Mücke

![Workflow result](https://github.com/Tetr4/Muecke/workflows/Check/badge.svg)


## :scroll: Description
Entry for the [Jetpack Compose Dev Challenge](https://developer.android.com/dev-challenge).  

Originally supposed to be an app about puppy adoptions, I kind of went off track and now it's an app
about Mücke, who is not a puppy anymore and actually not up for adoption :sweat_smile:
No regrets though :triumph:

## :bulb: Motivation and Context
I wanted to try Jetpack Compose, since I like how reactive development works in [React](https://reactjs.org/) and [Flutter](https://flutter.dev/). 
Declarative programming is clearly the paradigm of the future for UI development. 
Also I got a ton of cute dog pictures.

Some minor challenges I encountered:
- Scrolling becomes very laggy when using lots of `Image`s with drawables. I solved this by loading images asynchronously with Chris Banes' [accompanist-coil](https://github.com/chrisbanes/accompanist/tree/main/coil).
- `NavHost` uses viewmodels, which breaks the `@Preview` composables.
- Implementing the navbar (up navigation, dynamic titles) was kinda tricky. Maybe there is a more idiomatic way.

## :camera_flash: Screenshots
<img src="/results/screenshot_1.png" width="260" alt="list of puppies">&emsp;<img src="/results/screenshot_2.png" width="260" alt="detail screen">

## License
```
Copyright 2020 The Android Open Source Project
Copyright 2021 Mike Klimek

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    https://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
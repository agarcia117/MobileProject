<a href="https://imgur.com/5B6WccZ"><img src="https://i.imgur.com/5B6WccZ.png" title="source: imgur.com" width="311" height="400"/> </a>

# Notification Location  - Never Forget Again

> A Kotlin Android application which allows the user to set up a notification and keeps track of them on a specific location and time with a message.
>
>Think of this project as a template or starting point to creating your own notification location application.

- build status - passing
- coverage - 80%
- Android CompileSKDVersion 29
- Kotlin Version 1.3.50
- Simulated on Pixel 3
- Android 10.0
- **[MIT license](http://opensource.org/licenses/mit-license.php)**


![Build Status](http://img.shields.io/travis/badges/badgerbadgerbadger.svg?style=flat-square) ![https://img.shields.io/badge/coverage-80%25-brightgreen](https://img.shields.io/badge/coverage-80%25-brightgreen) [![License](http://img.shields.io/:license-mit-blue.svg?style=flat-square)](http://badges.mit-license.org) 

**Physical Representation of College Students**


<a href="https://imgur.com/D1MV54w"><img src="https://i.imgur.com/D1MV54w.jpg" title="source: imgur.com" /></a>

Photo by **[Tranmautritam](https://www.pexels.com/@tranmautritam?utm_content=attributionCopyText&utm_medium=referral&utm_source=pexels)** from **[Pexels](https://www.pexels.com/photo/photo-of-gray-and-white-tabby-kitten-sitting-on-sofa-2194261/?utm_content=attributionCopyText&utm_medium=referral&utm_source=pexels)**

Photo by **[Pixabay](https://www.pexels.com/@pixabay?utm_content=attributionCopyText&utm_medium=referral&utm_source=pexels)** from **[Pexels](https://www.pexels.com/photo/sky-earth-galaxy-universe-2422/?utm_content=attributionCopyText&utm_medium=referral&utm_source=pexels)**

**Map Location Sample**

<img src="http://recordit.co/jMT6cG2Oa7.gif"  alt="Map Location Sample" width="300">


**Inputting Data Sample**



**Calendar Sample**

---

## Table of Contents

- [Features](#features)
- [Examples](#examples)
- [Contributing](#contributing)
- [Team Not Haskell](#team-not-haskell)
- [FAQ](#faq)
- [Contacts](#contacts)
- [License](#license)

## Features

 - Allow the user to choose a destination on google map and place the notification.
 - Keeps track of your specific notification in a well organized list.
 - A simple and intuitive way to remind yourself on what needs to be done.
---

## Examples

**Map Location Sample Code**
```kotlin
//Google Map Section

lateinit var mapFragment: SupportMapFragment  
lateinit var googleMap: GoogleMap  
lateinit var locationManager: LocationManager
```
- Here are some notable variables on the Google map section to get started on your template.
- On `mapFragment` is where you initialize the SupportMapFragments
- `googleMap`  has all the classes you need to add the markers

**Inputting Data Sample Code**

```kotlin
//Inputting Data Section

class CalEvent(val name: String, val date: String, val time: String, val location: String) {  
    val eventname: String  
    val eventdate: String  
    val eventtime: String  
    val eventlocation: String  
    init{  
        eventname = name  
		eventdate = date  
        eventtime = time  
        eventlocation = location  
  }  
}
```
- These are some of the variables we used to store our events

**Calendar Sample Code**
```kotlin
//Calendar Section


```

---

## Contributing

> To get started or to help us develop this application further. 

### Step 1

- **Option 1**
    - Fork this repo! 

- **Option 2**
    - Clone this repo to your local machine using `https://github.com/agarcia117/MobileProject`

### Step 2

- Set up your Google Maps API Key to work with the project at <a href="https://developers.google.com/maps/documentation/android-sdk/get-api-key" target="_blank">`https://developers.google.com/maps/documentation/android-sdk/get-api-key`</a>

### Step 3
- Modify, test, copy, or continue on our work.

### Step 4

-  Create a new pull request using <a href="https://github.com/agarcia117/MobileProject/compare/" target="_blank">`https://github.com/agarcia117/MobileProject/compare/`</a>

---

## Team Not Haskell

| <a href="https://github.com/im-abram" target="_blank">**Abram**</a> | <a href="https://github.com/agarcia117" target="_blank">**Allen**</a> | <a href="https://github.com/HuangLA" target="_blank">**Huang**</a> | <a href="https://github.com/ChowJustin" target="_blank">**Justin**</a> |
| :---: |:---:| :---:| :---:|
|<a href="https://avatars2.githubusercontent.com/u/48164193?s=400&v=4"><img src="https://avatars2.githubusercontent.com/u/48164193?s=400&v=4" width="200" height="200"/></a>| <a href="https://avatars2.githubusercontent.com/u/43732771?s=400&v=4"><img src="https://avatars2.githubusercontent.com/u/43732771?s=400&v=4" width="200" height="200"/> </a> | <a href="https://avatars3.githubusercontent.com/u/35882142?s=460&v=4"><img src="https://avatars3.githubusercontent.com/u/35882142?s=460&v=4" width="200" height="200"/></a> | <a href="https://avatars0.githubusercontent.com/u/3687369?s=460&v=4"><img src="https://avatars0.githubusercontent.com/u/3687369?s=460&v=4" width="200" height="200"/> </a>
| <a href="https://github.com/im-abram" target="_blank">`github.com/im-abram`</a> | <a href="https://github.com/agarcia117" target="_blank">`github.com/agarcia117`</a> | <a href="https://github.com/HuangLA" target="_blank">`github.com/HuangLA`</a> | <a href="https://github.com/ChowJustin" target="_blank">`github.com/ChowJustin`</a> 
---


## FAQ

- **What was the point of this project?**
    - Our team did this to test our knowledge on an Android Kotlin class and the get more familiar with Android Studio, Git, and Github.
    
- **How long did it take to finish the project?**
    - If we were to estimate, this project took our team about 100-man-hours. This included research, coding, debugging, and collaborating . Since this was a four man group effort, that is about 50-hours per person.

- **What do I do if the project doesn't run?**
    - It will most likely be compiler version not on the latest version or missing SDKs. Also, try to run the application on Pixel 3 Android 10.0 as that is the emulator we used. However, if you are still stuck then send us a message on our socials with the contacts below. 

---

## Contacts

Reach out to us at one of the following places!

**Abram**
- Twitter at <a href="https://twitter.com/Im_abram_tbh" target="_blank">`@Im_abram_tbh`</a>

**Allen**

- github at  <a href="https://github.com/agarcia117" target="_blank">`github.com/agarcia117`</a> 

**Huang**

- Twitter at <a href="https://twitter.com/xuh8" target="_blank">`@xuh8`</a>

**Justin**
- Twitter at <a href="http://twitter.com/justinsidechow" target="_blank">`@justinsidechow`</a>

## License

[![License](http://img.shields.io/:license-mit-blue.svg?style=flat-square)](http://badges.mit-license.org)

- **[MIT license](http://opensource.org/licenses/mit-license.php)**
- Code developed from team <a href="https://github.com/agarcia117/MobileProject" target="_blank">Not Haskell</a>.
- Copyright 2019 © <a href="https://github.com/agarcia117/MobileProject" target="_blank">Not Haskell</a>. 

- **[MIT license](http://opensource.org/licenses/mit-license.php)**
- readme template from <a href="http://fvcproductions.com" target="_blank">FVCproductions</a>.
- Copyright 2015 © <a href="http://fvcproductions.com" target="_blank">FVCproductions</a>. 
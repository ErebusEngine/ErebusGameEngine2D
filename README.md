Erebus2D Engine
==================

Erebus2D Engine is a native android framework for building 2D games, interactive books, demos and other graphical applications. 
Unlike other game engines which uses C++ and CMake to build, test and package 2D games, it uses only Java which enables seamless 
integration and compatibility with many widely used JAVA IDEs. It allows you to introduce many complex animation effects in your 
application with one or two lines of code.

 * Quick and easy implementation
 * Lightweight
 * Good performace under high load.
 * Supports many widely used JAVA integrated development environments (Android Studio, Eclipse, Netbeans)

 ![alt text](sample_image.png)

 Usage:
========

Including In Your Project
-------------------------

 -  Step 1: Add the following in your root `build.gradle` at the end of repositories:

 ```gradle
repositories {
      maven { 
        url "https://jitpack.io" 
      }
}
``` 
 -  Step 2: Add the dependency:

 ```gradle
dependencies {
      implementation 'com.github.erebusengine:erebusgameengine2d:v1.0.0'
}
``` 

Please refer to the demo app for more information.

```java
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);         //layout of main activity

        ImageView imageObject = findViewById(R.id.imageObject);
        imageObject.setOnClickListener(this);

    }
```

For documentation and additional information see [the website][3].

__Note: Remember to implement View.onCLickListener.__






License
-------

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


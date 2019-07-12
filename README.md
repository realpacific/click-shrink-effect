# Click Shrink Effect
[![](https://jitpack.io/v/realpacific/click-shrink-effect.svg)](https://jitpack.io/#realpacific/click-shrink-effect)

A simple library to add a temporary shrinking effect on `View` while clicking. 

## Demo

<img src="screens/screen.gif" height="400" width="250"/>


## Usage

Kotlin:
```
 button.applyClickShrink()
 fab.applyClickShrink()
 card_view.applyClickShrink()
 textview.applyClickShrink()
 image_view.applyClickShrink()
```

Java:
```
ClickShrinkEffectKt.applyClickShrink(button);
ClickShrinkEffectKt.applyClickShrink(fab);
    // OR
new ClickShrinkEffect(button);
new ClickShrinkEffect(fab);
```




## Installation
In build.gradle

```
allprojects {
   repositories {
	...
	maven { url 'https://jitpack.io' }
   }
}

dependencies {
    implementation 'com.github.realpacific:click-shrink-effect:1.0'
}
```


## License
```
MIT License

Copyright (c) 2019 Prashant Barahi

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

```


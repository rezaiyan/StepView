# StepView


<p align="center">
  <img src="./art/stepview.png" height="400" width="220"/>
</p>

## Installation

Add the dependency to your app build.gradle file:

```
implementation "ir.alirezaiyan:stepview:1.0.0"
```

## Usage


```xml

    <ir.alirezaiyan.stepview.StepIndicator
        android:id="@+id/stepIndicator"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="top"
        android:clickable="false"
        android:focusable="false"
        app:siRadius="25dp"
        app:siStepCount="4"
        app:siStrokeWidth="2dp" />



```

License
--------

    Copyright 2020 alirezaiyann@gmail.com

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

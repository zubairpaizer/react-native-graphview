[example-url]: https://i.imgur.com/mHGaOX5.gif
[npm-badge]: https://img.shields.io/npm/v/react-native-graphview.svg?colorB=ff6d00
[npm-url]: https://npmjs.com/package/react-native-graphview
[license-badge]: https://img.shields.io/npm/l/react-native-graphview.svg?colorB=448aff

[![npm][npm-badge]][npm-url]
![license][license-badge]

## Note
This version is only for the android

## Installation

```bash
npm install --save react-native-graphview
react-native link react-native-graphview
```

### Android
1. Add the following in android/settings.gradle:

```groovy
include ':react-native-graphview'
project(':react-native-graphview').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-graphview/android/app')
```
2. Update MainApplication.java

```java
  import com.reactnativegraphview.GraphPackage;

  public class MainApplication extends Application implements ReactApplication {
    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
          new GraphPackage()
      );
    }
  }
```
3. Update build.gradle.java

```groovy
  dependencies {
    implementation project(':react-native-graphview')
  }
```

## Properties
<table>
	<tr>
		<th>Props</th>
		<th>Description</th>
	</tr>
    </tr>
	<tr>
	   <td>data</td>
	   <td>same props to all graph types</td>
   </tr>
</table>

# Example
```jsx
import React, { Component } from 'react';
import { StyleSheet, Text, View } from 'react-native';
import { LineGraph, BarGraph, PointsGraph } from 'react-native-graphview';

const data = [{x: 0, y: 1}, {x: 1, y: 5}, {x: 2, y: 9}, {x: 3, y: 2}, {x: 4, y: 6}];

export default class App extends Component{
  render() {
    return (
      <View style={styles.container}>
        <LineGraph  
          style={{
            height: 400,
            width: 400
          }}
          data={[{x: 0, y: 1}, {x: 1, y: 5}, {x: 2, y: 9}, {x: 3, y: 2}, {x: 4, y: 6}]} />

        <BarGraph  
          style={{
            height: 400,
            width: 400
          }}
          data={[{x: 0, y: 1}, {x: 1, y: 5}, {x: 2, y: 9}, {x: 3, y: 2}, {x: 4, y: 6}]} />

        <PointsGraph  
          style={{
            height: 400,
            width: 400
          }}
          data={[{x: 0, y: 1}, {x: 1, y: 5}, {x: 2, y: 9}, {x: 3, y: 2}, {x: 4, y: 6}]} />
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  }
});

```
# react-native-android-settings-opener

Only support to open the current app settings details

## Install
 1.  Add ```"android-settings-opener": "git://github.com/tilr-corp/Android-Settings-Opener.git"``` to package.json
 
 2.  Run ```npm install``` and ```react-native link android-settings-opener```
 

## How to use
```javascript
import AndroidAppSettingsOpener from 'android-settings-opener';
  
AndroidAppSettingsOpener.open((result) => {
  console.log(result)
})
```

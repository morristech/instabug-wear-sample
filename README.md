## InstabugWear

The first bug reporting SDK for Android wearable devices. This is Version 0.1.0.

#### Version 0.1.0

InstabugWear detects a shake gesture from your smartwatch and triggers prompt options on your smartphone to start a chat, report a bug, or send feedback. Bug reports and feedback include an annotatable screenshot from the wearable device. 

This works when your smartwatch is connected to your mobile and the same app is installed on both devices. The gesture only works when the app is open in the foreground of your mobile and wearable device at the same time.

#### Upcoming Versions

In progress. Bug reports will include:

* Device type
* Device vendor
* App version
* Device locale
* OS level
* Network state
* Battery state
* Extra screenshots

## Integration Steps

Step 1. Add this code snippet in your root build.gradle file in order to be able to compile instabug-mobile SDK properly:
```gradle
       	allprojects {
       		repositories {
       			...
       			maven { url 'https://jitpack.io' }
       		}
       	}

```

Step 2. Add the dependency to your mobile app module:
```gradle
dependencies {
	        compile 'com.github.Instabug.instabug-wear-sdk:instabug-mobile:0.1.0'
	}
```
Step 3. Add the dependency to your wear app module:
```gradle
dependencies {
	        compile 'com.github.Instabug.instabug-wear-sdk:instabug-wear:0.1.0'
	}
```

## Usage 
Now all you need to do is: 

### In your mobile app module

In the Application class add this line to the onCreate method:
```java 
 new Instabug.Builder(this, "APP_TOKEN").build();
```
You can find your app token by selecting the SDK tab from your [Instabug dashboard](https://dashboard.instabug.com/app/sdk/). If you don't already have an Instabug account, you can sign up for free [here](https://dashboard.instabug.com/signup?utm_source=InstabugWear&utm_medium=readme).

### In your wear app module

In the Application class add this line to the onCreate method:
```java
        InstabugWear.getInstance().init(this);
```

and that's it!

Just shake your smartwatch to report bugs, send feedback, or start chatting with the dev team.

### Customizations 

If you want to customize the UI and other features, see our [Android-docs](https://docs.instabug.com/docs/android-user-experience) (note: you can skip the integration steps).

## Contact Us

If you have any questions or feedback, don't hesitate to get in touch. You can reach us at any time through [support@instabug.com](mailto:support@instabug.com).

## Authors
* **Hossam Hassan**

Email: [hossamhassancs15@gmail.com](mailto:hossamhassancs15@gmail.com)

## License

This project is licensed under [MIT License](https://opensource.org/licenses/mit-license.php).

© 2017 Instabug. All rights reserved.

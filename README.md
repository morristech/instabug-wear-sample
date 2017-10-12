## InstabugWear

The first bug reporting SDK for Android wearable devices.


## Integration Steps

Step 1. Add this code snippet in your root build.gradle file in order to be able to compile instabug-mobile SDK properly.
```gradle
       	allprojects {
       		repositories {
       			...
       			maven { url 'https://jitpack.io' }
       		}
       	}

```

Step 2. Add the dependency to your mobile app module
```gradle
dependencies {
	        compile 'com.github.Instabug.instabug-wear-sdk:instabug-mobile:0.1.0'
	}
```
Step 3. Add the dependency to your wear app module
```gradle
dependencies {
	        compile 'com.github.Instabug.instabug-wear-sdk:instabug-wear:0.1.0'
	}
```

## Usage 
Now all you need to do is: 

### In your mobile app module:

In the Application class add this line to the onCreate method.
```java 
 new Instabug.Builder(this, "APP_TOKEN").build();
```
You can find your app token by selecting the SDK tab from your [Instabug dashboard](https://dashboard.instabug.com/app/sdk/).

### In your wear app module:

In the Application class add this line to the onCreate method.
```java
        InstabugWear.getInstance().init(this);
```

and that's it 
Just shake your smart watch to report bugs, send feedback or start chatting 
### Customization 

This is our [Android-docs](https://docs.instabug.com/docs/android-user-experience) (note: you can skip the integration steps)
## Contact Us

If you have any questions or feedback don't hesitate to get in touch. You can reach us at any time through [support@instabug.com](mailto:support@instabug.com).

## Authors
* **Hossam Hassan**

Email: [hossamhassancs15@gmail.com](mailto:hossamhassancs15@gmail.com)

## License
This project is licensed under [MIT License](https://opensource.org/licenses/mit-license.php).

© 2017 Instabug. All rights reserved.

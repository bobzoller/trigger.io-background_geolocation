# trigger.io-background_geolocation

A [Trigger.io](http://trigger.io/) module for battery-efficient listening of geolocation change events.

## Status

WIP: currently untested.

Once Android works I'll probably integrate the iOS code from [christocracy/cordova-plugin-background-geolocation](https://github.com/christocracy/cordova-plugin-background-geolocation).

## Usage

```javascript
  forge.internal.addEventListener('background_geolocation.locationChanged', function(location) {
    alert('lat:', location.lat, 'lon:', location.lon);
  });
```

## Credits

* http://uncorkedstudios.com/blog/background-location-updates-on-android
* https://gist.github.com/blackcj/20efe2ac885c7297a676


package io.trigger.forge.android.modules.background_geolocation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;

import com.google.android.gms.location.LocationClient;
import com.google.gson.JsonObject;

import io.trigger.forge.android.core.ForgeApp;

public class LocationReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Location location = (Location) intent.getExtras().get(LocationClient.KEY_LOCATION_CHANGED);
        JsonObject json = new JsonObject();
        json.addProperty("lat", location.getLatitude());
        json.addProperty("lon", location.getLongitude());
        ForgeApp.event("background_geolocation.locationChanged", json);
    }

}

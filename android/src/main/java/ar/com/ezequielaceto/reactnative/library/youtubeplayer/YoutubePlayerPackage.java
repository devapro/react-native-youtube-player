package ar.com.ezequielaceto.reactnative.library.youtubeplayer;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class YoutubePlayerPackage implements ReactPackage {
    public YoutubePlayerPackage(String apiKey) {
        YoutubePublicAPIKey = apiKey;
    }
    
    public YoutubePlayerPackage() {
    }

    protected static String YoutubePublicAPIKey = "";


    @Override public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        return Arrays.<NativeModule>asList(new YoutubePlayerManager(reactContext));
    }

    @Override public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }
}

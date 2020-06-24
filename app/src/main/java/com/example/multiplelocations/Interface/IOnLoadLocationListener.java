package com.example.multiplelocations.Interface;

import com.example.multiplelocations.MyLatLng;
import com.google.android.gms.maps.model.LatLng;

import java.util.List;

public interface IOnLoadLocationListener {
    void OnLoadLocationSuccess(List<MyLatLng>latLngs);
    void OnLoadLocationFailed(String message);
}

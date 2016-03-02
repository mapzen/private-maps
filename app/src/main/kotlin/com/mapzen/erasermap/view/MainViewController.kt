package com.mapzen.erasermap.view

import android.location.Location
import android.view.MotionEvent
import com.mapzen.pelias.gson.Feature
import com.mapzen.valhalla.Route

public interface MainViewController {
    public fun showSearchResults(features: List<Feature>)
    public fun addSearchResultsToMap(features: List<Feature>, activeIndex: Int)
    public fun showDirectionList()
    public fun centerOnCurrentFeature(features: List<Feature>)
    public fun centerOnFeature(features: List<Feature>, position: Int)
    public fun showAllSearchResults(features: List<Feature>)
    public fun hideSearchResults()
    public fun hideReverseGeolocateResult()
    public fun showReverseGeocodeFeature(features: List<Feature>)
    public fun showPlaceSearchFeature(features: List<Feature>)
    public fun showProgress()
    public fun hideProgress()
    public fun showActionViewAll()
    public fun hideActionViewAll()
    public fun collapseSearchView()
    public fun expandSearchView()
    public fun clearQuery()
    public fun showRoutePreview(location: Location, feature: Feature)
    public fun hideRoutePreview()
    public fun hideRoutingMode()
    public fun startRoutingMode(feature: Feature)
    public fun resumeRoutingMode(feature: Feature)
    public fun shutDown()
    public fun centerMapOnLocation(location: Location, zoom: Float)
    public fun showCurrentLocation(location: Location)
    public fun setMapTilt(radians: Float)
    public fun resetMute()
    public fun toggleMute()
    public fun setMapRotation(radians: Float)
    public fun drawRoute(route: Route)
    public fun clearRoute()
    public fun rotateCompass()
    public fun reverseGeolocate(screenX: Float, screenY: Float)
    public fun placeSearch(gid: String)
    public fun emptyPlaceSearch()
    public fun overridePlaceFeature(feature: Feature)
    public fun drawTappedPoiPin()
    public fun hideSettingsBtn()
    public fun showSettingsBtn()
    public fun onBackPressed()
}

package com.example.myapplication

import io.reactivex.Observable


abstract class AdsExperienceBaseTileKey: TileKey {

    abstract fun getEligibility(): Observable<Boolean>

    var pageModel: PageModel? = null

    var type: AdType = AdType.UNKNOWN

    var tileId: String = ""
}


class PageModel {

}

enum class AdType {
    UNKNOWN, KNOWN
}

enum class ComponentKey {
    ADS_EXPERIENCE, BASIC_EXPERIENCE
}
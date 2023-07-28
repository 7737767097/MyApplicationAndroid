package com.example.myapplication

import io.reactivex.Observable


class AdsExperienceGenericTileKey: AdsExperienceBaseTileKey() {

    override fun getEligibility(): Observable<Boolean> = Observable.just(true)

    override val componentKey: ComponentKey
        get() = ComponentKey.ADS_EXPERIENCE

}
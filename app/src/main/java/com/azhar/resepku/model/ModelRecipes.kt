package com.azhar.resepku.model

import io.realm.RealmObject
import java.io.Serializable


open class ModelRecipes : RealmObject(), Serializable {
    var strTitleResep: String? = null
    var strThumbnail: String? = null
    var strKeyResep: String? = null
    var strTimes: String? = null
    var strPortion: String? = null
    var strDificulty: String? = null
}
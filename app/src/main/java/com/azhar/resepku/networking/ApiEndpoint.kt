package com.azhar.resepku.networking


object ApiEndpoint {
    var BASEURL = "https://unofficial-masakapahariini-api-main-mod.vercel.app"
    var PAGE = "/api/recipes/{page}"
    var CATEGORIES = "/api/category/recipes"
    var LIST_CATEGORIES = "/api/category/recipes/{key}"
    var DETAIL_RECIPES = "/api/recipe/{key}"
    var SEARCH_RECIPES = "/api/search/?q={query}"
}

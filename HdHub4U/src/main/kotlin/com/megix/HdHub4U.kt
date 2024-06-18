package com.megix

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context
import com.lagradost.cloudstream3.extractors.Gofile

@CloudstreamPlugin
class HdHub4U: Plugin() {
    override fun load(context: Context) {
        // All providers should be added in this manner. Please don't edit the providers list directly.
        registerMainAPI(HdHub4UProvider())
        registerExtractorAPI(Gamerxyt())
        registerExtractorAPI(Gofile())

    }
}

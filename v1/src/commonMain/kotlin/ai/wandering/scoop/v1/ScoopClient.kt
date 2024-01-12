package ai.wandering.scoop.v1

import ai.wandering.scoop.v1.http.GetGlobalTopStories
import ai.wandering.scoop.v1.http.GetPublications
import ai.wandering.scoop.v1.impl.RealScoopClient

interface ScoopClient {
    val getGlobalTopStories: GetGlobalTopStories
    val getPublications: GetPublications

    companion object {
        operator fun invoke(): ScoopClient = RealScoopClient()
    }
}



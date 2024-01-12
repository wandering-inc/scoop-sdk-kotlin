package ai.wandering.scoop.v1.impl

import ai.wandering.scoop.v1.ScoopClient
import ai.wandering.scoop.v1.http.GetGlobalTopStories
import ai.wandering.scoop.v1.http.GetPublications
import ai.wandering.scoop.v1.http.impl.RealGetGlobalTopStories
import ai.wandering.scoop.v1.http.impl.RealGetPublications

internal class RealScoopClient : ScoopClient {
    override val getGlobalTopStories: GetGlobalTopStories = RealGetGlobalTopStories()
    override val getPublications: GetPublications = RealGetPublications()
}
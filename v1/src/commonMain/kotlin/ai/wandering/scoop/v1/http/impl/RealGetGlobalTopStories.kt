package ai.wandering.scoop.v1.http.impl

import ai.wandering.scoop.v1.http.GetGlobalTopStories
import ai.wandering.scoop.v1.models.Story

internal class RealGetGlobalTopStories : GetGlobalTopStories {
    override operator fun invoke(): List<Story> {
        TODO()
    }
}
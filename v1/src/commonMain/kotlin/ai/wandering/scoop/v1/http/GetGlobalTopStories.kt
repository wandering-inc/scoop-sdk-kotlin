package ai.wandering.scoop.v1.http

import ai.wandering.scoop.v1.models.GetGlobalTopStoriesArgs
import ai.wandering.scoop.v1.models.GetGlobalTopStoriesResponse


interface GetGlobalTopStories {
    suspend operator fun invoke(args: GetGlobalTopStoriesArgs): GetGlobalTopStoriesResponse
}


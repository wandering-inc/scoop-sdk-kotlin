package ai.wandering.scoop.v1.http

import ai.wandering.scoop.v1.models.GetUSTopStoriesArgs
import ai.wandering.scoop.v1.models.GetUSTopStoriesResponse


interface GetUSTopStories {
    suspend operator fun invoke(args: GetUSTopStoriesArgs): GetUSTopStoriesResponse
}


package ai.wandering.scoop.v1.http

import ai.wandering.scoop.v1.models.Story


interface GetGlobalTopStories {
    operator fun invoke(): List<Story>
}


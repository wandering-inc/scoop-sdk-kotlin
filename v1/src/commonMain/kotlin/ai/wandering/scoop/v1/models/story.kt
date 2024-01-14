@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class StoryThumbnail(
    val url: String = "",
    val width: Int? = null,
    val height: Int? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.StoryThumbnail = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.StoryThumbnail> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.StoryThumbnail> {
        public val defaultInstance: ai.wandering.scoop.v1.models.StoryThumbnail by lazy { ai.wandering.scoop.v1.models.StoryThumbnail() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.StoryThumbnail = ai.wandering.scoop.v1.models.StoryThumbnail.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.StoryThumbnail> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.StoryThumbnail, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "url",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "url",
                        value = ai.wandering.scoop.v1.models.StoryThumbnail::url
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "width",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "width",
                        value = ai.wandering.scoop.v1.models.StoryThumbnail::width
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "height",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "height",
                        value = ai.wandering.scoop.v1.models.StoryThumbnail::height
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.StoryThumbnail",
                messageClass = ai.wandering.scoop.v1.models.StoryThumbnail::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class Story(
    val id: String = "",
    val title: String = "",
    val url: String = "",
    val guid: String = "",
    val isPermalink: Boolean = false,
    val publicationDate: Long = 0L,
    val description: String = "",
    val thumbnails: List<ai.wandering.scoop.v1.models.StoryThumbnail> = emptyList(),
    val content: String? = null,
    val summary: String? = null,
    val vectorRepresentation: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.Story = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Story> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.Story> {
        public val defaultInstance: ai.wandering.scoop.v1.models.Story by lazy { ai.wandering.scoop.v1.models.Story() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.Story = ai.wandering.scoop.v1.models.Story.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Story> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.Story, *>>(11)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = ai.wandering.scoop.v1.models.Story::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "title",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "title",
                        value = ai.wandering.scoop.v1.models.Story::title
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "url",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "url",
                        value = ai.wandering.scoop.v1.models.Story::url
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "guid",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "guid",
                        value = ai.wandering.scoop.v1.models.Story::guid
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "is_permalink",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "isPermalink",
                        value = ai.wandering.scoop.v1.models.Story::isPermalink
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "publication_date",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(),
                        jsonName = "publicationDate",
                        value = ai.wandering.scoop.v1.models.Story::publicationDate
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "description",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "description",
                        value = ai.wandering.scoop.v1.models.Story::description
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "thumbnails",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.StoryThumbnail>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.StoryThumbnail.Companion)),
                        jsonName = "thumbnails",
                        value = ai.wandering.scoop.v1.models.Story::thumbnails
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "content",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "content",
                        value = ai.wandering.scoop.v1.models.Story::content
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "summary",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "summary",
                        value = ai.wandering.scoop.v1.models.Story::summary
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "vector_representation",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "vectorRepresentation",
                        value = ai.wandering.scoop.v1.models.Story::vectorRepresentation
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.Story",
                messageClass = ai.wandering.scoop.v1.models.Story::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class StoryAssocs(
    val tags: List<ai.wandering.scoop.v1.models.Tag> = emptyList(),
    val people: List<ai.wandering.scoop.v1.models.Person> = emptyList(),
    val companies: List<ai.wandering.scoop.v1.models.Company> = emptyList(),
    val industries: List<ai.wandering.scoop.v1.models.Industry> = emptyList(),
    val skills: List<ai.wandering.scoop.v1.models.Skill> = emptyList(),
    val locations: List<ai.wandering.scoop.v1.models.Location> = emptyList(),
    val author: ai.wandering.scoop.v1.models.Author? = null,
    val publication: ai.wandering.scoop.v1.models.Publication? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.StoryAssocs = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.StoryAssocs> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.StoryAssocs> {
        public val defaultInstance: ai.wandering.scoop.v1.models.StoryAssocs by lazy { ai.wandering.scoop.v1.models.StoryAssocs() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.StoryAssocs = ai.wandering.scoop.v1.models.StoryAssocs.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.StoryAssocs> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.StoryAssocs, *>>(8)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tags",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Tag>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Tag.Companion)),
                        jsonName = "tags",
                        value = ai.wandering.scoop.v1.models.StoryAssocs::tags
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "people",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Person>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Person.Companion)),
                        jsonName = "people",
                        value = ai.wandering.scoop.v1.models.StoryAssocs::people
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "companies",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Company>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Company.Companion)),
                        jsonName = "companies",
                        value = ai.wandering.scoop.v1.models.StoryAssocs::companies
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "industries",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Industry>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Industry.Companion)),
                        jsonName = "industries",
                        value = ai.wandering.scoop.v1.models.StoryAssocs::industries
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "skills",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Skill>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Skill.Companion)),
                        jsonName = "skills",
                        value = ai.wandering.scoop.v1.models.StoryAssocs::skills
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "locations",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Location>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Location.Companion)),
                        jsonName = "locations",
                        value = ai.wandering.scoop.v1.models.StoryAssocs::locations
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "author",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Author.Companion),
                        jsonName = "author",
                        value = ai.wandering.scoop.v1.models.StoryAssocs::author
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "publication",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Publication.Companion),
                        jsonName = "publication",
                        value = ai.wandering.scoop.v1.models.StoryAssocs::publication
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.StoryAssocs",
                messageClass = ai.wandering.scoop.v1.models.StoryAssocs::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class PopulatedStory(
    val story: ai.wandering.scoop.v1.models.Story? = null,
    val assocs: ai.wandering.scoop.v1.models.StoryAssocs? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.PopulatedStory = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.PopulatedStory> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.PopulatedStory> {
        public val defaultInstance: ai.wandering.scoop.v1.models.PopulatedStory by lazy { ai.wandering.scoop.v1.models.PopulatedStory() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.PopulatedStory = ai.wandering.scoop.v1.models.PopulatedStory.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.PopulatedStory> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.PopulatedStory, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "story",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Story.Companion),
                        jsonName = "story",
                        value = ai.wandering.scoop.v1.models.PopulatedStory::story
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "assocs",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.StoryAssocs.Companion),
                        jsonName = "assocs",
                        value = ai.wandering.scoop.v1.models.PopulatedStory::assocs
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.PopulatedStory",
                messageClass = ai.wandering.scoop.v1.models.PopulatedStory::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class Location(
    val id: String = "",
    val name: String = "",
    val city: String = "",
    val country: String = "",
    val state: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.Location = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Location> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.Location> {
        public val defaultInstance: ai.wandering.scoop.v1.models.Location by lazy { ai.wandering.scoop.v1.models.Location() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.Location = ai.wandering.scoop.v1.models.Location.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Location> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.Location, *>>(5)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = ai.wandering.scoop.v1.models.Location::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = ai.wandering.scoop.v1.models.Location::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "city",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "city",
                        value = ai.wandering.scoop.v1.models.Location::city
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "country",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "country",
                        value = ai.wandering.scoop.v1.models.Location::country
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "state",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "state",
                        value = ai.wandering.scoop.v1.models.Location::state
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.Location",
                messageClass = ai.wandering.scoop.v1.models.Location::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class LocationAssocs(
    val stories: List<ai.wandering.scoop.v1.models.Story> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.LocationAssocs = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.LocationAssocs> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.LocationAssocs> {
        public val defaultInstance: ai.wandering.scoop.v1.models.LocationAssocs by lazy { ai.wandering.scoop.v1.models.LocationAssocs() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.LocationAssocs = ai.wandering.scoop.v1.models.LocationAssocs.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.LocationAssocs> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.LocationAssocs, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "stories",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Story>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Story.Companion)),
                        jsonName = "stories",
                        value = ai.wandering.scoop.v1.models.LocationAssocs::stories
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.LocationAssocs",
                messageClass = ai.wandering.scoop.v1.models.LocationAssocs::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class PopulatedLocation(
    val location: ai.wandering.scoop.v1.models.Location? = null,
    val assocs: ai.wandering.scoop.v1.models.LocationAssocs? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.PopulatedLocation = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.PopulatedLocation> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.PopulatedLocation> {
        public val defaultInstance: ai.wandering.scoop.v1.models.PopulatedLocation by lazy { ai.wandering.scoop.v1.models.PopulatedLocation() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.PopulatedLocation = ai.wandering.scoop.v1.models.PopulatedLocation.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.PopulatedLocation> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.PopulatedLocation, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "location",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Location.Companion),
                        jsonName = "location",
                        value = ai.wandering.scoop.v1.models.PopulatedLocation::location
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "assocs",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.LocationAssocs.Companion),
                        jsonName = "assocs",
                        value = ai.wandering.scoop.v1.models.PopulatedLocation::assocs
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.PopulatedLocation",
                messageClass = ai.wandering.scoop.v1.models.PopulatedLocation::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForStoryThumbnail")
public fun StoryThumbnail?.orDefault(): ai.wandering.scoop.v1.models.StoryThumbnail = this ?: StoryThumbnail.defaultInstance

private fun StoryThumbnail.protoMergeImpl(plus: pbandk.Message?): StoryThumbnail = (plus as? StoryThumbnail)?.let {
    it.copy(
        width = plus.width ?: width,
        height = plus.height ?: height,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun StoryThumbnail.Companion.decodeWithImpl(u: pbandk.MessageDecoder): StoryThumbnail {
    var url = ""
    var width: Int? = null
    var height: Int? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> url = _fieldValue as String
            2 -> width = _fieldValue as Int
            3 -> height = _fieldValue as Int
        }
    }

    return StoryThumbnail(url, width, height, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForStory")
public fun Story?.orDefault(): ai.wandering.scoop.v1.models.Story = this ?: Story.defaultInstance

private fun Story.protoMergeImpl(plus: pbandk.Message?): Story = (plus as? Story)?.let {
    it.copy(
        thumbnails = thumbnails + plus.thumbnails,
        content = plus.content ?: content,
        summary = plus.summary ?: summary,
        vectorRepresentation = plus.vectorRepresentation ?: vectorRepresentation,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Story.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Story {
    var id = ""
    var title = ""
    var url = ""
    var guid = ""
    var isPermalink = false
    var publicationDate = 0L
    var description = ""
    var thumbnails: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.StoryThumbnail>? = null
    var content: String? = null
    var summary: String? = null
    var vectorRepresentation: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> title = _fieldValue as String
            3 -> url = _fieldValue as String
            4 -> guid = _fieldValue as String
            5 -> isPermalink = _fieldValue as Boolean
            6 -> publicationDate = _fieldValue as Long
            7 -> description = _fieldValue as String
            8 -> thumbnails = (thumbnails ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.StoryThumbnail> }
            9 -> content = _fieldValue as String
            10 -> summary = _fieldValue as String
            11 -> vectorRepresentation = _fieldValue as String
        }
    }

    return Story(id, title, url, guid,
        isPermalink, publicationDate, description, pbandk.ListWithSize.Builder.fixed(thumbnails),
        content, summary, vectorRepresentation, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForStoryAssocs")
public fun StoryAssocs?.orDefault(): ai.wandering.scoop.v1.models.StoryAssocs = this ?: StoryAssocs.defaultInstance

private fun StoryAssocs.protoMergeImpl(plus: pbandk.Message?): StoryAssocs = (plus as? StoryAssocs)?.let {
    it.copy(
        tags = tags + plus.tags,
        people = people + plus.people,
        companies = companies + plus.companies,
        industries = industries + plus.industries,
        skills = skills + plus.skills,
        locations = locations + plus.locations,
        author = author?.plus(plus.author) ?: plus.author,
        publication = publication?.plus(plus.publication) ?: plus.publication,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun StoryAssocs.Companion.decodeWithImpl(u: pbandk.MessageDecoder): StoryAssocs {
    var tags: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Tag>? = null
    var people: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Person>? = null
    var companies: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Company>? = null
    var industries: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Industry>? = null
    var skills: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Skill>? = null
    var locations: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Location>? = null
    var author: ai.wandering.scoop.v1.models.Author? = null
    var publication: ai.wandering.scoop.v1.models.Publication? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> tags = (tags ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Tag> }
            2 -> people = (people ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Person> }
            3 -> companies = (companies ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Company> }
            4 -> industries = (industries ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Industry> }
            5 -> skills = (skills ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Skill> }
            6 -> locations = (locations ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Location> }
            7 -> author = _fieldValue as ai.wandering.scoop.v1.models.Author
            8 -> publication = _fieldValue as ai.wandering.scoop.v1.models.Publication
        }
    }

    return StoryAssocs(pbandk.ListWithSize.Builder.fixed(tags), pbandk.ListWithSize.Builder.fixed(people), pbandk.ListWithSize.Builder.fixed(companies), pbandk.ListWithSize.Builder.fixed(industries),
        pbandk.ListWithSize.Builder.fixed(skills), pbandk.ListWithSize.Builder.fixed(locations), author, publication, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPopulatedStory")
public fun PopulatedStory?.orDefault(): ai.wandering.scoop.v1.models.PopulatedStory = this ?: PopulatedStory.defaultInstance

private fun PopulatedStory.protoMergeImpl(plus: pbandk.Message?): PopulatedStory = (plus as? PopulatedStory)?.let {
    it.copy(
        story = story?.plus(plus.story) ?: plus.story,
        assocs = assocs?.plus(plus.assocs) ?: plus.assocs,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PopulatedStory.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PopulatedStory {
    var story: ai.wandering.scoop.v1.models.Story? = null
    var assocs: ai.wandering.scoop.v1.models.StoryAssocs? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> story = _fieldValue as ai.wandering.scoop.v1.models.Story
            2 -> assocs = _fieldValue as ai.wandering.scoop.v1.models.StoryAssocs
        }
    }

    return PopulatedStory(story, assocs, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForLocation")
public fun Location?.orDefault(): ai.wandering.scoop.v1.models.Location = this ?: Location.defaultInstance

private fun Location.protoMergeImpl(plus: pbandk.Message?): Location = (plus as? Location)?.let {
    it.copy(
        state = plus.state ?: state,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Location.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Location {
    var id = ""
    var name = ""
    var city = ""
    var country = ""
    var state: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> name = _fieldValue as String
            3 -> city = _fieldValue as String
            4 -> country = _fieldValue as String
            5 -> state = _fieldValue as String
        }
    }

    return Location(id, name, city, country,
        state, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForLocationAssocs")
public fun LocationAssocs?.orDefault(): ai.wandering.scoop.v1.models.LocationAssocs = this ?: LocationAssocs.defaultInstance

private fun LocationAssocs.protoMergeImpl(plus: pbandk.Message?): LocationAssocs = (plus as? LocationAssocs)?.let {
    it.copy(
        stories = stories + plus.stories,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun LocationAssocs.Companion.decodeWithImpl(u: pbandk.MessageDecoder): LocationAssocs {
    var stories: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Story>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> stories = (stories ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Story> }
        }
    }

    return LocationAssocs(pbandk.ListWithSize.Builder.fixed(stories), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPopulatedLocation")
public fun PopulatedLocation?.orDefault(): ai.wandering.scoop.v1.models.PopulatedLocation = this ?: PopulatedLocation.defaultInstance

private fun PopulatedLocation.protoMergeImpl(plus: pbandk.Message?): PopulatedLocation = (plus as? PopulatedLocation)?.let {
    it.copy(
        location = location?.plus(plus.location) ?: plus.location,
        assocs = assocs?.plus(plus.assocs) ?: plus.assocs,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PopulatedLocation.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PopulatedLocation {
    var location: ai.wandering.scoop.v1.models.Location? = null
    var assocs: ai.wandering.scoop.v1.models.LocationAssocs? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> location = _fieldValue as ai.wandering.scoop.v1.models.Location
            2 -> assocs = _fieldValue as ai.wandering.scoop.v1.models.LocationAssocs
        }
    }

    return PopulatedLocation(location, assocs, unknownFields)
}

@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class Thumbnail(
    val url: String = "",
    val width: Long? = null,
    val height: Long? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.Thumbnail = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Thumbnail> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.Thumbnail> {
        public val defaultInstance: ai.wandering.scoop.v1.models.Thumbnail by lazy { ai.wandering.scoop.v1.models.Thumbnail() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.Thumbnail = ai.wandering.scoop.v1.models.Thumbnail.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Thumbnail> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.Thumbnail, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "url",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "url",
                        value = ai.wandering.scoop.v1.models.Thumbnail::url
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "width",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                        jsonName = "width",
                        value = ai.wandering.scoop.v1.models.Thumbnail::width
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "height",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                        jsonName = "height",
                        value = ai.wandering.scoop.v1.models.Thumbnail::height
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.Thumbnail",
                messageClass = ai.wandering.scoop.v1.models.Thumbnail::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class NewStory(
    val guid: String = "",
    val title: String = "",
    val url: String = "",
    val isPermalink: Boolean = false,
    val publicationDate: Long = 0L,
    val description: String = "",
    val thumbnails: List<ai.wandering.scoop.v1.models.Thumbnail> = emptyList(),
    val tagNames: List<String> = emptyList(),
    val personNames: List<String> = emptyList(),
    val companyNames: List<String> = emptyList(),
    val skillNames: List<String> = emptyList(),
    val industryNames: List<String> = emptyList(),
    val locationNames: List<String> = emptyList(),
    val rssFeedId: String = "",
    val authorName: String = "",
    val content: String? = null,
    val summary: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.NewStory = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.NewStory> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.NewStory> {
        public val defaultInstance: ai.wandering.scoop.v1.models.NewStory by lazy { ai.wandering.scoop.v1.models.NewStory() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.NewStory = ai.wandering.scoop.v1.models.NewStory.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.NewStory> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.NewStory, *>>(17)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "guid",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "guid",
                        value = ai.wandering.scoop.v1.models.NewStory::guid
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "title",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "title",
                        value = ai.wandering.scoop.v1.models.NewStory::title
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "url",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "url",
                        value = ai.wandering.scoop.v1.models.NewStory::url
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "is_permalink",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "isPermalink",
                        value = ai.wandering.scoop.v1.models.NewStory::isPermalink
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "publication_date",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "publicationDate",
                        value = ai.wandering.scoop.v1.models.NewStory::publicationDate
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "description",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "description",
                        value = ai.wandering.scoop.v1.models.NewStory::description
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "thumbnails",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Thumbnail>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Thumbnail.Companion)),
                        jsonName = "thumbnails",
                        value = ai.wandering.scoop.v1.models.NewStory::thumbnails
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tag_names",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "tagNames",
                        value = ai.wandering.scoop.v1.models.NewStory::tagNames
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "person_names",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "personNames",
                        value = ai.wandering.scoop.v1.models.NewStory::personNames
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "company_names",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "companyNames",
                        value = ai.wandering.scoop.v1.models.NewStory::companyNames
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "skill_names",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "skillNames",
                        value = ai.wandering.scoop.v1.models.NewStory::skillNames
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "industry_names",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "industryNames",
                        value = ai.wandering.scoop.v1.models.NewStory::industryNames
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "location_names",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "locationNames",
                        value = ai.wandering.scoop.v1.models.NewStory::locationNames
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "rss_feed_id",
                        number = 14,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "rssFeedId",
                        value = ai.wandering.scoop.v1.models.NewStory::rssFeedId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "author_name",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "authorName",
                        value = ai.wandering.scoop.v1.models.NewStory::authorName
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "content",
                        number = 16,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "content",
                        value = ai.wandering.scoop.v1.models.NewStory::content
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "summary",
                        number = 17,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "summary",
                        value = ai.wandering.scoop.v1.models.NewStory::summary
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.NewStory",
                messageClass = ai.wandering.scoop.v1.models.NewStory::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class RssFeed(
    val id: String = "",
    val title: String = "",
    val url: String = "",
    val isTopStories: Boolean = false,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.RssFeed = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.RssFeed> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.RssFeed> {
        public val defaultInstance: ai.wandering.scoop.v1.models.RssFeed by lazy { ai.wandering.scoop.v1.models.RssFeed() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.RssFeed = ai.wandering.scoop.v1.models.RssFeed.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.RssFeed> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.RssFeed, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = ai.wandering.scoop.v1.models.RssFeed::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "title",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "title",
                        value = ai.wandering.scoop.v1.models.RssFeed::title
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "url",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "url",
                        value = ai.wandering.scoop.v1.models.RssFeed::url
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "is_top_stories",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "isTopStories",
                        value = ai.wandering.scoop.v1.models.RssFeed::isTopStories
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.RssFeed",
                messageClass = ai.wandering.scoop.v1.models.RssFeed::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForThumbnail")
public fun Thumbnail?.orDefault(): ai.wandering.scoop.v1.models.Thumbnail = this ?: Thumbnail.defaultInstance

private fun Thumbnail.protoMergeImpl(plus: pbandk.Message?): Thumbnail = (plus as? Thumbnail)?.let {
    it.copy(
        width = plus.width ?: width,
        height = plus.height ?: height,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Thumbnail.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Thumbnail {
    var url = ""
    var width: Long? = null
    var height: Long? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> url = _fieldValue as String
            2 -> width = _fieldValue as Long
            3 -> height = _fieldValue as Long
        }
    }

    return Thumbnail(url, width, height, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForNewStory")
public fun NewStory?.orDefault(): ai.wandering.scoop.v1.models.NewStory = this ?: NewStory.defaultInstance

private fun NewStory.protoMergeImpl(plus: pbandk.Message?): NewStory = (plus as? NewStory)?.let {
    it.copy(
        thumbnails = thumbnails + plus.thumbnails,
        tagNames = tagNames + plus.tagNames,
        personNames = personNames + plus.personNames,
        companyNames = companyNames + plus.companyNames,
        skillNames = skillNames + plus.skillNames,
        industryNames = industryNames + plus.industryNames,
        locationNames = locationNames + plus.locationNames,
        content = plus.content ?: content,
        summary = plus.summary ?: summary,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun NewStory.Companion.decodeWithImpl(u: pbandk.MessageDecoder): NewStory {
    var guid = ""
    var title = ""
    var url = ""
    var isPermalink = false
    var publicationDate = 0L
    var description = ""
    var thumbnails: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Thumbnail>? = null
    var tagNames: pbandk.ListWithSize.Builder<String>? = null
    var personNames: pbandk.ListWithSize.Builder<String>? = null
    var companyNames: pbandk.ListWithSize.Builder<String>? = null
    var skillNames: pbandk.ListWithSize.Builder<String>? = null
    var industryNames: pbandk.ListWithSize.Builder<String>? = null
    var locationNames: pbandk.ListWithSize.Builder<String>? = null
    var rssFeedId = ""
    var authorName = ""
    var content: String? = null
    var summary: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> guid = _fieldValue as String
            2 -> title = _fieldValue as String
            3 -> url = _fieldValue as String
            4 -> isPermalink = _fieldValue as Boolean
            5 -> publicationDate = _fieldValue as Long
            6 -> description = _fieldValue as String
            7 -> thumbnails = (thumbnails ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Thumbnail> }
            8 -> tagNames = (tagNames ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            9 -> personNames = (personNames ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            10 -> companyNames = (companyNames ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            11 -> skillNames = (skillNames ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            12 -> industryNames = (industryNames ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            13 -> locationNames = (locationNames ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            14 -> rssFeedId = _fieldValue as String
            15 -> authorName = _fieldValue as String
            16 -> content = _fieldValue as String
            17 -> summary = _fieldValue as String
        }
    }

    return NewStory(guid, title, url, isPermalink,
        publicationDate, description, pbandk.ListWithSize.Builder.fixed(thumbnails), pbandk.ListWithSize.Builder.fixed(tagNames),
        pbandk.ListWithSize.Builder.fixed(personNames), pbandk.ListWithSize.Builder.fixed(companyNames), pbandk.ListWithSize.Builder.fixed(skillNames), pbandk.ListWithSize.Builder.fixed(industryNames),
        pbandk.ListWithSize.Builder.fixed(locationNames), rssFeedId, authorName, content,
        summary, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForRssFeed")
public fun RssFeed?.orDefault(): ai.wandering.scoop.v1.models.RssFeed = this ?: RssFeed.defaultInstance

private fun RssFeed.protoMergeImpl(plus: pbandk.Message?): RssFeed = (plus as? RssFeed)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun RssFeed.Companion.decodeWithImpl(u: pbandk.MessageDecoder): RssFeed {
    var id = ""
    var title = ""
    var url = ""
    var isTopStories = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> title = _fieldValue as String
            3 -> url = _fieldValue as String
            4 -> isTopStories = _fieldValue as Boolean
        }
    }

    return RssFeed(id, title, url, isTopStories, unknownFields)
}

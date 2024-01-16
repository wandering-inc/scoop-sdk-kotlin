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

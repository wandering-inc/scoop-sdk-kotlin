@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class FeedMetadata(
    val cursor: ai.wandering.scoop.v1.models.Cursor? = null,
    val totalCount: Int = 0,
    val isEndOfFeed: Boolean = false,
    val lastUpdated: Long = 0L,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.FeedMetadata = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.FeedMetadata> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.FeedMetadata> {
        public val defaultInstance: ai.wandering.scoop.v1.models.FeedMetadata by lazy { ai.wandering.scoop.v1.models.FeedMetadata() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.FeedMetadata = ai.wandering.scoop.v1.models.FeedMetadata.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.FeedMetadata> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.FeedMetadata, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "cursor",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Cursor.Companion),
                        jsonName = "cursor",
                        value = ai.wandering.scoop.v1.models.FeedMetadata::cursor
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "total_count",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "totalCount",
                        value = ai.wandering.scoop.v1.models.FeedMetadata::totalCount
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "is_end_of_feed",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "isEndOfFeed",
                        value = ai.wandering.scoop.v1.models.FeedMetadata::isEndOfFeed
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_updated",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "lastUpdated",
                        value = ai.wandering.scoop.v1.models.FeedMetadata::lastUpdated
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.FeedMetadata",
                messageClass = ai.wandering.scoop.v1.models.FeedMetadata::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForFeedMetadata")
public fun FeedMetadata?.orDefault(): ai.wandering.scoop.v1.models.FeedMetadata = this ?: FeedMetadata.defaultInstance

private fun FeedMetadata.protoMergeImpl(plus: pbandk.Message?): FeedMetadata = (plus as? FeedMetadata)?.let {
    it.copy(
        cursor = cursor?.plus(plus.cursor) ?: plus.cursor,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FeedMetadata.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FeedMetadata {
    var cursor: ai.wandering.scoop.v1.models.Cursor? = null
    var totalCount = 0
    var isEndOfFeed = false
    var lastUpdated = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> cursor = _fieldValue as ai.wandering.scoop.v1.models.Cursor
            2 -> totalCount = _fieldValue as Int
            3 -> isEndOfFeed = _fieldValue as Boolean
            4 -> lastUpdated = _fieldValue as Long
        }
    }

    return FeedMetadata(cursor, totalCount, isEndOfFeed, lastUpdated, unknownFields)
}

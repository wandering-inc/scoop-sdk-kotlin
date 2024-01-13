@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public sealed class CursorDirection(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?): Boolean = other is CursorDirection && other.value == value
    override fun hashCode(): Int = value.hashCode()
    override fun toString(): String = "CursorDirection.${name ?: "UNRECOGNIZED"}(value=$value)"

    public object NEWER : CursorDirection(0, "NEWER")
    public object OLDER : CursorDirection(1, "OLDER")
    public class UNRECOGNIZED(value: Int) : CursorDirection(value)

    public companion object : pbandk.Message.Enum.Companion<CursorDirection> {
        public val values: List<CursorDirection> by lazy { listOf(NEWER, OLDER) }
        override fun fromValue(value: Int): CursorDirection = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String): CursorDirection = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No CursorDirection with name: $name")
    }
}

@pbandk.Export
public data class Cursor(
    val id: String = "",
    val timestamp: Long = 0L,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.Cursor = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Cursor> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.Cursor> {
        public val defaultInstance: ai.wandering.scoop.v1.models.Cursor by lazy { ai.wandering.scoop.v1.models.Cursor() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.Cursor = ai.wandering.scoop.v1.models.Cursor.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Cursor> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.Cursor, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = ai.wandering.scoop.v1.models.Cursor::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "timestamp",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "timestamp",
                        value = ai.wandering.scoop.v1.models.Cursor::timestamp
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.Cursor",
                messageClass = ai.wandering.scoop.v1.models.Cursor::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class CursorMetadata(
    val cursor: ai.wandering.scoop.v1.models.Cursor? = null,
    val totalCount: Long = 0L,
    val isEndOfFeed: Boolean = false,
    val lastUpdated: Long = 0L,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.CursorMetadata = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.CursorMetadata> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.CursorMetadata> {
        public val defaultInstance: ai.wandering.scoop.v1.models.CursorMetadata by lazy { ai.wandering.scoop.v1.models.CursorMetadata() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.CursorMetadata = ai.wandering.scoop.v1.models.CursorMetadata.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.CursorMetadata> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.CursorMetadata, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "cursor",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Cursor.Companion),
                        jsonName = "cursor",
                        value = ai.wandering.scoop.v1.models.CursorMetadata::cursor
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "total_count",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "totalCount",
                        value = ai.wandering.scoop.v1.models.CursorMetadata::totalCount
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "is_end_of_feed",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "isEndOfFeed",
                        value = ai.wandering.scoop.v1.models.CursorMetadata::isEndOfFeed
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_updated",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "lastUpdated",
                        value = ai.wandering.scoop.v1.models.CursorMetadata::lastUpdated
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.CursorMetadata",
                messageClass = ai.wandering.scoop.v1.models.CursorMetadata::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForCursor")
public fun Cursor?.orDefault(): ai.wandering.scoop.v1.models.Cursor = this ?: Cursor.defaultInstance

private fun Cursor.protoMergeImpl(plus: pbandk.Message?): Cursor = (plus as? Cursor)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Cursor.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Cursor {
    var id = ""
    var timestamp = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> timestamp = _fieldValue as Long
        }
    }

    return Cursor(id, timestamp, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForCursorMetadata")
public fun CursorMetadata?.orDefault(): ai.wandering.scoop.v1.models.CursorMetadata = this ?: CursorMetadata.defaultInstance

private fun CursorMetadata.protoMergeImpl(plus: pbandk.Message?): CursorMetadata = (plus as? CursorMetadata)?.let {
    it.copy(
        cursor = cursor?.plus(plus.cursor) ?: plus.cursor,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun CursorMetadata.Companion.decodeWithImpl(u: pbandk.MessageDecoder): CursorMetadata {
    var cursor: ai.wandering.scoop.v1.models.Cursor? = null
    var totalCount = 0L
    var isEndOfFeed = false
    var lastUpdated = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> cursor = _fieldValue as ai.wandering.scoop.v1.models.Cursor
            2 -> totalCount = _fieldValue as Long
            3 -> isEndOfFeed = _fieldValue as Boolean
            4 -> lastUpdated = _fieldValue as Long
        }
    }

    return CursorMetadata(cursor, totalCount, isEndOfFeed, lastUpdated, unknownFields)
}

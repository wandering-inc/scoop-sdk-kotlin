@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class EditorsPick(
    val id: String = "",
    val timestamp: Long = 0L,
    val stories: List<ai.wandering.scoop.v1.models.Story> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.EditorsPick = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.EditorsPick> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.EditorsPick> {
        public val defaultInstance: ai.wandering.scoop.v1.models.EditorsPick by lazy { ai.wandering.scoop.v1.models.EditorsPick() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.EditorsPick = ai.wandering.scoop.v1.models.EditorsPick.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.EditorsPick> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.EditorsPick, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = ai.wandering.scoop.v1.models.EditorsPick::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "timestamp",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "timestamp",
                        value = ai.wandering.scoop.v1.models.EditorsPick::timestamp
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "stories",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Story>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Story.Companion)),
                        jsonName = "stories",
                        value = ai.wandering.scoop.v1.models.EditorsPick::stories
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.EditorsPick",
                messageClass = ai.wandering.scoop.v1.models.EditorsPick::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForEditorsPick")
public fun EditorsPick?.orDefault(): ai.wandering.scoop.v1.models.EditorsPick = this ?: EditorsPick.defaultInstance

private fun EditorsPick.protoMergeImpl(plus: pbandk.Message?): EditorsPick = (plus as? EditorsPick)?.let {
    it.copy(
        stories = stories + plus.stories,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EditorsPick.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EditorsPick {
    var id = ""
    var timestamp = 0L
    var stories: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Story>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> timestamp = _fieldValue as Long
            3 -> stories = (stories ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Story> }
        }
    }

    return EditorsPick(id, timestamp, pbandk.ListWithSize.Builder.fixed(stories), unknownFields)
}

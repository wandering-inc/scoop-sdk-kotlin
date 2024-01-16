@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class ForYou(
    val id: String = "",
    val timestamp: Long = 0L,
    val stories: List<ai.wandering.scoop.v1.models.Story> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.ForYou = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.ForYou> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.ForYou> {
        public val defaultInstance: ai.wandering.scoop.v1.models.ForYou by lazy { ai.wandering.scoop.v1.models.ForYou() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.ForYou = ai.wandering.scoop.v1.models.ForYou.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.ForYou> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.ForYou, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = ai.wandering.scoop.v1.models.ForYou::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "timestamp",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "timestamp",
                        value = ai.wandering.scoop.v1.models.ForYou::timestamp
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "stories",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Story>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Story.Companion)),
                        jsonName = "stories",
                        value = ai.wandering.scoop.v1.models.ForYou::stories
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.ForYou",
                messageClass = ai.wandering.scoop.v1.models.ForYou::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForForYou")
public fun ForYou?.orDefault(): ai.wandering.scoop.v1.models.ForYou = this ?: ForYou.defaultInstance

private fun ForYou.protoMergeImpl(plus: pbandk.Message?): ForYou = (plus as? ForYou)?.let {
    it.copy(
        stories = stories + plus.stories,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ForYou.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ForYou {
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

    return ForYou(id, timestamp, pbandk.ListWithSize.Builder.fixed(stories), unknownFields)
}

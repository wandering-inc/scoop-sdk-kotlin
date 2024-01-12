@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class Scoop(
    val stories: List<ai.wandering.scoop.v1.models.Story> = emptyList(),
    val title: String = "",
    val summary: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.Scoop = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Scoop> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.Scoop> {
        public val defaultInstance: ai.wandering.scoop.v1.models.Scoop by lazy { ai.wandering.scoop.v1.models.Scoop() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.Scoop = ai.wandering.scoop.v1.models.Scoop.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Scoop> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.Scoop, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "stories",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Story>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Story.Companion)),
                        jsonName = "stories",
                        value = ai.wandering.scoop.v1.models.Scoop::stories
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "title",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "title",
                        value = ai.wandering.scoop.v1.models.Scoop::title
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "summary",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "summary",
                        value = ai.wandering.scoop.v1.models.Scoop::summary
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.Scoop",
                messageClass = ai.wandering.scoop.v1.models.Scoop::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForScoop")
public fun Scoop?.orDefault(): ai.wandering.scoop.v1.models.Scoop = this ?: Scoop.defaultInstance

private fun Scoop.protoMergeImpl(plus: pbandk.Message?): Scoop = (plus as? Scoop)?.let {
    it.copy(
        stories = stories + plus.stories,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Scoop.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Scoop {
    var stories: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Story>? = null
    var title = ""
    var summary = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> stories = (stories ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Story> }
            2 -> title = _fieldValue as String
            3 -> summary = _fieldValue as String
        }
    }

    return Scoop(pbandk.ListWithSize.Builder.fixed(stories), title, summary, unknownFields)
}

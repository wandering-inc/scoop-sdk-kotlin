@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class Category(
    val id: String = "",
    val timestamp: Long = 0L,
    val scoop: ai.wandering.scoop.v1.models.Scoop? = null,
    val tag: ai.wandering.scoop.v1.models.Tag? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.Category = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Category> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.Category> {
        public val defaultInstance: ai.wandering.scoop.v1.models.Category by lazy { ai.wandering.scoop.v1.models.Category() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.Category = ai.wandering.scoop.v1.models.Category.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Category> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.Category, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = ai.wandering.scoop.v1.models.Category::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "timestamp",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "timestamp",
                        value = ai.wandering.scoop.v1.models.Category::timestamp
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "scoop",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Scoop.Companion),
                        jsonName = "scoop",
                        value = ai.wandering.scoop.v1.models.Category::scoop
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tag",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Tag.Companion),
                        jsonName = "tag",
                        value = ai.wandering.scoop.v1.models.Category::tag
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.Category",
                messageClass = ai.wandering.scoop.v1.models.Category::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForCategory")
public fun Category?.orDefault(): ai.wandering.scoop.v1.models.Category = this ?: Category.defaultInstance

private fun Category.protoMergeImpl(plus: pbandk.Message?): Category = (plus as? Category)?.let {
    it.copy(
        scoop = scoop?.plus(plus.scoop) ?: plus.scoop,
        tag = tag?.plus(plus.tag) ?: plus.tag,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Category.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Category {
    var id = ""
    var timestamp = 0L
    var scoop: ai.wandering.scoop.v1.models.Scoop? = null
    var tag: ai.wandering.scoop.v1.models.Tag? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> timestamp = _fieldValue as Long
            3 -> scoop = _fieldValue as ai.wandering.scoop.v1.models.Scoop
            4 -> tag = _fieldValue as ai.wandering.scoop.v1.models.Tag
        }
    }

    return Category(id, timestamp, scoop, tag, unknownFields)
}

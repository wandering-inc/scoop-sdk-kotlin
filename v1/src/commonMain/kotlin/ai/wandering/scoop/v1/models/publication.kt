@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class Publication(
    val id: String = "",
    val title: String = "",
    val logoUrl: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.Publication = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Publication> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.Publication> {
        public val defaultInstance: ai.wandering.scoop.v1.models.Publication by lazy { ai.wandering.scoop.v1.models.Publication() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.Publication = ai.wandering.scoop.v1.models.Publication.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Publication> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.Publication, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = ai.wandering.scoop.v1.models.Publication::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "title",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "title",
                        value = ai.wandering.scoop.v1.models.Publication::title
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "logo_url",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "logoUrl",
                        value = ai.wandering.scoop.v1.models.Publication::logoUrl
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.Publication",
                messageClass = ai.wandering.scoop.v1.models.Publication::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForPublication")
public fun Publication?.orDefault(): ai.wandering.scoop.v1.models.Publication = this ?: Publication.defaultInstance

private fun Publication.protoMergeImpl(plus: pbandk.Message?): Publication = (plus as? Publication)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Publication.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Publication {
    var id = ""
    var title = ""
    var logoUrl = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> title = _fieldValue as String
            3 -> logoUrl = _fieldValue as String
        }
    }

    return Publication(id, title, logoUrl, unknownFields)
}

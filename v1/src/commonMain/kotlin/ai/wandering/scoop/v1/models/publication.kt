@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class Publication(
    val id: String = "",
    val title: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.Publication = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Publication> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.Publication> {
        public val defaultInstance: ai.wandering.scoop.v1.models.Publication by lazy { ai.wandering.scoop.v1.models.Publication() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.Publication = ai.wandering.scoop.v1.models.Publication.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Publication> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.Publication, *>>(2)
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
public data class GetPublicationsArgs(
    val count: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.GetPublicationsArgs = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetPublicationsArgs> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.GetPublicationsArgs> {
        public val defaultInstance: ai.wandering.scoop.v1.models.GetPublicationsArgs by lazy { ai.wandering.scoop.v1.models.GetPublicationsArgs() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.GetPublicationsArgs = ai.wandering.scoop.v1.models.GetPublicationsArgs.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetPublicationsArgs> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.GetPublicationsArgs, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "count",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "count",
                        value = ai.wandering.scoop.v1.models.GetPublicationsArgs::count
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.GetPublicationsArgs",
                messageClass = ai.wandering.scoop.v1.models.GetPublicationsArgs::class,
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

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> title = _fieldValue as String
        }
    }

    return Publication(id, title, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetPublicationsArgs")
public fun GetPublicationsArgs?.orDefault(): ai.wandering.scoop.v1.models.GetPublicationsArgs = this ?: GetPublicationsArgs.defaultInstance

private fun GetPublicationsArgs.protoMergeImpl(plus: pbandk.Message?): GetPublicationsArgs = (plus as? GetPublicationsArgs)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetPublicationsArgs.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetPublicationsArgs {
    var count = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> count = _fieldValue as Int
        }
    }

    return GetPublicationsArgs(count, unknownFields)
}

@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class Local(
    val id: String = "",
    val timestamp: Long = 0L,
    val scoop: ai.wandering.scoop.v1.models.Scoop? = null,
    val location: ai.wandering.scoop.v1.models.Location? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.Local = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Local> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.Local> {
        public val defaultInstance: ai.wandering.scoop.v1.models.Local by lazy { ai.wandering.scoop.v1.models.Local() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.Local = ai.wandering.scoop.v1.models.Local.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Local> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.Local, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = ai.wandering.scoop.v1.models.Local::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "timestamp",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "timestamp",
                        value = ai.wandering.scoop.v1.models.Local::timestamp
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "scoop",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Scoop.Companion),
                        jsonName = "scoop",
                        value = ai.wandering.scoop.v1.models.Local::scoop
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "location",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Location.Companion),
                        jsonName = "location",
                        value = ai.wandering.scoop.v1.models.Local::location
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.Local",
                messageClass = ai.wandering.scoop.v1.models.Local::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForLocal")
public fun Local?.orDefault(): ai.wandering.scoop.v1.models.Local = this ?: Local.defaultInstance

private fun Local.protoMergeImpl(plus: pbandk.Message?): Local = (plus as? Local)?.let {
    it.copy(
        scoop = scoop?.plus(plus.scoop) ?: plus.scoop,
        location = location?.plus(plus.location) ?: plus.location,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Local.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Local {
    var id = ""
    var timestamp = 0L
    var scoop: ai.wandering.scoop.v1.models.Scoop? = null
    var location: ai.wandering.scoop.v1.models.Location? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> timestamp = _fieldValue as Long
            3 -> scoop = _fieldValue as ai.wandering.scoop.v1.models.Scoop
            4 -> location = _fieldValue as ai.wandering.scoop.v1.models.Location
        }
    }

    return Local(id, timestamp, scoop, location, unknownFields)
}

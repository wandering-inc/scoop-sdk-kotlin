@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class World(
    val id: String = "",
    val timestamp: Long = 0L,
    val scoop: ai.wandering.scoop.v1.models.Scoop? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.World = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.World> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.World> {
        public val defaultInstance: ai.wandering.scoop.v1.models.World by lazy { ai.wandering.scoop.v1.models.World() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.World = ai.wandering.scoop.v1.models.World.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.World> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.World, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = ai.wandering.scoop.v1.models.World::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "timestamp",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "timestamp",
                        value = ai.wandering.scoop.v1.models.World::timestamp
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "scoop",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Scoop.Companion),
                        jsonName = "scoop",
                        value = ai.wandering.scoop.v1.models.World::scoop
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.World",
                messageClass = ai.wandering.scoop.v1.models.World::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForWorld")
public fun World?.orDefault(): ai.wandering.scoop.v1.models.World = this ?: World.defaultInstance

private fun World.protoMergeImpl(plus: pbandk.Message?): World = (plus as? World)?.let {
    it.copy(
        scoop = scoop?.plus(plus.scoop) ?: plus.scoop,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun World.Companion.decodeWithImpl(u: pbandk.MessageDecoder): World {
    var id = ""
    var timestamp = 0L
    var scoop: ai.wandering.scoop.v1.models.Scoop? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> timestamp = _fieldValue as Long
            3 -> scoop = _fieldValue as ai.wandering.scoop.v1.models.Scoop
        }
    }

    return World(id, timestamp, scoop, unknownFields)
}

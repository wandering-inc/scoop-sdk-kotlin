@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class TopStories(
    val type: Type<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    public sealed class Type<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class World(world: ai.wandering.scoop.v1.models.World) : Type<ai.wandering.scoop.v1.models.World>(world)
        public class Us(us: ai.wandering.scoop.v1.models.US) : Type<ai.wandering.scoop.v1.models.US>(us)
        public class Category(category: ai.wandering.scoop.v1.models.Category) : Type<ai.wandering.scoop.v1.models.Category>(category)
        public class Local(local: ai.wandering.scoop.v1.models.Local) : Type<ai.wandering.scoop.v1.models.Local>(local)
    }

    val world: ai.wandering.scoop.v1.models.World?
        get() = (type as? Type.World)?.value
    val us: ai.wandering.scoop.v1.models.US?
        get() = (type as? Type.Us)?.value
    val category: ai.wandering.scoop.v1.models.Category?
        get() = (type as? Type.Category)?.value
    val local: ai.wandering.scoop.v1.models.Local?
        get() = (type as? Type.Local)?.value

    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.TopStories = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.TopStories> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.TopStories> {
        public val defaultInstance: ai.wandering.scoop.v1.models.TopStories by lazy { ai.wandering.scoop.v1.models.TopStories() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.TopStories = ai.wandering.scoop.v1.models.TopStories.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.TopStories> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.TopStories, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "world",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.World.Companion),
                        oneofMember = true,
                        jsonName = "world",
                        value = ai.wandering.scoop.v1.models.TopStories::world
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "us",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.US.Companion),
                        oneofMember = true,
                        jsonName = "us",
                        value = ai.wandering.scoop.v1.models.TopStories::us
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "category",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Category.Companion),
                        oneofMember = true,
                        jsonName = "category",
                        value = ai.wandering.scoop.v1.models.TopStories::category
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "local",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Local.Companion),
                        oneofMember = true,
                        jsonName = "local",
                        value = ai.wandering.scoop.v1.models.TopStories::local
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.TopStories",
                messageClass = ai.wandering.scoop.v1.models.TopStories::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForTopStories")
public fun TopStories?.orDefault(): ai.wandering.scoop.v1.models.TopStories = this ?: TopStories.defaultInstance

private fun TopStories.protoMergeImpl(plus: pbandk.Message?): TopStories = (plus as? TopStories)?.let {
    it.copy(
        type = when {
            type is TopStories.Type.World && plus.type is TopStories.Type.World ->
                TopStories.Type.World(type.value + plus.type.value)
            type is TopStories.Type.Us && plus.type is TopStories.Type.Us ->
                TopStories.Type.Us(type.value + plus.type.value)
            type is TopStories.Type.Category && plus.type is TopStories.Type.Category ->
                TopStories.Type.Category(type.value + plus.type.value)
            type is TopStories.Type.Local && plus.type is TopStories.Type.Local ->
                TopStories.Type.Local(type.value + plus.type.value)
            else ->
                plus.type ?: type
        },
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TopStories.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TopStories {
    var type: TopStories.Type<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> type = TopStories.Type.World(_fieldValue as ai.wandering.scoop.v1.models.World)
            2 -> type = TopStories.Type.Us(_fieldValue as ai.wandering.scoop.v1.models.US)
            3 -> type = TopStories.Type.Category(_fieldValue as ai.wandering.scoop.v1.models.Category)
            4 -> type = TopStories.Type.Local(_fieldValue as ai.wandering.scoop.v1.models.Local)
        }
    }

    return TopStories(type, unknownFields)
}

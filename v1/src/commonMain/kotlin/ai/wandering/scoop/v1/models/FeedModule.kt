@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class FeedModule(
    val type: Type<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    public sealed class Type<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class TopStories(topStories: ai.wandering.scoop.v1.models.TopStories) : Type<ai.wandering.scoop.v1.models.TopStories>(topStories)
        public class EditorsPick(editorsPick: ai.wandering.scoop.v1.models.EditorsPick) : Type<ai.wandering.scoop.v1.models.EditorsPick>(editorsPick)
        public class ForYou(forYou: ai.wandering.scoop.v1.models.ForYou) : Type<ai.wandering.scoop.v1.models.ForYou>(forYou)
    }

    val topStories: ai.wandering.scoop.v1.models.TopStories?
        get() = (type as? Type.TopStories)?.value
    val editorsPick: ai.wandering.scoop.v1.models.EditorsPick?
        get() = (type as? Type.EditorsPick)?.value
    val forYou: ai.wandering.scoop.v1.models.ForYou?
        get() = (type as? Type.ForYou)?.value

    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.FeedModule = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.FeedModule> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.FeedModule> {
        public val defaultInstance: ai.wandering.scoop.v1.models.FeedModule by lazy { ai.wandering.scoop.v1.models.FeedModule() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.FeedModule = ai.wandering.scoop.v1.models.FeedModule.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.FeedModule> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.FeedModule, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "top_stories",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.TopStories.Companion),
                        oneofMember = true,
                        jsonName = "topStories",
                        value = ai.wandering.scoop.v1.models.FeedModule::topStories
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "editors_pick",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.EditorsPick.Companion),
                        oneofMember = true,
                        jsonName = "editorsPick",
                        value = ai.wandering.scoop.v1.models.FeedModule::editorsPick
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "for_you",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.ForYou.Companion),
                        oneofMember = true,
                        jsonName = "forYou",
                        value = ai.wandering.scoop.v1.models.FeedModule::forYou
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.FeedModule",
                messageClass = ai.wandering.scoop.v1.models.FeedModule::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForFeedModule")
public fun FeedModule?.orDefault(): ai.wandering.scoop.v1.models.FeedModule = this ?: FeedModule.defaultInstance

private fun FeedModule.protoMergeImpl(plus: pbandk.Message?): FeedModule = (plus as? FeedModule)?.let {
    it.copy(
        type = when {
            type is FeedModule.Type.TopStories && plus.type is FeedModule.Type.TopStories ->
                FeedModule.Type.TopStories(type.value + plus.type.value)
            type is FeedModule.Type.EditorsPick && plus.type is FeedModule.Type.EditorsPick ->
                FeedModule.Type.EditorsPick(type.value + plus.type.value)
            type is FeedModule.Type.ForYou && plus.type is FeedModule.Type.ForYou ->
                FeedModule.Type.ForYou(type.value + plus.type.value)
            else ->
                plus.type ?: type
        },
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FeedModule.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FeedModule {
    var type: FeedModule.Type<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> type = FeedModule.Type.TopStories(_fieldValue as ai.wandering.scoop.v1.models.TopStories)
            2 -> type = FeedModule.Type.EditorsPick(_fieldValue as ai.wandering.scoop.v1.models.EditorsPick)
            3 -> type = FeedModule.Type.ForYou(_fieldValue as ai.wandering.scoop.v1.models.ForYou)
        }
    }

    return FeedModule(type, unknownFields)
}

@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class FeedMetadata(
    val cursor: ai.wandering.scoop.v1.models.Cursor? = null,
    val totalCount: Int = 0,
    val isEndOfFeed: Boolean = false,
    val lastUpdated: Long = 0L,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.FeedMetadata = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.FeedMetadata> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.FeedMetadata> {
        public val defaultInstance: ai.wandering.scoop.v1.models.FeedMetadata by lazy { ai.wandering.scoop.v1.models.FeedMetadata() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.FeedMetadata = ai.wandering.scoop.v1.models.FeedMetadata.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.FeedMetadata> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.FeedMetadata, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "cursor",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Cursor.Companion),
                        jsonName = "cursor",
                        value = ai.wandering.scoop.v1.models.FeedMetadata::cursor
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "total_count",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "totalCount",
                        value = ai.wandering.scoop.v1.models.FeedMetadata::totalCount
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "is_end_of_feed",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "isEndOfFeed",
                        value = ai.wandering.scoop.v1.models.FeedMetadata::isEndOfFeed
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "last_updated",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "lastUpdated",
                        value = ai.wandering.scoop.v1.models.FeedMetadata::lastUpdated
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.FeedMetadata",
                messageClass = ai.wandering.scoop.v1.models.FeedMetadata::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

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
public data class TopStories(
    val type: Type<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    public sealed class Type<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class Global(global: ai.wandering.scoop.v1.models.Global) : Type<ai.wandering.scoop.v1.models.Global>(global)
        public class Us(us: ai.wandering.scoop.v1.models.US) : Type<ai.wandering.scoop.v1.models.US>(us)
        public class Category(category: ai.wandering.scoop.v1.models.Category) : Type<ai.wandering.scoop.v1.models.Category>(category)
        public class Local(local: ai.wandering.scoop.v1.models.Local) : Type<ai.wandering.scoop.v1.models.Local>(local)
    }

    val global: ai.wandering.scoop.v1.models.Global?
        get() = (type as? Type.Global)?.value
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
                        name = "global",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Global.Companion),
                        oneofMember = true,
                        jsonName = "global",
                        value = ai.wandering.scoop.v1.models.TopStories::global
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
public data class Global(
    val id: String = "",
    val timestamp: Long = 0L,
    val scoop: ai.wandering.scoop.v1.models.Scoop? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.Global = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Global> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.Global> {
        public val defaultInstance: ai.wandering.scoop.v1.models.Global by lazy { ai.wandering.scoop.v1.models.Global() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.Global = ai.wandering.scoop.v1.models.Global.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Global> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.Global, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = ai.wandering.scoop.v1.models.Global::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "timestamp",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "timestamp",
                        value = ai.wandering.scoop.v1.models.Global::timestamp
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "scoop",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Scoop.Companion),
                        jsonName = "scoop",
                        value = ai.wandering.scoop.v1.models.Global::scoop
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.Global",
                messageClass = ai.wandering.scoop.v1.models.Global::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class US(
    val id: String = "",
    val timestamp: Long = 0L,
    val scoop: ai.wandering.scoop.v1.models.Scoop? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.US = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.US> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.US> {
        public val defaultInstance: ai.wandering.scoop.v1.models.US by lazy { ai.wandering.scoop.v1.models.US() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.US = ai.wandering.scoop.v1.models.US.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.US> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.US, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = ai.wandering.scoop.v1.models.US::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "timestamp",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "timestamp",
                        value = ai.wandering.scoop.v1.models.US::timestamp
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "scoop",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Scoop.Companion),
                        jsonName = "scoop",
                        value = ai.wandering.scoop.v1.models.US::scoop
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.US",
                messageClass = ai.wandering.scoop.v1.models.US::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

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
public data class Feed(
    val modules: List<ai.wandering.scoop.v1.models.FeedModule> = emptyList(),
    val metadata: ai.wandering.scoop.v1.models.FeedMetadata? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.Feed = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Feed> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.Feed> {
        public val defaultInstance: ai.wandering.scoop.v1.models.Feed by lazy { ai.wandering.scoop.v1.models.Feed() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.Feed = ai.wandering.scoop.v1.models.Feed.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Feed> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.Feed, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "modules",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.FeedModule>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.FeedModule.Companion)),
                        jsonName = "modules",
                        value = ai.wandering.scoop.v1.models.Feed::modules
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "metadata",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.FeedMetadata.Companion),
                        jsonName = "metadata",
                        value = ai.wandering.scoop.v1.models.Feed::metadata
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.Feed",
                messageClass = ai.wandering.scoop.v1.models.Feed::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class GetFeedArgs(
    val count: Int = 0,
    val direction: ai.wandering.scoop.v1.models.CursorDirection = ai.wandering.scoop.v1.models.CursorDirection.fromValue(0),
    val cursor: ai.wandering.scoop.v1.models.Cursor? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.GetFeedArgs = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetFeedArgs> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.GetFeedArgs> {
        public val defaultInstance: ai.wandering.scoop.v1.models.GetFeedArgs by lazy { ai.wandering.scoop.v1.models.GetFeedArgs() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.GetFeedArgs = ai.wandering.scoop.v1.models.GetFeedArgs.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetFeedArgs> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.GetFeedArgs, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "count",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "count",
                        value = ai.wandering.scoop.v1.models.GetFeedArgs::count
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "direction",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = ai.wandering.scoop.v1.models.CursorDirection.Companion),
                        jsonName = "direction",
                        value = ai.wandering.scoop.v1.models.GetFeedArgs::direction
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "cursor",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Cursor.Companion),
                        jsonName = "cursor",
                        value = ai.wandering.scoop.v1.models.GetFeedArgs::cursor
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.GetFeedArgs",
                messageClass = ai.wandering.scoop.v1.models.GetFeedArgs::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForFeedMetadata")
public fun FeedMetadata?.orDefault(): ai.wandering.scoop.v1.models.FeedMetadata = this ?: FeedMetadata.defaultInstance

private fun FeedMetadata.protoMergeImpl(plus: pbandk.Message?): FeedMetadata = (plus as? FeedMetadata)?.let {
    it.copy(
        cursor = cursor?.plus(plus.cursor) ?: plus.cursor,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FeedMetadata.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FeedMetadata {
    var cursor: ai.wandering.scoop.v1.models.Cursor? = null
    var totalCount = 0
    var isEndOfFeed = false
    var lastUpdated = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> cursor = _fieldValue as ai.wandering.scoop.v1.models.Cursor
            2 -> totalCount = _fieldValue as Int
            3 -> isEndOfFeed = _fieldValue as Boolean
            4 -> lastUpdated = _fieldValue as Long
        }
    }

    return FeedMetadata(cursor, totalCount, isEndOfFeed, lastUpdated, unknownFields)
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

@pbandk.Export
@pbandk.JsName("orDefaultForTopStories")
public fun TopStories?.orDefault(): ai.wandering.scoop.v1.models.TopStories = this ?: TopStories.defaultInstance

private fun TopStories.protoMergeImpl(plus: pbandk.Message?): TopStories = (plus as? TopStories)?.let {
    it.copy(
        type = when {
            type is TopStories.Type.Global && plus.type is TopStories.Type.Global ->
                TopStories.Type.Global(type.value + plus.type.value)
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
            1 -> type = TopStories.Type.Global(_fieldValue as ai.wandering.scoop.v1.models.Global)
            2 -> type = TopStories.Type.Us(_fieldValue as ai.wandering.scoop.v1.models.US)
            3 -> type = TopStories.Type.Category(_fieldValue as ai.wandering.scoop.v1.models.Category)
            4 -> type = TopStories.Type.Local(_fieldValue as ai.wandering.scoop.v1.models.Local)
        }
    }

    return TopStories(type, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGlobal")
public fun Global?.orDefault(): ai.wandering.scoop.v1.models.Global = this ?: Global.defaultInstance

private fun Global.protoMergeImpl(plus: pbandk.Message?): Global = (plus as? Global)?.let {
    it.copy(
        scoop = scoop?.plus(plus.scoop) ?: plus.scoop,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Global.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Global {
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

    return Global(id, timestamp, scoop, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForUS")
public fun US?.orDefault(): ai.wandering.scoop.v1.models.US = this ?: US.defaultInstance

private fun US.protoMergeImpl(plus: pbandk.Message?): US = (plus as? US)?.let {
    it.copy(
        scoop = scoop?.plus(plus.scoop) ?: plus.scoop,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun US.Companion.decodeWithImpl(u: pbandk.MessageDecoder): US {
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

    return US(id, timestamp, scoop, unknownFields)
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

@pbandk.Export
@pbandk.JsName("orDefaultForFeed")
public fun Feed?.orDefault(): ai.wandering.scoop.v1.models.Feed = this ?: Feed.defaultInstance

private fun Feed.protoMergeImpl(plus: pbandk.Message?): Feed = (plus as? Feed)?.let {
    it.copy(
        modules = modules + plus.modules,
        metadata = metadata?.plus(plus.metadata) ?: plus.metadata,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Feed.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Feed {
    var modules: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.FeedModule>? = null
    var metadata: ai.wandering.scoop.v1.models.FeedMetadata? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> modules = (modules ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.FeedModule> }
            2 -> metadata = _fieldValue as ai.wandering.scoop.v1.models.FeedMetadata
        }
    }

    return Feed(pbandk.ListWithSize.Builder.fixed(modules), metadata, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetFeedArgs")
public fun GetFeedArgs?.orDefault(): ai.wandering.scoop.v1.models.GetFeedArgs = this ?: GetFeedArgs.defaultInstance

private fun GetFeedArgs.protoMergeImpl(plus: pbandk.Message?): GetFeedArgs = (plus as? GetFeedArgs)?.let {
    it.copy(
        cursor = cursor?.plus(plus.cursor) ?: plus.cursor,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetFeedArgs.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetFeedArgs {
    var count = 0
    var direction: ai.wandering.scoop.v1.models.CursorDirection = ai.wandering.scoop.v1.models.CursorDirection.fromValue(0)
    var cursor: ai.wandering.scoop.v1.models.Cursor? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> count = _fieldValue as Int
            2 -> direction = _fieldValue as ai.wandering.scoop.v1.models.CursorDirection
            3 -> cursor = _fieldValue as ai.wandering.scoop.v1.models.Cursor
        }
    }

    return GetFeedArgs(count, direction, cursor, unknownFields)
}

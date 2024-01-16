@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class StoryAssocs(
    val tags: List<ai.wandering.scoop.v1.models.Tag> = emptyList(),
    val people: List<ai.wandering.scoop.v1.models.Person> = emptyList(),
    val companies: List<ai.wandering.scoop.v1.models.Company> = emptyList(),
    val industries: List<ai.wandering.scoop.v1.models.Industry> = emptyList(),
    val skills: List<ai.wandering.scoop.v1.models.Skill> = emptyList(),
    val locations: List<ai.wandering.scoop.v1.models.Location> = emptyList(),
    val author: ai.wandering.scoop.v1.models.Author? = null,
    val publication: ai.wandering.scoop.v1.models.Publication? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.StoryAssocs = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.StoryAssocs> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.StoryAssocs> {
        public val defaultInstance: ai.wandering.scoop.v1.models.StoryAssocs by lazy { ai.wandering.scoop.v1.models.StoryAssocs() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.StoryAssocs = ai.wandering.scoop.v1.models.StoryAssocs.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.StoryAssocs> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.StoryAssocs, *>>(8)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tags",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Tag>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Tag.Companion)),
                        jsonName = "tags",
                        value = ai.wandering.scoop.v1.models.StoryAssocs::tags
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "people",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Person>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Person.Companion)),
                        jsonName = "people",
                        value = ai.wandering.scoop.v1.models.StoryAssocs::people
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "companies",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Company>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Company.Companion)),
                        jsonName = "companies",
                        value = ai.wandering.scoop.v1.models.StoryAssocs::companies
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "industries",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Industry>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Industry.Companion)),
                        jsonName = "industries",
                        value = ai.wandering.scoop.v1.models.StoryAssocs::industries
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "skills",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Skill>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Skill.Companion)),
                        jsonName = "skills",
                        value = ai.wandering.scoop.v1.models.StoryAssocs::skills
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "locations",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Location>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Location.Companion)),
                        jsonName = "locations",
                        value = ai.wandering.scoop.v1.models.StoryAssocs::locations
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "author",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Author.Companion),
                        jsonName = "author",
                        value = ai.wandering.scoop.v1.models.StoryAssocs::author
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "publication",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Publication.Companion),
                        jsonName = "publication",
                        value = ai.wandering.scoop.v1.models.StoryAssocs::publication
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.StoryAssocs",
                messageClass = ai.wandering.scoop.v1.models.StoryAssocs::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class PopulatedStory(
    val story: ai.wandering.scoop.v1.models.Story? = null,
    val assocs: ai.wandering.scoop.v1.models.StoryAssocs? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.PopulatedStory = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.PopulatedStory> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.PopulatedStory> {
        public val defaultInstance: ai.wandering.scoop.v1.models.PopulatedStory by lazy { ai.wandering.scoop.v1.models.PopulatedStory() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.PopulatedStory = ai.wandering.scoop.v1.models.PopulatedStory.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.PopulatedStory> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.PopulatedStory, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "story",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Story.Companion),
                        jsonName = "story",
                        value = ai.wandering.scoop.v1.models.PopulatedStory::story
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "assocs",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.StoryAssocs.Companion),
                        jsonName = "assocs",
                        value = ai.wandering.scoop.v1.models.PopulatedStory::assocs
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.PopulatedStory",
                messageClass = ai.wandering.scoop.v1.models.PopulatedStory::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForStoryAssocs")
public fun StoryAssocs?.orDefault(): ai.wandering.scoop.v1.models.StoryAssocs = this ?: StoryAssocs.defaultInstance

private fun StoryAssocs.protoMergeImpl(plus: pbandk.Message?): StoryAssocs = (plus as? StoryAssocs)?.let {
    it.copy(
        tags = tags + plus.tags,
        people = people + plus.people,
        companies = companies + plus.companies,
        industries = industries + plus.industries,
        skills = skills + plus.skills,
        locations = locations + plus.locations,
        author = author?.plus(plus.author) ?: plus.author,
        publication = publication?.plus(plus.publication) ?: plus.publication,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun StoryAssocs.Companion.decodeWithImpl(u: pbandk.MessageDecoder): StoryAssocs {
    var tags: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Tag>? = null
    var people: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Person>? = null
    var companies: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Company>? = null
    var industries: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Industry>? = null
    var skills: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Skill>? = null
    var locations: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Location>? = null
    var author: ai.wandering.scoop.v1.models.Author? = null
    var publication: ai.wandering.scoop.v1.models.Publication? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> tags = (tags ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Tag> }
            2 -> people = (people ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Person> }
            3 -> companies = (companies ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Company> }
            4 -> industries = (industries ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Industry> }
            5 -> skills = (skills ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Skill> }
            6 -> locations = (locations ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Location> }
            7 -> author = _fieldValue as ai.wandering.scoop.v1.models.Author
            8 -> publication = _fieldValue as ai.wandering.scoop.v1.models.Publication
        }
    }

    return StoryAssocs(pbandk.ListWithSize.Builder.fixed(tags), pbandk.ListWithSize.Builder.fixed(people), pbandk.ListWithSize.Builder.fixed(companies), pbandk.ListWithSize.Builder.fixed(industries),
        pbandk.ListWithSize.Builder.fixed(skills), pbandk.ListWithSize.Builder.fixed(locations), author, publication, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPopulatedStory")
public fun PopulatedStory?.orDefault(): ai.wandering.scoop.v1.models.PopulatedStory = this ?: PopulatedStory.defaultInstance

private fun PopulatedStory.protoMergeImpl(plus: pbandk.Message?): PopulatedStory = (plus as? PopulatedStory)?.let {
    it.copy(
        story = story?.plus(plus.story) ?: plus.story,
        assocs = assocs?.plus(plus.assocs) ?: plus.assocs,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PopulatedStory.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PopulatedStory {
    var story: ai.wandering.scoop.v1.models.Story? = null
    var assocs: ai.wandering.scoop.v1.models.StoryAssocs? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> story = _fieldValue as ai.wandering.scoop.v1.models.Story
            2 -> assocs = _fieldValue as ai.wandering.scoop.v1.models.StoryAssocs
        }
    }

    return PopulatedStory(story, assocs, unknownFields)
}

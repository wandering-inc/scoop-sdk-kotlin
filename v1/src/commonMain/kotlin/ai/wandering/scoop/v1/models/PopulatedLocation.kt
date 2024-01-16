@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class LocationAssocs(
    val stories: List<ai.wandering.scoop.v1.models.Story> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.LocationAssocs = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.LocationAssocs> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.LocationAssocs> {
        public val defaultInstance: ai.wandering.scoop.v1.models.LocationAssocs by lazy { ai.wandering.scoop.v1.models.LocationAssocs() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.LocationAssocs = ai.wandering.scoop.v1.models.LocationAssocs.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.LocationAssocs> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.LocationAssocs, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "stories",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Story>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Story.Companion)),
                        jsonName = "stories",
                        value = ai.wandering.scoop.v1.models.LocationAssocs::stories
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.LocationAssocs",
                messageClass = ai.wandering.scoop.v1.models.LocationAssocs::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class PopulatedLocation(
    val location: ai.wandering.scoop.v1.models.Location? = null,
    val assocs: ai.wandering.scoop.v1.models.LocationAssocs? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.PopulatedLocation = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.PopulatedLocation> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.PopulatedLocation> {
        public val defaultInstance: ai.wandering.scoop.v1.models.PopulatedLocation by lazy { ai.wandering.scoop.v1.models.PopulatedLocation() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.PopulatedLocation = ai.wandering.scoop.v1.models.PopulatedLocation.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.PopulatedLocation> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.PopulatedLocation, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "location",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Location.Companion),
                        jsonName = "location",
                        value = ai.wandering.scoop.v1.models.PopulatedLocation::location
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "assocs",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.LocationAssocs.Companion),
                        jsonName = "assocs",
                        value = ai.wandering.scoop.v1.models.PopulatedLocation::assocs
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.PopulatedLocation",
                messageClass = ai.wandering.scoop.v1.models.PopulatedLocation::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForLocationAssocs")
public fun LocationAssocs?.orDefault(): ai.wandering.scoop.v1.models.LocationAssocs = this ?: LocationAssocs.defaultInstance

private fun LocationAssocs.protoMergeImpl(plus: pbandk.Message?): LocationAssocs = (plus as? LocationAssocs)?.let {
    it.copy(
        stories = stories + plus.stories,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun LocationAssocs.Companion.decodeWithImpl(u: pbandk.MessageDecoder): LocationAssocs {
    var stories: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Story>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> stories = (stories ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Story> }
        }
    }

    return LocationAssocs(pbandk.ListWithSize.Builder.fixed(stories), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForPopulatedLocation")
public fun PopulatedLocation?.orDefault(): ai.wandering.scoop.v1.models.PopulatedLocation = this ?: PopulatedLocation.defaultInstance

private fun PopulatedLocation.protoMergeImpl(plus: pbandk.Message?): PopulatedLocation = (plus as? PopulatedLocation)?.let {
    it.copy(
        location = location?.plus(plus.location) ?: plus.location,
        assocs = assocs?.plus(plus.assocs) ?: plus.assocs,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PopulatedLocation.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PopulatedLocation {
    var location: ai.wandering.scoop.v1.models.Location? = null
    var assocs: ai.wandering.scoop.v1.models.LocationAssocs? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> location = _fieldValue as ai.wandering.scoop.v1.models.Location
            2 -> assocs = _fieldValue as ai.wandering.scoop.v1.models.LocationAssocs
        }
    }

    return PopulatedLocation(location, assocs, unknownFields)
}

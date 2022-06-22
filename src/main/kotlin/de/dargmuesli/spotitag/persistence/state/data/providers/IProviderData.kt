package de.dargmuesli.spotitag.persistence.state.data.providers

interface IProviderData<TrackType> {
    var trackData: Map<String, TrackType>?
}
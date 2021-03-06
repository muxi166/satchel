package cafe.adriel.satchel

sealed class SatchelEvent {

    data class Set(val key: String) : SatchelEvent()

    data class Remove(val key: String) : SatchelEvent()

    object Clear : SatchelEvent()
}

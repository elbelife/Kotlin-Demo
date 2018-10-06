package demo2

interface Factory<out T> {
    fun produce():T
}
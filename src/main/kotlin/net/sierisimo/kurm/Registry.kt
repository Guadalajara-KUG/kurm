package net.sierisimo.kurm

interface Registry {
    fun getAtPosition(position: Int): Int

    fun setAtPosition(position: Int, value: Int)
}
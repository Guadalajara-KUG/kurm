package net.sierisimo.kurm.operations

import org.junit.jupiter.api.Test

internal class OperationsTest {
    /**
     * The registry should be able of just set the value in any position.
     * This is a good example for spyes.
     */
    @Test
    fun `zero function should set a 0 in position X`() {
        zero(registry, x)

        //validate that position 2 has a value of zero
    }

    /**
     * In a strict way, increment could not operate on a registry without a previous value.
     * So this test needs a mock of the registry with previously set values.
     */
    @Test
    fun `increment function should add 1 to position X`() {
        increment(registry, x)

        //validate that position 2 has a value of 1
    }

    @Test
    fun `swap function should swap values in positions X, Y`() {
        swap(registry, x, y)

        //Validate a successful swap
    }

    @Test
    fun `jump function should call instruction "i" when X and Y have the same value`() {
        jump(instructionSet, registry, x, y, i)

        //validate calls on instructionSet, probably a goToInstruction()
    }

    @Test
    fun `jump function should call next instruction when X and Y have different values`() {
        jump(instructionSet, registry, x, y, i)

        //validate calls on instructionSet, probably a nextInstruction()
    }
}
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ReturnTextKtTest {

    @Test
    fun returnTextTest() {
        assertEquals("yest", returnText("yest"))
    }
}
package Lab;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class StringManagerTest {
    @Test
    void remove() {
        String text = "I live in the Lviv";
        Assert.assertEquals("I live Lviv", StringManager.remove(text));
    }

    @Test
    void isEmpty() throws Exception {
        boolean isEmpty = false;
        try {
            StringManager.isEmpty("");
        } catch (Exception e) {
            if (e.getMessage().equals("Empty string")) {
                isEmpty = true;
            }
        }
        Assert.assertTrue(isEmpty);
    }
}
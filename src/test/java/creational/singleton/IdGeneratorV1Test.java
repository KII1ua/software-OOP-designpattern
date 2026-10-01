package creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdGeneratorV1Test {
    IdGeneratorV1 first = IdGeneratorV1.getInstance();
    IdGeneratorV1 second = IdGeneratorV1.getInstance();

    @Test
    @DisplayName("두 객체가 서로 같다")
    public void equalInstance() {

        assertSame(first, second);
    }

    @Test
    @DisplayName("nextId를 호출하면 2가된다.")
    public void isTwoId() {
        first.nextId();

        assertEquals(2, first.getId());
    }
}
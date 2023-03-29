import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZoneTest {

    Zone a = new Zone("asd");
    Slot b = new Slot("a");


    @Test
    void nameShouldBeEntered ()
    {
        assertFalse(this.a.getName() == "" , "you must enter a name ");
    }


    }



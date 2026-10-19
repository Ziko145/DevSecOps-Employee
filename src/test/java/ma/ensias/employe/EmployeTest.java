package ma.ensias.employe;

import ma.ensias.employe.entite.Employe;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeTest {

    @Test
    void testEmploye() {
        Employe emp = new Employe(1, "Benali", 25);
        assertEquals(1, emp.getId());
        assertEquals("Benali", emp.getName());
        assertEquals(25, emp.getAge());
    }
}

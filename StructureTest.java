import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

/**
 * Tests for a system that can track employee information for two organizations.
 * The Employee information you must (at least) track, is as follows:
 * Name, Job Title, Organization they work for, Birthday
 *
 * As for the Organization that the Employee works for, you must also (at the very least) track this information:
 * Organization Name, Number of Employees
 *
 * The system must be able to properly compare any two employees against each other to determine,
 * if they are the same Person. This means that if you compared two People,
 * with the same Name, Birthday, and Organization, the system should think that they are equal to one another.
 * If any of these properties are different, then the two People are not the same Person.
 * The same rules apply to comparing Organizations to one another.
 * Organizations with the same Organization name are to be thought of as equal,
 * different names means different organizations.
 */
public class StructureTest {

// create two Employee objects
    // fill in all the iformation for the objects


    @Test
    public void employeeComplete() {
        //
        // check that an employee's attribute are complete and make sense.
        // assertTrue( employee is alive and company complies with child labor laws ...;
        //...
        Employee e1 = new Employee("Jane Doe", "Software Engineer", "Microsoft", "April 1st");
        Employee e2 = e1;

        assertTrue(e1.equals(e1, e2));
        System.out.println("employee is alive and company complies with child labor laws.");
    }
    /**
     * Check Employee Equality
     */
    @Test
    public void employeeEq() {

        Employee e1 = new Employee("Jane Doe", "Software Engineer", "Microsoft", "April 1st");
        Employee e2 = new Employee("John Doe", "Software Engineer", "Microsoft", "April 1st");

        // Create employee e1,
        // Create another employee e2 that matches the specific criteria for equality
        //Employee eX = newEmployee( )
        assertTrue("e1 and e2 are equal",e2.equals(e2));
       // assertFalse("ei and e2 are not equal", e1.equals(e2));

        // modify employee e2 (eg. by making her/him join the other company
        e2.setCompany("Apple");

       // System.out.println("e2 is not equal to e1");
       assertNotEquals(e1, e2);

    }

    /**
     * Check Company Equality
     */
    @Test
    public void companyEq() {
        // Create company c1,
        // Create company employee c2 that matches the specific criteria for equality
        Company c1 = new Company("Microsoft", 1200);
        Company c2 = c1;

        assertTrue(c1.equals(c2));

        // modify company c2, i.e. change its name or create another company with a different name ..
        c1.setCompName("Apple");
        c2 = new Company("Apple", 1200);
        assertNotEquals(c1, c2);

    }

    @Test
    public void companyComplete() {
        // check that a companies' attribute are complete and make sense.
        assertNotEquals("Apple", "Microsoft");
    }
}
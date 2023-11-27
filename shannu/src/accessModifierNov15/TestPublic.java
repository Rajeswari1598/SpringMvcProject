package accessModifierNov15;

import org.junit.jupiter.api.Test;

import assignmentModifiersNov15.PublicClass;
import assignmentModifiersNov15.PublicInherit;
import methodsNov7day4.Person;

public class TestPublic {

	@Test
	public void test() {
		PublicInherit inherit = new PublicInherit();
		inherit.publicAcess();
	}
}

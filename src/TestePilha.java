import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestePilha {

	@Test
	public void pilhaVazia() {
		Pilha p = new Pilha();
		assertTrue(p.estaVazia());
		assertEquals(0, p.tamanho());
	}

}

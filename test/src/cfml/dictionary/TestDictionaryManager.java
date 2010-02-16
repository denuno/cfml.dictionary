package cfml.dictionary;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class TestDictionaryManager {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetConfiguredDictionaries() {
		DictionaryManager.initDictionaries();
		String[][] fun = DictionaryManager.getConfiguredDictionaries();
		assertNotNull(fun);
	}

	@Test
	public void testGetDictionary() {
		DictionaryManager.initDictionaries();
		SyntaxDictionary fun = DictionaryManager.getDictionary("CF_DICTIONARY");
		System.err.println(fun.filename);
		Set wee = fun.getAllTags();
		assertNotNull(fun);
	}

}

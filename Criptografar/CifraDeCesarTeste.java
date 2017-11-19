import criptografar.CifraDeCesar;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Danilo Loschiavo
 */
public class CifraDeCesarTeste {
    
    @Test
    public void testarCifraDeCesar() {
        //Testar criptografar
        assertEquals(CifraDeCesar.criptografar("a", 0), "a");
        assertEquals(CifraDeCesar.criptografar("a", 1), "b");
        assertEquals(CifraDeCesar.criptografar("abc def", 3), "def ghi");
        
        //Testar descriptografar
        assertEquals(CifraDeCesar.descriptografar("a", 0), "a");
        assertEquals(CifraDeCesar.descriptografar("b", 1), "a");
        assertEquals(CifraDeCesar.descriptografar("def ghi", 3), "abc def");
    }

}

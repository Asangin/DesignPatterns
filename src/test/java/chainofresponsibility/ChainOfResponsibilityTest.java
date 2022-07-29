package chainofresponsibility;

import org.junit.jupiter.api.Test;

public class ChainOfResponsibilityTest {

    @Test
    public void testChainOfResponsibility() {
        var body = """
                {"name":"Skryl"}
                """;
        // adding an object matters
        VarificationChain chain = new JsonVarification();
                chain.addToChain(new FieldVarification())
                .addToChain(new ValueVarification());

        chain.checkIn(body);
    }
}

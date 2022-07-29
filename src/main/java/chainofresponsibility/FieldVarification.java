package chainofresponsibility;

public class FieldVarification extends VarificationChain {

    @Override
    public void checkIn(String body) {
        System.out.println("Verify field in body: " + body);
        body.contains("name");
        this.checkNext(body);
    }
    
}

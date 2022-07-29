package chainofresponsibility;

public class JsonVarification extends VarificationChain {

    @Override
    public void checkIn(String body) {
        System.out.println("Verify json body: " + body);
        body.contains("{}");
        this.checkNext(body);
    }
    
}

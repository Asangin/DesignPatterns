package chainofresponsibility;

public class ValueVarification extends VarificationChain {

    @Override
    public void checkIn(String body) {
        System.out.println("Varify value in response body: " + body);
        body.contains("Skryl");
        this.checkNext(body);
    }
    
}

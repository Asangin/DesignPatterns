package chainofresponsibility;

public abstract class VarificationChain {
    private VarificationChain next;

    public VarificationChain addToChain(VarificationChain next) {
        this.next = next;
        return next;
    }

    public abstract void checkIn(String body);

    protected void checkNext(String body) {
        if(next == null) {
            System.out.println("No more checks in a chain");
            return;
        }
        next.checkIn(body);
    }
}

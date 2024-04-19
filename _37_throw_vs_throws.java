class te
{
    void div (int a, int b) throws ArithmeticException{ // for by pass
        if(b==0){
            throw new ArithmeticException();
        }
        else {
            int c = a/b;
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        te t = new te();
        try {
            t.div(20, 0);
        }
        catch (Exception e){
            System.out.println("The value of b is Zero");
        }
    }
}
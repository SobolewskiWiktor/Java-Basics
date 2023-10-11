public class Triangle {
    public double a;
    public double b;
    public double c;

    public Triangle(double newA, double newB, double newC)
    {
        a = newA;
        b = newB;
        c = newC;
    }

    public void heron ()
    {
        double p = (a + b + c) / 2;

        double heron = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.print("area: "+heron+"\n")
    }
    
    public void chechType()
    {
        if(a == b && a == c)
        {
            System.out.print("Równoboczny \n");
        } else if (a == b || a == c || b == c) {
            System.out.print("Równoramienny \n");
        } else{
            System.out.print("Róznoboczny \n");
        }
    };


}
